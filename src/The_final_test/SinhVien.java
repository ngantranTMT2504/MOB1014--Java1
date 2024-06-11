/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package The_final_test;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class SinhVien {

    private String tenSinhVien;
    private double diemJava;
    private double diemWeb;

    public SinhVien() {
    }

    public SinhVien(String tenSinhVien, double diemJava, double diemWeb) {
        this.tenSinhVien = tenSinhVien;
        this.diemJava = diemJava;
        this.diemWeb = diemWeb;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        tenSinhVien = sc.nextLine();
        System.out.print("Nhập điểm Java: ");
        diemJava = sc.nextDouble();
        System.out.print("Nhập điểm Web: ");
        diemWeb = sc.nextDouble();
    }

    public float diemTrungBinh() {
        return (float) (diemJava + diemWeb) / 2;
    }

    public String xepLoai() {
        float diemTB = diemTrungBinh();
        if (diemTB >= 9 && diemTB <= 10) {
            return "Xuat sac";
        } else if (diemTB >= 8) {
            return "Gioi";
        } else if (diemTB >= 6.5) {
            return "Kha";
        } else if (diemTB >= 5) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + tenSinhVien + "|điểm trung bình: " + diemTrungBinh() + "|Xếp loại: " + xepLoai());
    }

    public void viTriKhoangTrangDauCuoi(String str) {
        int viTriKhoangTrangDau = str.indexOf(" ");

        int viTriKhoangTrangCuoi = str.lastIndexOf(" ");

        System.out.println("Vị trí khoảng trắng đầu: " + viTriKhoangTrangDau);
        System.out.println("Vị trí khoảng trắng cuối: " + viTriKhoangTrangCuoi);

    }

    public void chuyenChuHOA(String str) {
        System.out.println("Chuỗi in hoa: " + str.toUpperCase());
    }

    public void chuyenChuThuong(String str) {
        System.out.println("Chuỗi thường: " + str.toLowerCase());
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();

        sv.nhap();
        sv.xuat();
        sv.viTriKhoangTrangDauCuoi(sv.tenSinhVien);
        sv.chuyenChuHOA(sv.tenSinhVien);
        sv.chuyenChuThuong(sv.tenSinhVien);
    }
}
