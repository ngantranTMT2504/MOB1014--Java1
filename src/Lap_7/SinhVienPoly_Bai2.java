/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_7;

/**
 *
 * @author NganTTK_PC09494
 */
public abstract class SinhVienPoly_Bai2 {

    public String hoTen;
    public String nganh;

    public SinhVienPoly_Bai2(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();

        if (diem < 5) {
            return "Yeu";
        } else if (diem >= 5 && diem < 6.5) {
            return "Trung Binh";
        } else if (diem >= 6.5 && diem < 7.5) {
            return "Kha";
        } else if (diem >= 7.5 && diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    
    public void xuat() {
        System.out.println("Họ tên : " + hoTen + "| Ngành : "+ nganh + " | Điểm : " + getDiem() + " | Học lực : " + getHocLuc());
    }
}
