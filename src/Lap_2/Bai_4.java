/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_2;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class Bai_4 {

    public static void main(String[] args) {
        try {
            int khoiThi;
            float a, b, c;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập khối thi (1,2) : ");
            khoiThi = sc.nextInt();
            if (khoiThi < 1 || khoiThi > 2) {
                System.out.println("Lỗi! Mời nhập đúng khối thi 1 hoặc 2!");
                return;
            }
            if (khoiThi == 1) {
                System.out.print("Nhập điểm toán: ");
                a = sc.nextFloat();
                System.out.print("Nhập điểm lý: ");
                b = sc.nextFloat();
                System.out.print("Nhập điểm hóa: ");
                c = sc.nextFloat();
                if((a > 10 || a < 0) || (b > 10 || b < 0) || (b > 10 || b < 0)) {
                    System.out.println("Nhập điểm sai! Vui lòng nhập điểm từ 0 - 10");
                    return;
                }
                if (a + b + c >= 21 && (a >= 7 && b >= 7 && c >= 7)) {
                    System.out.println("Chúc mừng bạn đậu ngành CNTT");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời xét nguyện vọng 2");
                }
            }
            if (khoiThi == 2) {
                System.out.print("Nhập điểm toán: ");
                a = sc.nextFloat();
                System.out.print("Nhập điểm hóa: ");
                b = sc.nextFloat();
                System.out.print("Nhập điểm sinh: ");
                c = sc.nextFloat();
                if((a > 10 || a < 0) || (b > 10 || b < 0) || (b > 10 || b < 0)) {
                    System.out.println("Nhập điểm sai! Vui lòng nhập điểm từ 0 - 10");
                    return;
                }
                if (a + b + c >= 24 && (a >= 8 && b >= 8 && c >= 8)) {
                    System.out.println("Chúc mừng bạn đậu ngành bác sĩ");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời xét nguyện vọng 2");
                }
            }
        } catch (Exception e) {
            System.out.println("Nhập thông tin sai!Vui lòng kiểm tra lại!");
        }

    }
}
