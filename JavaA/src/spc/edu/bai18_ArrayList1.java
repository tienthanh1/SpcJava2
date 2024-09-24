/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class bai18_ArrayList1 {

    public static void main(String[] args) {
        System.out.println("hoc ve ARRAYLIST");
        ArrayList ds = new ArrayList();
        for (int i = 1; i < 10; i++) {
            ds.add(i);
        }
        ds.add("ten tui");
        ds.remove(6);

        System.out.println("hoc ve arraylist");
        for (int i = 0; 1 < ds.size(); i++) {
            System.out.print(ds.get(i) + ";");
        }
    }
}
