/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_7;

/**
 *
 * @author NganTTK_PC09494
 */
public class SinhVienIT_Bai3 extends SinhVienPoly_Bai2{
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT_Bai3(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem() {
        return (2*diemJava + diemCss + diemHtml)/4;
    }
}
