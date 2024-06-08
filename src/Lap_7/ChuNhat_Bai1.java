/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_7;

/**
 *
 * @author NganTTK_PC09494
 */
public class ChuNhat_Bai1 {
    public double chieuDai;
    public double chieuRong;

    public ChuNhat_Bai1(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public double getChuVi() {
        return (chieuDai + chieuRong)*2;
    }
    
    public double getDienTich() {
        return chieuDai * chieuRong;
    }
    
    public void xuat() {
        System.out.println("Chiều dài: "+ chieuDai);
        System.out.println("Chiều rộng: "+ chieuRong);
        System.out.println("Chu vi : "+ getChuVi());
        System.out.println("Diện tích: "+ getDienTich());
    }
    
}
