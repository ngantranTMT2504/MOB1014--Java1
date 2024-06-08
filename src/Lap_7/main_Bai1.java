/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class main_Bai1 {

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            double chieuDai = 0;
            double chieuRong = 0;

            do {
                System.out.print("Nhập chiều dài hình chữ nhật thứ 1 : ");
                chieuDai = sc.nextDouble();
                if (chieuDai <= 0) {
                    System.out.println("Chiều dài phải  > 0");
                    continue;
                }
                System.out.print("Nhập chiều rộng hình chữ nhật thứ 1 : ");
                chieuRong = sc.nextDouble();
                if (chieuRong <= 0) {
                    System.out.println("Chiều dài phải  > 0");
                }
            } while (chieuDai <= 0 || chieuRong <= 0);
            ChuNhat_Bai1 chuNhat1 = new ChuNhat_Bai1(chieuDai, chieuRong);

            do {
                System.out.print("Nhập chiều dài hình chữ nhật thứ 2 : ");
                chieuDai = sc.nextDouble();
                if (chieuDai <= 0) {
                    System.out.println("Chiều dài phải  > 0");
                    continue;
                }
                System.out.print("Nhập chiều rộng hình chữ nhật thứ 2 : ");
                chieuRong = sc.nextDouble();
                if (chieuRong <= 0) {
                    System.out.println("Chiều dài phải  > 0");
                }
            } while (chieuDai <= 0 || chieuRong <= 0);
            ChuNhat_Bai1 chuNhat2 = new ChuNhat_Bai1(chieuDai, chieuRong);

            do {
                System.out.print("Nhập cạnh hình vuông : ");
                chieuDai = sc.nextDouble();
                if (chieuDai <= 0) {
                    System.out.println("Cạnh phải  > 0");
                }
                chieuRong = chieuDai;
            } while (chieuDai <= 0 || chieuRong <= 0);
            Vuong_Bai1 hinhVuong = new Vuong_Bai1(chieuRong);

            System.out.println("------Hình chữ nhật thứ 1-------");
            chuNhat1.xuat();
            System.out.println("------Hình chữ nhật thứ 2-------");
            chuNhat2.xuat();
            System.out.println("-----------Hình vuông-----------");
            hinhVuong.xuat();

        } catch (Exception e) {
            System.out.println("Lỗi!Nhập không đúng đình dạng");
        }

    }
}
