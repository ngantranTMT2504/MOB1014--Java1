/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_4;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class Bai3_SanPham {

    String tenSp;
    double donGia;
    double giamGia;

    public Bai3_SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Bai3_SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        giamGia = 0;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }

    private double thueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm : " + tenSp);
        System.out.println("Đơn giá : " + donGia);
        System.out.println("Giảm giá : " + giamGia);
        System.out.println("Thuế nhập khẩu : " + thueNhapKhau());
    }

    public static void main(String[] args) {
        Bai3_SanPham sp = new Bai3_SanPham("Sam sung", 100000);
        sp.xuat();
    }
}
