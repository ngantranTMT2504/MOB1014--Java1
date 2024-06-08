/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_6;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
public class SinhVien_Bai3 {

    String hoTen;
    String email;
    String sdt;
    String cmnd;

    Scanner sc = new Scanner(System.in);

    void nhap() {
        String mauEmail = "[a-z0-9A-Z]{4,50}@gmail.com";
        String mauSDT = "^(032|033|034|035|036|037|038|039|096|097|098|086|083|084|085|081|082|088"
                + "|091|094|070|079|077|076|078|090|093|089|056|058|092|059|099)[0-9]{7}$";
        String mauCMND = "[0-9]{12}";

        System.out.println("Nhập tên sinh viên:");
        hoTen = sc.nextLine();
        do {
            System.out.print("Nhập email:");
            email = sc.nextLine();
            if (email.matches(mauEmail)) {
                System.out.println("Email hợp lệ");
                break;
            } else {
                System.out.println("Email không hợp lệ!Mời nhập lại");
                email = null;
            }
        }while(true);
        
        do{
        System.out.print("Nhập số điện thoại:");
        sdt = sc.nextLine();
        if (sdt.matches(mauSDT)) {
                System.out.println("SĐT hợp lệ");
                break;
            } else {
                System.out.println("SĐT không hợp lệ!Mời nhập lại");
                sdt = null;
            }
        }while(true);
        
        do{
        System.out.print("Nhập chứng minh nhân dân:");
        cmnd = sc.nextLine();
        if (cmnd.matches(mauCMND)) {
                System.out.println("CMND hợp lệ");
                break;
            } else {
                System.out.println("CMND không hợp lệ!Mời nhập lại");
                cmnd = null;
            }
        }while(true);
    }

    ;
    
    void xuat() {
        SinhVien_Bai3 sv = new SinhVien_Bai3();
        System.out.println("Tên sinh viên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("SĐT: " + sdt);
        System.out.println("Chứng minh nhân dân: " + cmnd);
    }
}
