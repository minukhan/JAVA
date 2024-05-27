package MATHProject;

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*
Author: MINUK HAN
E-mail: dnrals7929@naver.com
Course: Java Programming
Assignment: Programming Assignment 1
Due date: 05/20/2021
File: MATHPriject
Purpose: MATH Learning APP
Compiler/IDE: Java SE Development Kit 8u181/IntelliJ IDEA
Operating system: MS Windows 10
Reference(s): Java 8 API - Oracle Documentation
(http://docs.oracle.com/javase/8/docs/api/);
(Include ALL additional references (Web page, etc.) here.)
*/

public class MathLearningApp extends JFrame implements ActionListener {
    private JLabel problemLabel, answerLabel; //문제 라벨 변수들
    private JTextField answerField; //텍스트 필드 변수
    private JButton newProblemButton; //다음 문제 버튼

    private int firstoperand, secondoperand, answer, operation;// 각 연산에 필요한 변수들

    private final String[] OPERATIONS = {"plus", " subtraction", "multiplication"}; // 연산 명을 모아놈 배열로

    private final Random random = new Random(); //랜덤한 숫자를 얻기위한 랜덤함수

    public MathLearningApp() {
        setTitle("2019250059 한민욱");
        setSize(400, 200); //크기 설정

        setDefaultCloseOperation(EXIT_ON_CLOSE);//기본값설정

        setLayout(new GridLayout(4, 1));//레이아웃 설정

        problemLabel = new JLabel();// LAbel 하나 만듬
        problemLabel.setHorizontalAlignment(JLabel.LEFT);//왼쪽 정렬


        answerLabel = new JLabel("Please enter your answer:"); //LAbel 하나 만듬
        answerLabel.setHorizontalAlignment(JLabel.LEFT); //왼쪽 정렬


        answerField = new JTextField();//텍스트 필드 하나 만듬 여기에 입력할꺼임
        answerField.addActionListener((ActionListener) this);//리스너 추가


        newProblemButton = new JButton("New Problem");//버튼 하나 만듬 누르면 다음 문제로 넘어가는 버튼
        newProblemButton.addActionListener((ActionListener) this);// 리스너 추가



        add(problemLabel);//창에 추가시키기
        add(answerLabel);//창에 추가시키기
        add(answerField);//창에 추가시키기
        add(newProblemButton);//창에 추가시키기

        generateProblem();// 기능 수행
    }

    public void generateProblem() {
        operation = random.nextInt(3) + 1;
        firstoperand = random.nextInt(10) + 1;
        secondoperand = random.nextInt(10) + 1;

        switch (operation) {
            case 1://덧셈 연산
                answer = firstoperand + secondoperand;//덧셈의 값을 받음
                problemLabel.setText("How much is " + firstoperand + " plus " + secondoperand + "?");//text란에 보여질 출력값
                break;
            case 2:
                answer = firstoperand - secondoperand;//뺄셈의 값을 answer에다 넣음
                problemLabel.setText("How much is " + firstoperand + " subtraction " + secondoperand + "?");//text란에 보여질 출력값
                break;
            case 3:
                answer = firstoperand * secondoperand;//곱셈의 값을 answer에다 넣음
                problemLabel.setText("How much is " + firstoperand + " multiplication " + secondoperand + "?");//text란에 보여질 출력값
                break;
        }

        answerField.setText("");
        answerLabel.setText("Please enter your answer:");// 답을 입력하고 enter를 누르라는 안내문
    }

    public void checkAnswer(int userAnswer) {
        if (userAnswer == answer) {//만약 답과 일치한다면?
            answerLabel.setText("Very good!");
        } else {//답과 일치하지 않을때
            answerLabel.setText("Sorry, that's not correct. Please try again.");
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == answerField) {
            // 사용자가 엔터를 눌렀을 때 정답 확인
            try {//예외구문
                int userAnswer = Integer.parseInt(answerField.getText());
                checkAnswer(userAnswer);
            } catch (NumberFormatException ex) {
                answerLabel.setText("Please enter a valid integer.");
            }
        } else if (e.getSource() == newProblemButton) {
            // 새 문제 생성
            generateProblem();//다시 랜덤으로 돌려서 새로운 숫자 및 문제들을 만든다.
        }
    }
    public static void main(String[] args) {
        MathLearningApp app = new MathLearningApp();//앱을 실행시킨다.
        app.setVisible(true);
    }
}