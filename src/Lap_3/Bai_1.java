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
Kiểm tra số nguyên tố
 */
public class Bai_1 {

    public static void main(String[] args) {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Vui lòng nhập n là số lớn hơn 0");
                return;
            }
            if (n >= 0 && n < 2) {
                System.out.println("N không phải số nguyên tố");
                return;
            }
            double sqrN = Math.sqrt(n);
            for (int i = 2; i <= sqrN; i++) {
                if (n > 2 && n % i == 0) {
                    System.out.println("N không phải số nguyên tố");
                    return;
                }
            }
            System.out.println("N là số nguyên tố");
        } catch (Exception e) {
            System.out.println("LỖi!N phải là một số nguyên dương");
        }
    }
}
