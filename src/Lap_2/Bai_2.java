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
Tính tiền điện
 */
public class Bai_2 {

    public static void main(String[] args) {
        try {
            int soKwh;
            float tienDien;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số kwh điện sử dụng: ");
            soKwh = sc.nextInt();

            if (soKwh < 0) {
                System.out.println("Só kwh điện phải lớn hơn 0!");
                return;
            }

            if (soKwh >= 0 && soKwh <= 50) {
                tienDien = soKwh * 1678;
            } else if (soKwh > 50 && soKwh <= 100) {
                tienDien = (50 * 1678) + (soKwh - 50) * 1734;
            } else if (soKwh > 100 && soKwh <= 200) {
                tienDien = (50 * 1678) + (50 * 1734) + (soKwh - 100) * 2014;
            } else if (soKwh > 200 && soKwh <= 300) {
                tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (soKwh - 200) * 2536;
            } else if (soKwh > 300 && soKwh <= 400) {
                tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (100 * 2536) + (soKwh - 300) * 2834;
            } else {
                tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (100 * 2536) + (100 * 2834) + (soKwh - 400) * 2927;
            }

            System.out.println("Tiền điện : " + tienDien);
        } catch (Exception e) {
            System.out.println("Lỗi!Số kwh điện phải là số nguyên và không chứa kí tự");
        }
    }
}
