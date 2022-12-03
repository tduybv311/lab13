/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class chuyenXe {
    private String maChuyen;
    private String hoTenTX;
    private String soXe;
    private double doanhThu;

    Scanner scanner = new Scanner(System.in);
    
    public chuyenXe() {
        super();
        this.maChuyen = "";
        this.hoTenTX = "";
        this.soXe = "";
        this.doanhThu = 0;
    }

    public chuyenXe(String maChuyen, String hoTenTX, String soXe, double doanhThu) {
        super();
        this.maChuyen = maChuyen;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public String getMaChuyen() {
        return maChuyen;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
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
        return "Mã số chuyến: " + this.maChuyen + ", họ tên tài xế: " + this.hoTenTX
                + ", số xe: " + this.soXe + ", doanh thu: " + this.doanhThu;
    }
    public void nhapThongTinChuyenXe() {
            System.out.print("Nhập mã số chuyến: ");
            maChuyen = scanner.nextLine();
            System.out.print("Nhập họ tên tài xế: ");
            hoTenTX = scanner.nextLine();
            System.out.print("Nhập số xe: ");
            soXe = scanner.nextLine();
            System.out.print("Nhập doanh thu: ");
            doanhThu = scanner.nextDouble();scanner.nextLine();     
        }
    
}
