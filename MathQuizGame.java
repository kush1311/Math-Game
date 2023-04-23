package src.main.java;

import java.util.Scanner;
import java.util.Random;

public class MathQuizGame {
    public static void Start() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;


        System.out.println("Congratulations! You have been randomly assigned the game 'Math Quiz Challenge' to play. Have fun!");
            System.out.println("Welcome to the Math Quiz Challenge!");
            System.out.println("In this game, you will be presented with series of math problems to solve.");

        while (true) {

            // Generate two random numbers between 1 and 10
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;

            // Generate a random operator (+, -, *, /)
            int operator = rand.nextInt(4);
            char op = ' ';
            switch (operator) {
                case 0:
                    op = '+';
                    break;
                case 1:
                    op = '-';
                    break;
                case 2:
                    op = '*';
                    break;
                case 3:
                    op = '/';
                    break;
            }

            // Ask the user to solve the equation
            System.out.print(num1 + " " + op + " " + num2 + " = ");
            double answer = sc.nextDouble();

            // Check the user's answer
            int correctAnswer = 0;
            switch (op) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                case '/':
                    correctAnswer = num1 / num2;
                    break;
            }

            if (answer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }

            // Print the user's score
            System.out.println("Score: " + score);

            System.out.print("Do you want to play again? (y/n) ");
            String input = sc.next();
            if (!input.equalsIgnoreCase("y")) {
                break;
            }

            
            
            
        }

        System.out.println("Thanks for playing! We hope you had fun and enjoyed the experience.");
        
        sc.close();
    }
        
}
 
