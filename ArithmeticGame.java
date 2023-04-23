package src.main.java;
// import java.math.RoundingMode;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;


public class ArithmeticGame {
    public static void Start() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        int totalQuestion = 0;
        int choice;
        int difficulty = 0;
        double num1, num2;
        double answer;
        String operator;

        System.out.println("Congratulations! You have been randomly assigned the game 'Math Challenge' to play. Have fun!");
        System.out.println("Welcome to the Math Challenge!");
        System.out.println("In this game, you will be presented with math problems to solve.");
        System.out.println("You will have 3 choices for difficulty levels: easy, medium, hard.");
        System.out.println("Select the difficulty level : ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        choice = sc.nextInt();
        if (choice == 1) {
            difficulty = 10;
        } else if (choice == 2) {
            difficulty = 100;
        } else if (choice == 3) {
            difficulty = 1000;
        }

        while (true) {
            num1 = rand.nextInt(difficulty);
            num2 = rand.nextInt(difficulty);
            int op = rand.nextInt(4);
            switch (op) {
                case 0:
                    operator = "+";
                    answer = num1 + num2;
                    break;
                case 1:
                    operator = "-";
                    answer = num1 - num2;
                    break;
                case 2:
                    operator = "*";
                    answer = num1 * num2;
                    break;
                default:
                    operator = "/";
                    final DecimalFormat decfor = new DecimalFormat("0.00");
                    answer = num1 / num2;
                    answer = Double.parseDouble(decfor.format(answer));

                    break;
            }
            System.out.println("What is the answer of " + num1 + " " + operator + " " + num2 + " ?");
            double userAnswer = sc.nextDouble();
            totalQuestion++;
            if (userAnswer == answer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answer);
            }
            System.out.println("Do you wish to continue? (y/n)");
            String choiceToContinue = sc.next();
            if (!choiceToContinue.equals("y")) {
                break;
            }
        }

        System.out.println("You have completed the game with a score of " + score + "/" + totalQuestion);
        System.out.println("Thanks for playing! We hope you had fun and enjoyed the experience.");
        sc.close();
    }
}


