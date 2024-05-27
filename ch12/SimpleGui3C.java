package chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labalbutton = new JButton("Change labal");


        JButton Colorbutton = new JButton("Change colors");


        JButton name = new JButton("2019250059 한민욱");



        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.NORTH,name);
        frame.getContentPane().add(BorderLayout.SOUTH, Colorbutton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST,labalbutton);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent event){
            frame.repaint();
    }




}


