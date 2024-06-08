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
public class main_bai2 {

    public static void main(String[] args) {
        ArrayList<SanPham_bai2> list = new ArrayList<>();

        SanPham_bai2 sp = new SanPham_bai2();
        System.out.println("Mời nhập 5 sản phẩm: ");
        try {
            for (int i = 0; i < 5; i++) {
                sp.nhap();
                list.add(sp);
            }

        } catch (Exception e) {
            System.out.println("Mời nhập thông tin chính xác");
        }

        for (int i = 0; i < 5; i++) {
            if (list.get(i).hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
