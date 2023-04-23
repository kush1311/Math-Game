package src.main.java;

import java.util.Random;
// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnum = new Random();
        int number = rnum.nextInt(101);
        if(number <= 33) {
            ArithmeticGame.Start();
        }
        else if(number > 33 && 66 > number ){
            GuessGame.Start();
        }
        else if(number >= 66 && 100 > number){
            MathQuizGame.Start();
        }
    }
        
}
