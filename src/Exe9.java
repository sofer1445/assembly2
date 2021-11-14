import java.util.Scanner;
public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type positive number");
        int result = positiveInteger();
        if (result<=3) {
            System.out.println(result);
        }
        else {
        for( int i=3;i<result;i++) {
           boolean number = primeNumber(i);
           if (number==true){
               System.out.print(i+",");
           }

           }

        }
    }


    public static boolean divisionNumber(int number1, int number2) {
        int sum = (number1 % number2);
        if (sum == 0) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean primeNumber(int prime) {
        for (int i = 2; i < prime; i++) {
            boolean sum = divisionNumber(prime, i);
            if (sum == true) {
                return false;
            }
        }
        //System.out.println("The number is prime");
        return true;
    }

    public static int positiveInteger() {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
    while (num<0){
        System.out.println("Enter a positive number");
        num= scanner.nextInt();

    }return num;

        }
}
//System.out.println("type two numbers");
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        divisionNumber(number1, number2);
//        boolean result = divisionNumber(number1, number2);
//        System.out.println(result);
//        System.out.println("type a number prime");
//        int prime = scanner.nextInt();
//        primeNumber(prime);
//        boolean result2 = primeNumber(prime);
//        System.out.println(result2);
//        System.out.println("type a positive number");
//        int numberPositive = scanner.nextInt();
//        positiveInteger(numberPositive);
//        int result3 = positiveInteger(numberPositive);
//        System.out.println(result3);







