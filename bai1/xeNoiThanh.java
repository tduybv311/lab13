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
public class xeNoiThanh extends chuyenXe{
    private String soTuyen;
    private double soKMdiduoc;

    
    
    public xeNoiThanh() {
        super();
    }

    public xeNoiThanh(String soTuyen, Long soKMdiduoc) {
        super();
        this.soTuyen = soTuyen;
        this.soKMdiduoc = soKMdiduoc;
    }

    public double getSoKMdiduoc() {
        return soKMdiduoc;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoKMdiduoc(Long soKMdiduoc) {
        this.soKMdiduoc = soKMdiduoc;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }
    
    public Scanner getScanner() {
        return scanner;
    }
 
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
            return super.toString() + ", số tuyến: " + this.soTuyen + 
                ", số km đi được: " + this.soKMdiduoc;    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe();   // gọi hàm nhapThongTinChuyenXe() của lớp ChuyenXe
        System.out.print("Nhập số tuyến: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhập số km đi được: ");
        soKMdiduoc = scanner.nextDouble();scanner.nextLine();
    }
}
