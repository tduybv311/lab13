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
public class giaoDichVang extends giaoDich {
    private String loaiVang;
    private double thanhTien;
    
    public giaoDichVang(String loaiVang, double thanhTien) {
        super();
        this.loaiVang = loaiVang;
        this.thanhTien = thanhTien;
    }

    public giaoDichVang() {
        super();
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public void nhapGD () throws ParseException{
            super.nhapGD();
            System.out.println("Nhập loại vàng: ");
            loaiVang = scanner.nextLine();
    }
    
    @Override
    public String toString() {
        return super.toString() +"\tloại vàng: " + this.loaiVang; 
    }
    
    
}
