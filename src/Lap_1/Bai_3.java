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
Nhập từ bàn phím cạnh của một khối lập phương
Tính và xuất thể tích của khối chữ nhật 
*/
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double x = sc.nextFloat();
        double theTich = Math.pow(x,3);
        System.out.println("Thể tích : " + theTich);                      
    }
}
