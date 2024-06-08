/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_6;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class Bai_1 {
    public static void main(String[] args) {
        String hoTen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên đầy đủ");
        hoTen = sc.nextLine();
        
        int indexHo = hoTen.indexOf(" ");
        
        int indexTen = hoTen.lastIndexOf(" ");
        
        String ho = hoTen.substring(0,indexHo).toUpperCase();
        String hoLot = hoTen.substring(indexHo, indexTen);
        String ten = hoTen.substring(indexTen).toUpperCase();
        System.out.println("Họ : "+ho);
        System.out.println("Tên lót : " + hoLot);
        System.out.println("Tên: " + ten);
       }
}
