import java.util.Scanner;
public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 5-20");
        int userInput1= scanner.nextInt();
        firstF(userInput1);
        int userInput2 = firstF(userInput1);
        integerNumber(userInput2);
        //int result= integerNumber(userInput2);
    }

         public static int firstF(int numberInRange) {
        int num = numberInRange;
        if (num <= 20 && num >= 5) {
            System.out.println(num);
        }else {
        System.out.println("Incorrect number Try again");
        }
        return numberInRange;
}
        public static void integerNumber(int userInput3){
        if (userInput3>=5 && userInput3<=20){
            for(int j=0;j<userInput3;userInput3--){
                System.out.println("");
                int i= 0;
                while (i<userInput3){
                System.out.print("*");
                i++;
            }

        }
        }

}
}



