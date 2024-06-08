/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_7;

/**
 *
 * @author NganTTK_PC09494
 */
public class SinhVienBiz_Bai3 extends SinhVienPoly_Bai2 {
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz_Bai3(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSales)/3;
    }
}
