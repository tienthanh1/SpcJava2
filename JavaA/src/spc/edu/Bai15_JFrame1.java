/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class Bai15_JFrame1 {
    public static void main(String[] args) {
        //Tạo một JPanel
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Ví dụ JFrame đơn giản");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); //Kích thước cửa sổ
        
        //Tạo một nút
        JButton button = new JButton("Nhấn tôi!");
        
        //Thêm một nút vào JPanel
        panel.add(button);
        
        //Thêm JPanel vào JFrame
        frame.add(panel);
        
        //Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
