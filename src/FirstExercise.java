import java.util.Scanner;

import static java.lang.Math.abs;

public class FirstExercise {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();
        userInput= abs(userInput);
        System.out.println("you number is"+ userInput);
    }
}
