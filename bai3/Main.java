/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList <giaoDichVang> arrgiaoDichVang = new ArrayList<>();
        ArrayList <giaoDichTienTe> arrgiaoDichTienTe = new ArrayList<>();
        int soGDVang, soGDTienTe;
        double tongTienGDTienTe = 0, trungBinhThanhTien = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số GD vàng: ");
        soGDVang = scanner.nextInt();
        System.out.println("Nhập số GD tiền tệ: ");
        soGDTienTe = scanner.nextInt();
        
        System.out.println("Nhập thông tin GD vàng: ");
        for (int i = 0; i < soGDVang; i++) {
            System.out.println("Giao dịch số "+ (i+1)+ ":");
            giaoDichVang gdVang = new giaoDichVang();
            gdVang.nhapGD();
            arrgiaoDichVang.add(gdVang);
        }
        System.out.println("Nhập thông tin GD ti?n t?: ");
        for (int i = 0; i < soGDTienTe; i++) {
            System.out.println("Giao dịch số "+ (i+1)+ ":");
            giaoDichTienTe gdTienTe = new giaoDichTienTe();
            gdTienTe.nhapGD();
            arrgiaoDichTienTe.add(gdTienTe);
        }
        for (int i = 0; i < arrgiaoDichTienTe.size(); i++) {
            if (arrgiaoDichTienTe.get(i).getTienTe().equalsIgnoreCase("VND")) {
                tongTienGDTienTe += arrgiaoDichTienTe.get(i).getSoLuong() * 
                    arrgiaoDichTienTe.get(i).getDonGia();
            } else if (arrgiaoDichTienTe.get(i).getTienTe().equalsIgnoreCase("USD") || 
                    arrgiaoDichTienTe.get(i).getTienTe().equalsIgnoreCase("EURO")) {
                tongTienGDTienTe += arrgiaoDichTienTe.get(i).getSoLuong() * 
                    arrgiaoDichTienTe.get(i).getDonGia() * arrgiaoDichTienTe.get(i).getTiGia();
            }
        }
        trungBinhThanhTien = tongTienGDTienTe / (arrgiaoDichTienTe.size());
        System.out.println("Trung bình thành tiền của giao dịch ti?n t? = " + trungBinhThanhTien);
        
        System.out.println("các giao dịch ti?n t? có đơn giá > 1 tỷ.: ");
        for (int i = 0; i < arrgiaoDichTienTe.size(); i++) {
            if (arrgiaoDichTienTe.get(i).getDonGia() > 1000000000.0){
                System.out.println(arrgiaoDichTienTe.get(i).toString());
            }
        }
        System.out.println("các giao dịch vàng có đơn giá > 1 tỷ.: ");
        for (int i = 0; i < arrgiaoDichVang.size(); i++) {
            if (arrgiaoDichVang.get(i).getDonGia() > 1000000000.0){
                System.out.println(arrgiaoDichVang.get(i).toString());
            }
        }
    }
}
