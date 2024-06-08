/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class SanPham_Bai3 {
    private String ten;
    private double gia;
    
    Scanner sc = new Scanner(System.in);
    ArrayList<SanPham_Bai3> list = new ArrayList<>();

    public SanPham_Bai3() {}

    public SanPham_Bai3(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void nhap() {
        while (true) {
            SanPham_Bai3 sp = new SanPham_Bai3();
            System.out.print("Nhập tên sản phẩm : ");
            sp.ten = sc.nextLine();
            System.out.print("Nhập giá: ");
            sp.gia = sc.nextDouble();
            list.add(sp);

            sc.nextLine();
            String tiepTuc;
            System.out.print("Bạn muốn nhập tiếp không Y/N:");
            tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }
    
    public void xuat() {
        System.out.println("Mảng sản phẩm vừa nhập");
        for(SanPham_Bai3 x : list) {
            System.out.println(x.ten + ", " + x.gia);
        }
    }
    
    public void sapXepTheoGia() {
        Comparator<SanPham_Bai3> comp = new Comparator<>() {
            @Override
            public int compare(SanPham_Bai3 sp1, SanPham_Bai3 sp2) {
                if(sp1.gia > sp2.gia)
                    return 1;
                else if(sp1.gia < sp2.gia)
                    return -1;
                else
                    return 0;
            }
        };
        Collections.sort(list, comp.reversed());
        xuat();
    }
    
    public void xoaTheoTen() {
        String tim;
        int index = -1;
        System.out.println("Nhập tên sản phẩm muốn xóa: ");
        tim = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).ten.equalsIgnoreCase(tim)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("Đã xóa sản phẩm " + list.remove(index).ten);
        }
    }
    
    public void giaTrungBinh() {
        double ketQua = 0;
        double tong = 0;
        
        for(int i = 0; i < list.size(); i++) {
            tong+= list.get(i).gia;
        }
        
        ketQua = tong/list.size();
        System.out.println("Giá trung bình các sản phẩm : " + ketQua);
    }
    
    public void menu() {
        System.out.println("***************MENU***************");
        System.out.println("==================================");
        System.out.println("1. Nhập danh sách sản phẩm        ");
        System.out.println("2. Xuất danh sách sản phẩm        ");
        System.out.println("3. Sắp xếp giảm dần theo giá      ");
        System.out.println("4. Tìm và xóa sản phẩm theo tên   ");
        System.out.println("5. Giá trung bình                 ");
        System.out.println("6. Kết thúc                       ");
        System.out.println("***********************************");     
    }
    public static void main(String[] args) {
        try {
        SanPham_Bai3 sp = new SanPham_Bai3();
        
        while(true){
            sp.menu();
            
            int luaChon;
            Scanner sc = new Scanner(System.in);
            System.out.print("Bạn muốn chọn chức năng nào : ");
            luaChon = sc.nextInt();
            
            switch(luaChon) {
                case 1:
                    sp.nhap();
                    break;
                case 2:
                    sp.xuat();
                    break;
                case 3:
                    sp.sapXepTheoGia();
                    break;
                case 4:
                    sp.xoaTheoTen();
                    break;
                case 5:
                    sp.giaTrungBinh();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Mời chọn chức năng 1 - 6");
                    break;
            };

            sc.nextLine();
            System.out.print("\nBạn muốn tiếp tục chương trình danh sách sản phẩm không Y/N:");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
        
        } catch (Exception e) {
            System.out.println("Lỗi! Bạn nhập sai thông tin");
        }
    }
}
