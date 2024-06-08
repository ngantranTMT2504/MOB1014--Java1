/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_6;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class SanPham_bai2 {
    String tenSp;
    double donGia;
    String hang;
    
    
    Scanner sc = new Scanner(System.in);
    
    public void nhap() {
        SanPham_bai2 sp = new SanPham_bai2();
        System.out.print("Nhập tên sản phẩm: ");
        String tenSp = sc.nextLine();
        sp.tenSp = tenSp;
        System.out.print("Nhập giá sản phẩm: ");
        double donGia = sc.nextDouble();
        sp.donGia = donGia;
        sc.nextLine();
        System.out.print("Nhập tên hãng của sản phẩm: ");
        String hang = sc.nextLine();  
        sp.hang = hang;
    }
    
    public void xuat() {
        SanPham_bai2 sp = new SanPham_bai2();
        System.out.println("Tên sản phẩm: "+ sp.tenSp);
        System.out.println("Giá sản phẩm: "+ sp.donGia);
        System.out.println("Hãng: "+ sp.hang);
    }
}
