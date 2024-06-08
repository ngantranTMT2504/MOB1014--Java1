/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class Bai_1 {
    public static void main(String[] args) {
        try {
        ArrayList<Double> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Mời bạn nhập số thực: ");
            Double x = sc.nextDouble();
            list.add(x);
            System.out.print("Bạn có muốn nhập thêm Y/N: ");
            sc.nextLine();
            if(sc.nextLine().equalsIgnoreCase("Y"))
                continue;
            else
                break;
        }
        System.out.println("Mảng số thực vừa nhập");
        double tong = 0;
        for(Double x : list) {
            tong+=x;
            System.out.println(x);
        }
        System.out.println("Tổng = " + tong);
        
        } catch (Exception e) {
            System.out.println("Lỗi! Bạn nhận thông tin sai");
        }
    }
}
