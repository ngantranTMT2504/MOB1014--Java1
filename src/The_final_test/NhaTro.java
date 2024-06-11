/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package The_final_test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class NhaTro {

    private String soPhong;
    private int giaPhong;

    public NhaTro() {
    }

    public NhaTro(String soPhong, int giaPhong) {
        this.soPhong = soPhong;
        this.giaPhong = giaPhong;
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<NhaTro> list = new ArrayList<>();

    public void nhap() {
        do {
            String mauSoPhong = "[A-Z]{1}[0-9]{3}";
            do {
                System.out.print("Nhập số phòng:");
                soPhong = sc.nextLine();
                if (soPhong.matches(mauSoPhong)) {
                    break;
                } else {
                    System.out.println("Số phòng không đúng định dạng");
                }
            } while (true);
            do {
                System.out.print("Nhập giá phòng:");
                giaPhong = sc.nextInt();
                if (giaPhong < 0) {
                    System.out.println("Giá phòng không được âm");
                } else {
                    break;
                }
            } while (true);
            sc.nextLine();

            NhaTro nhaTro = new NhaTro(soPhong, giaPhong);
            list.add(nhaTro);

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
        for (NhaTro x : list) {
            System.out.println("Số phòng: " + x.soPhong + "| Giá: " + x.giaPhong);
        }
    }

    public int timKiem() {
        String so;
        int index = -1;

        System.out.print("Nhập số phòng muốn tìm:");
        so = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).soPhong.equals(so)) {
                index = i;
            }
        }

        if (index > -1) {
            System.out.println("Tìm thấy");
            System.out.println("Số phòng: " + list.get(index).soPhong + "| Giá: " + list.get(index).giaPhong);
        } else {
            System.out.println("Không tìm thấy");
        }

        return index;
    }

    public void capNhatGiaPhong() {
        int index = timKiem();
        if (index > -1) {
            System.out.println("Nhập giá phòng muốn cập nhật: ");
            int giaPhongMoi = sc.nextInt();
            list.get(index).giaPhong = giaPhongMoi;
        }

    }

    public void xoaTheoSoPhong() {
        int index = timKiem();
        if (index > -1) {
            list.remove(index);
            System.out.println("Đã xóa");
        }
    }

    public void menuChucNang4() {
        try {
            do {
                System.out.println("***************************");
                System.out.println("1. Thêm phòng mới");
                System.out.println("2. Cập nhật giá phòng");
                System.out.println("3. Xoá theo số phòng");
                System.out.println("0. Thoát");
                System.out.println("***************************");

                int luaChon;
                Scanner sc = new Scanner(System.in);
                System.out.print("Bạn muốn chọn chức năng nào : ");
                luaChon = sc.nextInt();

                switch (luaChon) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        capNhatGiaPhong();
                        break;
                    case 3:
                        xoaTheoSoPhong();
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Mời chọn chức năng 1 - 3");
                        break;
                }

                sc.nextLine();
                String tiepTuc;
                System.out.print("Bạn muốn tiếp tục chức năng 4 không Y/N:");
                tiepTuc = sc.nextLine();
                if (tiepTuc.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            } while (true);

        } catch (Exception e) {
            System.out.println("Lỗi! Nhập không đúng định dạng");
        }
    }

    public void chucNang4() {
        menuChucNang4();
    }

    public void menu() {
        try {
            while (true) {
                System.out.println("");
                System.out.println("1. Nhập danh sách nhà trọ");
                System.out.println("2. Xuất danh sách nhà trọ");
                System.out.println("3. Tìm nhà trọ theo số phòng");
                System.out.println("4. Thêm phòng mới, cập nhật giá phòng, xoá theo số phòng");
                System.out.println("0. Thoát chương trình");
                System.out.println("");

                int luaChon;
                Scanner sc = new Scanner(System.in);
                System.out.print("Bạn muốn chọn chức năng nào : ");
                luaChon = sc.nextInt();

                switch (luaChon) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        timKiem();
                        break;
                    case 4:
                        chucNang4();
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Mời chọn chức năng 1 - 4");
                        break;
                }

                sc.nextLine();
                String tiepTuc;
                System.out.print("Bạn muốn tiếp tục chương trình không Y/N:");
                tiepTuc = sc.nextLine();
                if (tiepTuc.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi!Nhập không đúng định dạng");
        }
    }

    public static void main(String[] args) {
        NhaTro nhaTro = new NhaTro();
        nhaTro.menu();
    }

}
