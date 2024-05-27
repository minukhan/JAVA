package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

        JFrame frame;
        JLabel label;

        public static void main(String[] args) {
            TwoButtons gui = new TwoButtons();
            gui.go();
        }

        public void go() {
            frame = new JFrame();


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton labalbutton = new JButton("Change labal");
            labalbutton.addActionListener(new LabelListener());

            JButton Colorbutton = new JButton("Change colors");
            Colorbutton.addActionListener(new ColorListener());

            JButton name = new JButton("2019250059 한민욱");

            label = new JLabel("I'm a Labal");

            MyDrawPanel drawPanel = new MyDrawPanel();

            frame.getContentPane().add(BorderLayout.NORTH,name);
            frame.getContentPane().add(BorderLayout.SOUTH, Colorbutton);
            frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
            frame.getContentPane().add(BorderLayout.EAST,labalbutton);
            frame.getContentPane().add(BorderLayout.WEST, label);

            frame.setSize(300, 300);
            frame.setVisible(true);



        }

        class LabelListener implements ActionListener{
            public void actionPerformed(ActionEvent event){

                label.setText("Ouch!");

            }

        }
        class ColorListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                frame.repaint();
            }

        }

    }
