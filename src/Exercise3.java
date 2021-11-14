import java.util.Scanner;

public class Exercise3 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select three numbers");
        int userInput = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();
        if (userInput > userInput2 && userInput > userInput3) {
            if (userInput2 > userInput3) {
                System.out.println(userInput + ","+ userInput2 +","+ userInput3);
            } else {
                System.out.println(userInput + ","+ userInput3+ ","+userInput2);
            }


        }
        if (userInput2 > userInput3 && userInput2 > userInput) {
            if (userInput3 > userInput) {
                System.out.println(userInput2+ ","+userInput3+ ","+userInput);
            } else {
                System.out.println(userInput2+ ","+userInput+ ","+userInput3);
            }
        }
        if (userInput3 > userInput2 && userInput3 > userInput) {
            if (userInput > userInput2) {
                System.out.println(userInput3+ ","+userInput+ ","+userInput2);
            } else {
                System.out.println(userInput3+ ","+userInput2+ ","+userInput);

            }
        }
    }}