/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.text.ParseException;

/**
 *
 * @author HP
 */
public class giaoDichTienTe extends giaoDich{
    private double tiGia, thanhTien;
    private String tienTe;
    private int number;

    public giaoDichTienTe() {
        super();
    }

    public giaoDichTienTe(double tiGia, String tienTe, int number, double thanhTien) {
        super();
        this.tiGia = tiGia;
        this.tienTe = tienTe;
        this.number = number;
        this.thanhTien = thanhTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public String getTienTe() {
        return tienTe;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public void setTienTe(String tienTe) {
        this.tienTe = tienTe;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
    public void nhapGD () throws ParseException{
        super.nhapGD();
        System.out.println("Nhập tỉ giá: ");
        tiGia = scanner.nextDouble();
        System.out.println("Nhập loại tiền tệ(VND/USD/EURO)");
        number = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+ "\tTỉ giá: " + this.tiGia + "\t Tiền tệ: " + this.tienTe; 
    }
    
    
}
