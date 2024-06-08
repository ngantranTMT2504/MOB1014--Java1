/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_7;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class QuanLySinhVien_Bai4 {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVienPoly_Bai2> list = new ArrayList<>();

    public void chucNang1() {
        do {
            String nganh;
            System.out.println("Mời bạn nhập ngành học của sinh viên(IT or Biz) : ");
            nganh = sc.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                String hoTen;
                double diemJava, diemCss, diemHtml;
                System.out.println("Mời nhập họ tên : ");
                hoTen = sc.nextLine();
                System.out.println("Nhập diểm Java : ");
                diemJava = sc.nextDouble();
                System.out.println("Nhập diểm Css : ");
                diemCss = sc.nextDouble();
                System.out.println("Nhập diểm HTML : ");
                diemHtml = sc.nextDouble();
                sc.nextLine();
                SinhVienIT_Bai3 sinhVienIT = new SinhVienIT_Bai3(hoTen, diemJava, diemCss, diemHtml);
                list.add(sinhVienIT);
            }
            if (nganh.equalsIgnoreCase("Biz")) {
                String hoTen;
                double diemMarketing, diemSales;
                System.out.println("Mời nhập họ tên : ");
                hoTen = sc.nextLine();
                System.out.println("Nhập diểm Marketing : ");
                diemMarketing = sc.nextDouble();
                System.out.println("Nhập diểm Sales : ");
                diemSales = sc.nextDouble();
                sc.nextLine();
                SinhVienBiz_Bai3 sinhVienBiz = new SinhVienBiz_Bai3(hoTen, diemMarketing, diemSales);
                list.add(sinhVienBiz);
            }

            System.out.print("Bạn có muốn nhập thêm Y/N: ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("Y")) {
                continue;

            } else {
                break;
            }

        } while (true);
    }

    public void chucNang2() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).xuat();
        }
    }

    public void chucNang3() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHocLuc().equalsIgnoreCase("gioi")) {
                list.get(i).xuat();
            }
        }
    }

    Comparator<SinhVienPoly_Bai2> comp = new Comparator<>() {
        @Override
        public int compare(SinhVienPoly_Bai2 sv1, SinhVienPoly_Bai2 sv2) {
            return Double.compare(sv1.getDiem(), sv2.getDiem());
        }
    };

    public void chucNang4() {
        Collections.sort(list,comp);   
        System.out.println("Danh sách sinh viên tăng dần theo diểm");
        chucNang2();
    }

    public void menu() {
        do {
            int luaChon;
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.println("*********************************************");

            System.out.print("Bạn muốn chọn chức năng nào: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    chucNang1();
                    break;
                case 2:
                    chucNang2();
                    break;
                case 3:
                    chucNang3();
                    break;
                case 4:
                    chucNang4();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập chức năng từ 1 - 5");
            }

            String tiepTuc;
            System.out.print("Bạn muốn tiếp tục chương trình không Y/N:");
            tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        } while (true);

    }

    public static void main(String[] args) {
        QuanLySinhVien_Bai4 qlsv = new QuanLySinhVien_Bai4();
        qlsv.menu();
    }

}
