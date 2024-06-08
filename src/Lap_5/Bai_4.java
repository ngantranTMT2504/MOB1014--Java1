/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_5;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class Bai_4 {
    public static void menu() {
        System.out.println("***********MENU***********");
        System.out.println("==========================");
        System.out.println("1. Danh sách số thực       ");
        System.out.println("2. Danh sách họ tên        ");
        System.out.println("3. Danh sách sản phẩm      ");
        System.out.println("4. Kết thúc               ");
        System.out.println("***************************");
    }
    
    public static void main(String[] args) {
        
            do{   
                menu();
                int luaChon;
                Scanner sc = new Scanner(System.in);
                System.out.print("Bạn muốn chọn chức năng nào : ");
                luaChon = sc.nextInt();

                switch (luaChon) {
                    case 1:
                        Bai_1.main(args);
                        break;
                    case 2:
                        DanhSachHoTen_Bai2.main(args);
                        break;
                    case 3:
                        SanPham_Bai3.main(args);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Mời chọn chức năng 1 - 4");
                        break;
                }
                sc.nextLine();
                System.out.print("\nBạn muốn tiếp tục chương trình 3 danh sách không Y/N:");
                String tiepTuc = sc.nextLine();
                if (tiepTuc.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            } while (true);
        
        
    }
    
}
