import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.decrementExact;

public class SecondPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select 2 numbers");
        int userInput = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int sum = userInput + userInput2;
        if(sum%2==0) {
            System.out.println("Your number sum is even" + sum);
        } else {
            System.out.println("Your number sum is odd" + sum);

        }
    }}
