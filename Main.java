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



//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);

//         System.out.println("Welcome To Mathematical Quiz!\n(i)Enter 1 to play Arithmetic game.\n(ii)Enter 2 to play Guess game.\n(iii)Enter 3 to play Normal Math game.");
//         int answer = sc.nextInt();

//         if (answer == 1) {
//             ArithmeticGame.Start();
//         }

//         else if(answer == 2) {
//             GuessGame.Start();
//         }
//         else if(answer == 3){
//             NormalMathGame.Start();
//         }
//         else{
//             System.out.println("Invalid Entry!");
//         }
//         sc.close();
//     }
// }