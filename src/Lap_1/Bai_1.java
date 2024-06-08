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
Nhập họ và tên sinh viên, điểm trung bình 
Xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.
*/
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();
        System.out.println(hoTen + " " + diemTB + " điểm");
    }
}
