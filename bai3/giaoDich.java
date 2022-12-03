/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author HP
 */
public class giaoDich {
    private String maGD;
    private String ngayGD;
    private double donGia;
    private int soLuong;

    Scanner scanner = new Scanner(System.in);
    
    public giaoDich() {
        super();
    }

    public giaoDich(String maGD, String ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaGD() {
        return maGD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapGD () throws ParseException {
        System.out.print("Nhập mã GD: ");
        maGD = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date strDate = formatter.parse(ngayGD);
        System.out.print("Nhập ngày GD: ");
        ngayGD = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();
    }
    
    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "Mã GD: " + this.maGD + "\tNgày GD: " + this.ngayGD +"\tĐơn giá: " + this.donGia + "\tSố lượng: " + this.soLuong;
    }

    
}
