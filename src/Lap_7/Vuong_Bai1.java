/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_7;

/**
 *
 * @author NganTTK_PC09494
 */
public class Vuong_Bai1 extends ChuNhat_Bai1{

    public Vuong_Bai1(double canh) {
        super(canh, canh);
    }
    
    @Override
    public void xuat() {
        System.out.println("Cạnh: "+ super.chieuDai);
        System.out.println("Chu vi hình vuông : "+ super.getChuVi());
        System.out.println("Diện tích hình vuông : "+ super.getDienTich());
    }
    
}
