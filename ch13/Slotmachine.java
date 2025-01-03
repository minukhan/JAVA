package chapter13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Slotmachine extends JFrame implements ActionListener{

    JLabel[] labels;
    JButton button;
    int[] numbers;
    JLabel label;

    public static void main(String[] args) {
        System.out.println("2019250059 한민욱");
        new Slotmachine();
    }
    public Slotmachine() {
        setSize(500, 300);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        labels = new JLabel[3];
        numbers = new int[3];

        for(int i = 0 ; i<3 ; i++) {

            labels[i] = new JLabel(""+numbers[i]);
            labels[i].setFont(new Font("serif", Font.BOLD| Font.ITALIC, 100));
            labels[i].setSize(100, 100);
            labels[i].setLocation(100+100*i, 20);
            panel.add(labels[i]);
        }

        label = new JLabel("점수판");
        label.setFont(new Font("", Font.PLAIN , 20));
        label.setSize(350,80);
        label.setLocation(100, 180);
        panel.add(label);

        button = new JButton("스핀");
        button.setSize(250, 50);
        button.setLocation(100, 150);
        panel.add(button);
        button.addActionListener(this);

        add(panel);
        setTitle("MyGame");
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        for(int i = 0 ; i <3 ; i++) {
            numbers[i] = (int)(Math.random()*10);
            labels[i].setText(""+numbers[i]);
        }
        if(numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
            label.setText("100점");
        } else {
            label.setText("0점");
        }
    }




}
