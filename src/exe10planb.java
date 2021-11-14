import java.util.Random;
import java.util.Scanner;

public class exe10planb {
    public static void main(String[] args) {
        Random random = new Random();
        int player1=0;
        int player2=0;
        int i=1;
        int secretNumber = random.nextInt(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to guessing a secret number game");
        while(player1!=secretNumber&&player2!=secretNumber)
        {
            System.out.println("First player please guess a number");
            player1 = scanner.nextInt();
            if(player1==secretNumber)
            {
                System.out.println("Player 1 has guessed the number after" +i+ "attempts");
                break;
            }
            else{
                if(player1>secretNumber)
                {
                    System.out.println("The number you guessed is bigger then the secret number");
                    System.out.println("");
                }
                else
                {
                    System.out.println("the number you guessed is smaller then the secret number");
                    System.out.println("");
                }
                System.out.println("Second player please type a number");
                player2 = scanner.nextInt();
                if(player2==secretNumber)
                {
                    System.out.println("Player 2 has guessed the number after "+i+" attempts");
                    break;
                }
                else{
                    if(player2>secretNumber)
                    {
                        System.out.println("The number you guessed is bigger then the secret number");
                        System.out.println("");
                    }
                    else
                    {
                        System.out.println("the number you guessed is smaller then the secret number");
                        System.out.println("");
                    }
                    i++;
                }
            }

        }

    }
    }