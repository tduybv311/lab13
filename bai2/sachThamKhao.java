/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author HP
 */
public class sachThamKhao extends Sach {
    private double thue, thanhTien;
 
    public sachThamKhao() {
        super();
    }
 
    public sachThamKhao(double thue) {
        super();
        this.thue = thue;
    }
 
    public double getThue() {
        return thue;
    }
 
    public void setThue(double thue) {
        this.thue = thue;
    }
 
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhập thuế: ");
        thue = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thuế: " + this.thue;
    }
}
