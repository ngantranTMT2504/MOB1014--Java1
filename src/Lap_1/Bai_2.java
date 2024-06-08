/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_1;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
/*
Nhập từ bàn phím 2 cạnh của hình chữ nhật
Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.
*/
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất hình chữ nhật: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh thứ hai hình chữ nhật: ");
        double b = sc.nextDouble();
        //Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = (a+b)*2;
        double dienTich = a*b;
        double min = Math.min(a, b);
        System.out.println("Chu vi : " + chuVi);
        System.out.println("Diện tích : " + dienTich);
        System.out.println("Cạnh nhỏ nhất : " + min);
    }  
}
