package chapter05;

    import java.util.Scanner;
import java.util.Random;

    public class GAMEGAME {

        public static void main(String[] args) {

            System.out.println("2019250059 한민욱");

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            while (true) {
                System.out.print("가위(1), 바위(2), 보(3)를 선택해보시오. (종료: 0) ");
                int userChoice = scanner.nextInt();

                // 사용자가 종료하고자 하는 경우
                if (userChoice == 0) {
                    System.out.println("게임을 끝.");
                    break;
                }

                // 컴퓨터의 선택을 난수로 결정
                int computerChoice = random.nextInt(3) + 1;

                // 사용자와 컴퓨터의 선택을 출력
                System.out.println("사용자: " + getChoiceString(userChoice));
                System.out.println("컴퓨터: " + getChoiceString(computerChoice));

                // 승부 결정
                int result = getResult(userChoice, computerChoice);
                if (result == 1) {
                    System.out.println("You Win!");
                } else if (result == -1) {
                    System.out.println("Computer Win!!");
                } else {
                    System.out.println("Draw.");
                }
            }
            scanner.close();
        }

        // 선택한 숫자에 따라 가위, 바위, 보 문자열로 변환하여 반환
        public static String getChoiceString(int choice) {
            if (choice == 1) {
                return "가위";
            } else if (choice == 2) {
                return "바위";
            } else {
                return "보";
            }
        }

        // 승부 결정
        public static int getResult(int userChoice, int computerChoice) {
            if (userChoice == computerChoice) {
                return 0;
            } else if ((userChoice == 1 && computerChoice == 3)
                    || (userChoice == 2 && computerChoice == 1)
                    || (userChoice == 3 && computerChoice == 2)) {
                return 1;
            } else {
                return -1;
            }
        }
    }

