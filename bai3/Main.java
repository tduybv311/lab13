/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <giaoDichVang> arrgiaoDichVang = new ArrayList<>();
        ArrayList <giaoDichTienTe> arrgiaoDichTienTe = new ArrayList<>();
        int soGDVang, soGDTienTe;
        double tongTienGDVang = 0, tongTienGDTienTe = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số GD vàng: ");
        soGDVang = scanner.nextInt();
        System.out.println("Nhập số GD tiền tệ: ");
        soGDTienTe = scanner.nextInt();
        
        System.out.println("Nhập thông tin GD vàng: ");
        for (int i = 0; i < soGDVang; i++) {
            System.out.println("Giao dịch số "+ (i+1)+ ":");
            giaoDichVang gdVang = new giaoDichVang();
            giaoDichVang.nhapGD();
            arrgiaoDichVang.add(gdVang);
        }
    }
}
