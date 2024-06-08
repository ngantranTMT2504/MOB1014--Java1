/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_6;

import java.util.ArrayList;

/**
 *
 * @author NganTTK_PC09494
 */
public class main_Bai3 {

    public static void main(String[] args) {

        ArrayList<SinhVien_Bai3> list = new ArrayList<>();

        SinhVien_Bai3 sv = new SinhVien_Bai3();
        System.out.println("Mời nhập 5 sinh viên");
        
        for(int i = 0; i < 5; i++) {
            sv.nhap();
            list.add(sv);
        }
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Sinh viên "+ (i+1));
            sv.xuat();
        }
    }

}
