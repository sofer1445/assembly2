import java.util.Scanner;
public class Exe6 {
    public static void MathSeries(int firstLimb, int difference, int quantity){
        int sum= firstLimb;

        for (int i=0; i<quantity;i++){

            System.out.print(sum+",");
            sum  = sum+difference;
    }

}
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //MathSeries(1,2,5);
        System.out.println("please type first limb");
        int userInput = scanner.nextInt();
        System.out.println("please type difference");
        int userInput2 = scanner.nextInt();
        System.out.println("please type quantity");
        int userInput3= scanner.nextInt();
        if(userInput3>0){
            MathSeries(userInput,userInput2,userInput3);
    }
        else {
            System.out.println("Error");
        }
    }}
