/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
/*
Nhập vào tên sản phẩm, đơn giá, màu sắc
Biết Số lượng: sinh ngẫu nhiên trong khoảng (5 – 20)
Giảm giá: số ngẫu nhiên trong khoảng (10000 - 50000)
Tính thành tiền = số lượng * đơn giá
Tiền phải trả = thành tiền – giảm giá
Hiển thị lên màn hình:
- Tên sản phẩm
- Số lượng
- Đơn giá
- Màu sắc
- Giảm giá
- Thành tiền
- Tiền giảm
- Tiền thanh toán
*/
public class Bai_5 {
    public static void main(String[] args) {
        String tenSp, mauSac;
        int donGia;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá:  ");
        donGia = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập màu sắc: ");
        mauSac = sc.nextLine();
        
        Random rd = new Random();
        //Random trong khoảng xác định (max - min) + 1) + min
        //Số lượng
        int soLuong = rd.nextInt((20-5)+1) + 5;   //từ 5-20
        //Giảm giá 
        int giamGia = rd.nextInt((50000-10000)+1) + 10000;   //từ 10000 - 50000
        //Thành tiền
        int thanhTien = soLuong * donGia;
        //Tiền phải trả
        int tienPhaiTra = thanhTien - giamGia;
        
        System.out.println("-Tên sản phẩm : " + tenSp);
        System.out.println("-Số lượng : " + soLuong);
        System.out.println("-Màu sắc : " + mauSac);
        System.out.println("-Giảm giá : " + giamGia);
        System.out.println("-Thành tiền : " + thanhTien);
        System.out.println("-Tiền giảm : " + giamGia);
        System.out.println("-Tiền thanh toán : " + tienPhaiTra);                        
    }    
}
