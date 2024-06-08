/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap_1;

import java.util.Scanner;

/**
 *
 * @author NganTTK_PC09494
 */
/*
Nhập các hệ số của phương trình bậc 2. 
Tính delta và xuất căn delta ra màn hình.
*/
public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số của phương trình ax^2 + bx + c");
        System.out.println("a = ");
        double a = sc.nextDouble();
        System.out.println("b = ");
        double b = sc.nextDouble();
        System.out.println("c = ");
        double c = sc.nextDouble();
        //Tính delta
        double delta = Math.pow(b,2) - 4*a*c;
        //Căn delta 
        if(delta >= 0){ //Không tồn tại căn bậc 2 của một số âm
            double canDelta = Math.sqrt(delta);
            System.out.println("Can delta : " +canDelta);
        } else {
            System.out.println("Không có căn delta!");
        }
    }
}
