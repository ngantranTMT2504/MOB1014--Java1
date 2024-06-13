/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class XPoly {

    Scanner sc = new Scanner(System.in);

    //Bai 1
    public static final double sum(double... x) {
        double tong = 0;
        for (double num : x) {
            tong += num;
        }

        return tong;
    }

    public void chucNang1() {
        int n;
        System.out.print("Nhập số lượng số muốn tính tổng:");
        n = sc.nextInt();
        double so[] = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập số: ");
            so[i] = sc.nextDouble();
        }
        System.out.println("Tổng : "+ XPoly.sum(so));
    }

    //Bai 2
    public static final double min(double... x) {
        double min = x[0];
        for (double num : x) {
            min = Math.min(min, num);
        }

        return min;
    }

    public static final double max(double... x) {
        double max = x[0];
        for (double num : x) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
    
    public void chucNang2() {
        int n;
        System.out.print("Nhập số lượng số muốn tìm min, max:");
        n = sc.nextInt();
        double so[] = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập số: ");
            so[i] = sc.nextDouble();
        }
        System.out.println("Max : "+ XPoly.max(so));
        System.out.println("Min : "+ XPoly.min(so));
    }

    //Bai 3
    public static final String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);

            words[i] = upperFirstChar + words[i].substring(1);
        }
        String ss = String.join(" ", words);
        return ss;
    }
    
    public void chucNang3() {
            System.out.println("Nhập chuỗi muốn In hoa: ");
            String s  = sc.nextLine();
            System.out.println("Chuỗi in hoa chữ cái đầu: " + XPoly.toUpperFirstChar(s));
    }

    //Bai 4
    public void menu() {
        try {

            while (true) {
                System.out.println("===========================================");
                System.out.println("1. Tính tổng ");
                System.out.println("2. Tính min, max");
                System.out.println("3. In Hoa chữ cái đầu");
                System.out.println("0.Thoát chương trình");
                System.out.println("===========================================");

                int luaChon;
                System.out.print("Bạn muốn chọn chức năng nào : ");
                luaChon = sc.nextInt();

                switch (luaChon) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        chucNang1();
                        break;
                    case 2:
                        chucNang2();
                        break;
                    case 3:
                        chucNang3();
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Mời chọn chức năng 1 - 3");
                        break;
                }

                sc.nextLine();
                String tiepTuc;
                System.out.print("Bạn muốn tiếp tục chương trình không Y/N:");
                tiepTuc = sc.nextLine();
                if (tiepTuc.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi!Nhập không đúng đinh dạng");
        }

    }
    
    public static void main(String[] args) {
        XPoly x = new XPoly();
        x.menu();
    }

}
