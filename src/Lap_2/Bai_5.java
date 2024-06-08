/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_2;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class Bai_5 {
    public static void chucNang1() {
        System.out.println("1. Tính tiền karaoke");
        try {
            float gioBatDau, gioKetThuc, thanhTien, tienGiam, tienThanhToan;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Nhập giờ bắt đầu: ");
            gioBatDau = sc.nextFloat();
            System.out.print("Nhập giờ kết thúc: ");
            gioKetThuc = sc.nextFloat();

            if (gioBatDau < 12 || gioKetThuc > 23) {
                System.out.println("QUán chỉ hoạt động từ 12 - 23 giờ");
                return;
            }
            float soGio = gioKetThuc - gioBatDau;
            thanhTien = soGio * 150000;
            if (soGio <= 3) {
                tienGiam = 0;
                tienThanhToan = thanhTien;
            } else {
                tienGiam = (float) ((soGio - 3) * (150000 * 0.4));
                tienThanhToan = thanhTien - tienGiam;
            }
            System.out.println("Số giờ hát karaoke : " + soGio);
            System.out.println("Thành tiền : " + thanhTien);
            System.out.println("Tiền giảm : " + tienGiam);
            System.out.println("Tiền cần thanh toán: " + tienThanhToan);
        } catch (Exception e) {
            System.out.println("Vui lòng nhập đúng giờ bắt đầu, giờ kế thúc!!");
        }
    }
    public static void chucNang2() {
        System.out.println("2. Tính tiền điện");
        try {
            int soKwh;
            float tienDien;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số kwh điện sử dụng: ");
            soKwh = sc.nextInt();

            if (soKwh < 0) {
                System.out.println("Só kwh điện phải lớn hơn 0!");
                return;
            }

            if (soKwh >= 0 && soKwh <= 50) {
                tienDien = soKwh * 1678;
            } else if (soKwh > 50 && soKwh <= 100) {
                tienDien = (50 * 1678) + (soKwh - 50) * 1734;
            } else if (soKwh > 100 && soKwh <= 200) {
                tienDien = (50 * 1678) + (50 * 1734) + (soKwh - 100) * 2014;
            } else if (soKwh > 200 && soKwh <= 300) {
                tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (soKwh - 200) * 2536;
            } else if (soKwh > 300 && soKwh <= 400) {
                tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (100 * 2536) + (soKwh - 300) * 2834;
            } else {
                tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (100 * 2536) + (100 * 2834) + (soKwh - 400) * 2927;
            }

            System.out.println("Tiền điện : " + tienDien);
        } catch (Exception e) {
            System.out.println("Lỗi!Số kwh điện phải là số nguyên và không chứa kí tự");
        }
    }
    public static void chucNang3() {
        System.out.println("Chức năng đổi tiền ");
        try {
            int tien;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mênh tiền cần đổi: ");
            tien = sc.nextInt();
            if (tien < 1) {
                System.out.println("Số tiền phải lớn hơn 0");
                return;
            }
            if (tien == 500000 || tien == 500) {
                System.out.println("2 tờ 200 ngàn và 1 tờ 100 ngàn");
            } else if (tien == 200000 || tien == 200) {
                System.out.println("2 tờ 100 ngàn");
            } else if (tien == 100000 || tien == 100) {
                System.out.println("2 tờ 50 ngàn");
            } else if (tien == 50000 || tien == 50) {
                System.out.println("2 tờ 20 ngàn và 1 tờ 10 ngàn");
            } else if (tien == 20000 || tien == 20) {
                System.out.println("2 tờ 10 ngàn");
            } else if (tien == 10000 || tien == 10) {
                System.out.println("2 tờ 5 ngàn");
            } else if (tien == 5000 || tien == 5) {
                System.out.println("2 tờ 2 ngàn và 1 tờ 1 ngàn");
            } else if (tien == 2000 || tien == 2) {
                System.out.println("2 tờ 1 ngan");
            } else if (tien == 1000 || tien == 1) {
                System.out.println("2 tờ 500");
            } else {
                System.out.println("Không có mệnh giá để đổi!Tiền đổi phải là 1 tờ tiền chẵn");
            }
        } catch (Exception e) {
            System.out.println("Tiền đổi phải là số nguyên!");           
        }
    }
    public static void chucNang4() {
        System.out.println("4. Xóa món nước theo mã ");
        try {
            int khoiThi;
            float a, b, c;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập khối thi (1,2) : ");
            khoiThi = sc.nextInt();
            if (khoiThi < 1 || khoiThi > 2) {
                System.out.println("Lỗi! Mời nhập đúng khối thi 1 hoặc 2!");
                return;
            }
            if (khoiThi == 1) {
                System.out.print("Nhập điểm toán: ");
                a = sc.nextFloat();
                System.out.print("Nhập điểm lý: ");
                b = sc.nextFloat();
                System.out.print("Nhập điểm hóa: ");
                c = sc.nextFloat();
                if((a > 10 || a < 0) || (b > 10 || b < 0) || (b > 10 || b < 0)) {
                    System.out.println("Nhập điểm sai! Vui lòng nhập điểm từ 0 - 10");
                    return;
                }
                if (a + b + c >= 21 && (a >= 7 && b >= 7 && c >= 7)) {
                    System.out.println("Chúc mừng bạn đậu ngành CNTT");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời xét nguyện vọng 2");
                }
            }
            if (khoiThi == 2) {
                System.out.print("Nhập điểm toán: ");
                a = sc.nextFloat();
                System.out.print("Nhập điểm hóa: ");
                b = sc.nextFloat();
                System.out.print("Nhập điểm sinh: ");
                c = sc.nextFloat();
                if((a > 10 || a < 0) || (b > 10 || b < 0) || (b > 10 || b < 0)) {
                    System.out.println("Nhập điểm sai! Vui lòng nhập điểm từ 0 - 10");
                    return;
                }
                if (a + b + c >= 24 && (a >= 8 && b >= 8 && c >= 8)) {
                    System.out.println("Chúc mừng bạn đậu ngành bác sĩ");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời xét nguyện vọng 2");
                }
            }
        } catch (Exception e) {
            System.out.println("Nhập thông tin sai!Vui lòng kiểm tra lại!");
        }
    }
    public static void main(String[] args) {
        System.out.println("---------------MENU CHỨC NĂNG--------------");
        System.out.println("===========================================");
        System.out.println("|1. Tính tiền karaoke                     |");
        System.out.println("|2. Tính tiền điện                        |");
        System.out.println("|3. Chức năng đổi tiền                    |");
        System.out.println("|4. Xét điểm thi đại học                  |");              
        System.out.println("|0. Thoát chương trình                    |");
        System.out.println("===========================================");
        int luaChon;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn chọn chức năng nào : ");
        luaChon = sc.nextInt();       
        switch(luaChon) {
            case 0:
                System.exit(0);
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
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }   
    }  
}
