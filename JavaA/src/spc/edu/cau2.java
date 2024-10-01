/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class cau2 {
      public static void main(String[] args) {
        System.out.println("Chuong trinh xuat chu vi va dien tich hinh tam giac");
        Scanner sc = new Scanner(System.in);
        double canha, canhb, canhc, nuachuvi,chuvi, dientich;
        System.out.print("Nhap canha: ");
        canha = sc.nextInt();
        System.out.print("Nhap canhb: ");
        canhb = sc.nextInt();
        System.out.print("Nhap canhc: ");
        canhc = sc.nextInt();
        nuachuvi = (canha + canhb + canhc) / 2;
        dientich = Math.sqrt(nuachuvi*(nuachuvi - canha) * (nuachuvi - canhb) * (nuachuvi - canhc));
        chuvi = (canha + canhb +canhc);
        
          System.out.println("chu vi=" + chuvi);
          System.out.println("Dien tich=" + dientich);
    }
}
