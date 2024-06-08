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
Sắp xếp sinh viên tăng dần theo điểm
 */
public class Bai_4 {

    public static void swap(float[] a, int i, int j) {
        float temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số lượng sinh viên:");
            n = sc.nextInt();
            if(n < 1) {
                System.out.println("Số luojng sinh viên phải là số nguyên lớn hơn 0");
                return;
            }
            String[] hoTen = new String[n];
            float[] diem = new float[n];
            String[] hocLuc = new String[n];

            //input mảng sinh viên
            int i, j;
            for (i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println("Sinh viên " + (i + 1));
                System.out.print("Họ tên: ");
                hoTen[i] = sc.nextLine();
                System.out.print("Điểm: ");
                diem[i] = sc.nextFloat();
                if (diem[i] < 5) {
                    hocLuc[i] = "Yếu";
                } else if (diem[i] >= 5 && diem[i] < 6.5) {
                    hocLuc[i] = "Trung bình";
                } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                    hocLuc[i] = "Khá";
                } else if (diem[i] >= 7.5 && diem[i] < 9) {
                    hocLuc[i] = "Giỏi";
                } else if (diem[i] >= 9 && diem[i] <= 10) {
                    hocLuc[i] = "Xuất sắc";
                }
            }
            //output mảng sinh viên vừa nhập
            System.out.println("Mảng vừa nhập");
            for (i = 0; i < n; i++) {
                System.out.println("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", Học lực: " + hocLuc[i]);
            }
            //Sắp xếp tăng dần theo điểm
            for (i = 0; i < n - 1; i++) {
                for (j = i + 1; j < n; j++) {
                    if (diem[i] > diem[j]) {
                        swap(diem, i, j);
                        swap(hoTen, i, j);
                        swap(hocLuc, i, j);
                    }
                }
            }
            //Output mảng sinh viên sau khi sắp xếp
            System.out.println("Mảng sau khi sắp xếp");
            for (i = 0; i < n; i++) {
                System.out.println("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", Học lực: " + hocLuc[i]);
            }
        } catch (Exception e) {
            System.out.println("Lỗi!Vui lòng nhập đúng định dạng của từng thông tin");
        }
    }
}
