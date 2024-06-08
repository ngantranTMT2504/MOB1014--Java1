/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class Bai_5 {

    public static void chucNang_1() {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Vui lòng nhập n là số lớn hơn 0");
                return;
            }
            if (n >= 0 && n < 2) {
                System.out.println("N không phải số nguyên tố");
                return;
            }
            double sqrN = Math.sqrt(n);
            for (int i = 2; i <= sqrN; i++) {
                if (n > 2 && n % i == 0) {
                    System.out.println("N không phải số nguyên tố");
                    return;
                }
            }
            System.out.println("N là số nguyên tố");
        } catch (Exception e) {
            System.out.println("LỖi!N phải là một số nguyên dương");
        }
    }

    public static void chucNang_2() {
        try {
            int x;
            Scanner sc = new Scanner(System.in);
            System.out.print("Bạn muốn in bảng cửu chương mấy :");
            x = sc.nextInt();
            if (x < 1 || x > 10) {
                System.out.println("Vui lòng chọn từ 1 - 10");
                return;
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(x + "x" + i + "=" + (x * i));
            }
        } catch (Exception e) {
            System.out.println("Lỗi! Vui lòng nhập một số nguyên từ 1 - 10");
        }
    }

    //Chức năng 3    
    public static void chucNang1(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp : " + Arrays.toString(arr));
    }

    public static void chucNang2(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        System.out.println("Phần tử có giá trị nhỏ nhất là : " + min);
    }

    public static void chucNang3(int[] arr) {
        int tong = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                tong += arr[i];
                count++;
            }
        }
        double ketQua = tong / count;
        System.out.println("Trung bình cộng : " + ketQua);
    }

    public static void menuChuongTrinh() {
        System.out.println("----------------XỬ LÍ MẢNG-----------------");
        System.out.println("0.Thoát chương trình");
        System.out.println("1.Sắp xếp mảng tăng dần");
        System.out.println("2.In phần tử có giá trị nhỏ nhất");
        System.out.println("3.Tính trug bình cộng các số chia hết cho 3");
        System.out.println("===========================================");
    }

    public static void chucNang_3() {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập phần từ của mảng: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Vui lòng nhập số phần từ lớn hơn 0");
                return;
            }
            //input mảng
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("Arr[%d] = ", i);
                arr[i] = sc.nextInt();
            }
            //output mảng
            System.out.println("Mảng vừa nhập");
            System.out.println(Arrays.toString(arr));

            do {
                menuChuongTrinh();  //menu chương trình xử lí mảng
                System.out.println("Bạn chọn chức năng mấy: ");
                int luaChon = sc.nextInt();

                switch (luaChon) {
                    case 0:
                        return;
                    case 1:
                        chucNang1(arr);
                        break;
                    case 2:
                        chucNang2(arr);
                        break;
                    case 3:
                        chucNang3(arr);
                        break;
                    default:
                        System.out.println("Vui lòng nhập lựa chọn 1,2,3");
                }
                
            } while (true);

        } catch (Exception e) {
            System.out.println("Lỗi!Vui lòng nhập đúng thông tin");
        }
    }

    //Chức Năng 4
    public static void swap(float[] a, int i, int j) {
        float temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void chucNang_4() {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số lượng sinh viên:");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Số luojng sinh viên phải là số nguyên lớn hơn 0");
                return;
            }
            String[] hoTen = new String[n];
            float[] diem = new float[n];
            String[] hocLuc = new String[n];

            //input mảng sinh viên
            int i, j;
            for (i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println("Sinh viên " + (i + 1));
                System.out.print("Họ tên: ");
                hoTen[i] = sc.nextLine();
                System.out.print("Điểm: ");
                diem[i] = sc.nextFloat();
                if (diem[i] < 5) {
                    hocLuc[i] = "Yếu";
                } else if (diem[i] >= 5 && diem[i] < 6.5) {
                    hocLuc[i] = "Trung bình";
                } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                    hocLuc[i] = "Khá";
                } else if (diem[i] >= 7.5 && diem[i] < 9) {
                    hocLuc[i] = "Giỏi";
                } else if (diem[i] >= 9 && diem[i] <= 10) {
                    hocLuc[i] = "Xuất sắc";
                }
            }
            //output mảng sinh viên vừa nhập
            System.out.println("Mảng vừa nhập");
            for (i = 0; i < n; i++) {
                System.out.println("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", Học lực: " + hocLuc[i]);
            }
            //Sắp xếp tăng dần theo điểm
            for (i = 0; i < n - 1; i++) {
                for (j = i + 1; j < n; j++) {
                    if (diem[i] > diem[j]) {
                        swap(diem, i, j);
                        swap(hoTen, i, j);
                        swap(hocLuc, i, j);
                    }
                }
            }
            //Output mảng sinh viên sau khi sắp xếp
            System.out.println("Mảng sau khi sắp xếp");
            for (i = 0; i < n; i++) {
                System.out.println("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", Học lực: " + hocLuc[i]);
            }
        } catch (Exception e) {
            System.out.println("Lỗi!Vui lòng nhập đúng định dạng của từng thông tin");
        }
    }

    public static void menu() {
        System.out.println("=======MENU CHƯƠNG TRÌNH=======");
        System.out.println("0.Thoát chương trình           |");
        System.out.println("1.Kiểm tra số nguyên tố        |");
        System.out.println("2.In bảng cửu chương           |");
        System.out.println("3.Xử lý mảng                   |");
        System.out.println("4.Sắp xếp danh sách sinh viên  |");
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        try {
            do {
                menu();
                int luaChon;
                Scanner sc = new Scanner(System.in);
                System.out.println("Bạn chọn chúc năng mấy: ");
                luaChon = sc.nextInt();

                switch (luaChon) {
                    case 0:
                        return;
                    case 1:
                        chucNang_1();
                        break;
                    case 2:
                        chucNang_2();
                        break;
                    case 3:
                        chucNang_3();
                        break;
                    case 4:
                        chucNang_4();
                        break;
                    default:
                        System.out.println("Vui lòng chọn chúc năng 1,2,3,4");
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Vui lòng nhập đúng thông tin");
        }
    }
}
