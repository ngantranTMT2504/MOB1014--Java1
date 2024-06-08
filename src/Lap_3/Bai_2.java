/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_3;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
/*
Xuất ra bảng cửu chương
 */
public class Bai_2 {
    public static void main(String[] args) {
        try {
            int x;
            Scanner sc = new Scanner(System.in);
            System.out.print("Bạn muốn in bảng cửu chương mấy :");
            x = sc.nextInt();
            if (x < 1 || x > 10) {
                System.out.println("Vui lòng chọn từ 1 - 10");
                return;
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(x + "x" + i + "=" + (x * i));
            }
        } catch (Exception e) {
            System.out.println("Lỗi! Vui lòng nhập một số nguyên từ 1 - 10");
        }
    }
}
