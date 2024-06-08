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
public class Bai_3 {

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

    public static void menu() {
        System.out.println("----------------XỬ LÍ MẢNG-----------------");
        System.out.println("0.Thoát chương trình");
        System.out.println("1.Sắp xếp mảng tăng dần");
        System.out.println("2.In phần tử có giá trị nhỏ nhất");
        System.out.println("3.Tính trug bình cộng các số chia hết cho 3");
        System.out.println("===========================================");
    }

    public static void main(String[] args) {
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

            do{
            menu();  //menu chương trình xử lí mảng
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
            }while(true);

        } catch (Exception e) {
            System.out.println("Lỗi!Vui lòng nhập đúng thông tin");
        }
    }
}
