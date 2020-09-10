/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alif
 */
public class Welcome extends JFrame implements ActionListener {


    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
//package hotel.management.system;
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
    JLabel l1;
    JButton b1;

    public Welcome() {

        setSize(1366, 430);          // setContentPane(300,300,1366,390);   frame size
        setLayout(null);
        setLocation(300, 300);

        l1 = new JLabel("");
        b1 = new JButton("Next");

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1366, 390, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        JLabel lid = new JLabel("HOTEL MANAGEMENT SYSTEM");
        lid.setBounds(30, 300, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 70));
        lid.setForeground(Color.red);
        l1.add(lid);

        b1.setBounds(1170, 325, 150, 50);
        l1.setBounds(0, 0, 1366, 390);

        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
        setVisible(true);

        while (true) {
            lid.setVisible(false); // lid =  j label
            try {
                Thread.sleep(500); //1000 = 1 second
            } catch (Exception e) {
            }
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        new Login().setVisible(true);
        this.setVisible(false);

    }

    
}
