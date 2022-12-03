/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author HP
 */
public class sachGiaoKhoa extends Sach{
    private String tinhTrang;
    private int number;
    private double thanhTien;
 
    public sachGiaoKhoa() {
        super();
    }
 
    public sachGiaoKhoa(String tinhTrang, int number) {
        super();
        this.tinhTrang = tinhTrang;
        this.number = number;
    }
 
 
    public String getTinhTrang() {
        return tinhTrang;
    }
 
 
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
 
 
    public int getNumber() {
        return number;
    }
 
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public String tinhTrangSach(int x) {
        switch (number) {
            case 0:
                tinhTrang = "cũ";
                break;
            case 1:
                tinhTrang = "mới";
                break;
            default:
                break;
        }
        return tinhTrang;
    }
     
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
        number = scanner.nextInt();
    }
     
    public String toString() {
        return super.toString() + ", tình trạng sách: " + this.tinhTrangSach(number);
    }
}
