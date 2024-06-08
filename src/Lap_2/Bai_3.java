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
/*
Chức năng đổi tiền
 */
public class Bai_3 {
    public static void main(String[] args) {
        try {
            int tien;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mênh tiền cần đổi: ");
            tien = sc.nextInt();
            if (tien < 1) {
                System.out.println("Số tiền phải lớn hơn 0");
                return;
            }
            if (tien == 500000 || tien == 500) {
                System.out.println("2 tờ 200 ngàn và 1 tờ 100 ngàn");
            } else if (tien == 200000 || tien == 200) {
                System.out.println("2 tờ 100 ngàn");
            } else if (tien == 100000 || tien == 100) {
                System.out.println("2 tờ 50 ngàn");
            } else if (tien == 50000 || tien == 50) {
                System.out.println("2 tờ 20 ngàn và 1 tờ 10 ngàn");
            } else if (tien == 20000 || tien == 20) {
                System.out.println("2 tờ 10 ngàn");
            } else if (tien == 10000 || tien == 10) {
                System.out.println("2 tờ 5 ngàn");
            } else if (tien == 5000 || tien == 5) {
                System.out.println("2 tờ 2 ngàn và 1 tờ 1 ngàn");
            } else if (tien == 2000 || tien == 2) {
                System.out.println("2 tờ 1 ngan");
            } else if (tien == 1000 || tien == 1) {
                System.out.println("2 tờ 500");
            } else {
                System.out.println("Không có mệnh giá để đổi!Tiền đổi phải là 1 tờ tiền chẵn");
            }
        } catch (Exception e) {
            System.out.println("Tiền đổi phải là số nguyên!");
        }
    }
}
