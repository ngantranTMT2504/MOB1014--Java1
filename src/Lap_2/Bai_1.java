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
Tính tiền karaoke
 */
public class Bai_1 {

    public static void main(String[] args) {
        try {
            float gioBatDau, gioKetThuc, thanhTien, tienGiam, tienThanhToan;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Nhập giờ bắt đầu: ");
            gioBatDau = sc.nextFloat();
            System.out.print("Nhập giờ kết thúc: ");
            gioKetThuc = sc.nextFloat();

            if (gioBatDau < 12 || gioKetThuc > 23) {
                System.out.println("QUán chỉ hoạt động từ 12 - 23 giờ");
                return;
            }
            float soGio = gioKetThuc - gioBatDau;
            thanhTien = soGio * 150000;
            if (soGio <= 3) {
                tienGiam = 0;
                tienThanhToan = thanhTien;
            } else {
                tienGiam = (float) ((soGio - 3) * (150000 * 0.4));
                tienThanhToan = thanhTien - tienGiam;
            }
            System.out.println("Số giờ hát karaoke : " + soGio);
            System.out.println("Thành tiền : " + thanhTien);
            System.out.println("Tiền giảm : " + tienGiam);
            System.out.println("Tiền cần thanh toán: " + tienThanhToan);
        } catch (Exception e) {
            System.out.println("Vui lòng nhập đúng giờ bắt đầu, giờ kế thúc!!");
        }
    }
}
