/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class DanhSachHoTen_Bai2 {

    ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("***********MENU***********");
        System.out.println("==========================");
        System.out.println("1. Nhập danh sách         ");
        System.out.println("2. Xuất danh sách         ");
        System.out.println("3. Sắp xếp danh sách      ");
        System.out.println("4. Danh sách ngẫu nhiên   ");
        System.out.println("5. Tìm và xóa tên         ");
        System.out.println("6. Kết thúc               ");
        System.out.println("***************************");
    }

    public void nhap() {
        do {
            String str;
            System.out.print("Mời bạn nhập họ tên: ");
            str = sc.nextLine();
            list.add(str);

            System.out.print("Bạn có muốn nhập thêm Y/N: ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("Y")) {
                continue;

            } else {
                break;
            }
        } while (true);
    }

    public void xuat() {
        System.out.println("Mảng họ tên");
        for (String x : list) {
            System.out.print(x + "  ");
        }
    }

    public void sapXep() {
        Collections.sort(list);
        System.out.println("Mảng sau sắp xếp");
        xuat();
    }

    public void ngauNhien() {
        Collections.shuffle(list);
        System.out.println("Mảng ngẫu nhiên");
        xuat();
    }

    public void timVaXoa() {
        int index = -1;
        System.out.print("Mời nhập tên muốn xóa: ");
        String str = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (str.equalsIgnoreCase(list.get(i))) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("Đã xóa " + list.remove(index));
        }

    }

    public static void main(String[] args) {
        try {
            DanhSachHoTen_Bai2 ds = new DanhSachHoTen_Bai2();

            do {
                ds.menu();

                int luaChon;
                Scanner sc = new Scanner(System.in);
                System.out.print("Bạn muốn chọn chức năng nào : ");
                luaChon = sc.nextInt();

                switch (luaChon) {
                    case 1:
                        ds.nhap();
                        break;
                    case 2:
                        ds.xuat();
                        break;
                    case 3:
                        ds.sapXep();
                        break;
                    case 4:
                        ds.ngauNhien();
                        break;
                    case 5:
                        ds.timVaXoa();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Mời chọn chức năng 1 - 6");
                        break;
                }

                sc.nextLine();
                System.out.print("\nBạn muốn tiếp tục chương trình danh sách họ tên không Y/N:");
                String tiepTuc = sc.nextLine();
                if (tiepTuc.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            } while (true);

        } catch (Exception e) {
            System.out.println("Lỗi! Bạn nhập thông tin sai");
        }
    }
}
