import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select number of employees");
        int num= scanner.nextInt();
        for(int i=0; i<num; i++)
        {
            System.out.println("Please select type of Employee (1 - Manager 0 - Low tier Employee)");
            int userInput = scanner.nextInt();
            System.out.println("Please type in several hours of work");
            int userInput2 = scanner.nextInt();
            System.out.println("Please type in Daily Achieved Goals");
            int userInput3= scanner.nextInt();



            int x= salary(userInput,userInput2,userInput3);
            System.out.println(x);
        }
    }

    public static int salary(int typeOved, int hours, int target1) {
        if(typeOved == 1){
            int sum = hours*200;
           sum= sum+(250*target1);
            return sum;
        } else {

            int sum = hours*50;
            sum= sum+(50*target1);
            sum= sum+(250*target1);
            return sum;
            }
        }


    }




