import java.util.Scanner;

public class Exe4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose three parameters ");
        double a =scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double sum = b*b-(4*a*c);
        if(Math.sqrt(sum)==0.0){
        System.out.println(b*-1/(a*2));
        }
         else if(Math.sqrt(sum)>0.0){
            double counter = (b*-1)+sum;
            double x1 = counter/2*a;
            double counter2 = (b*-1)-sum;
            double x2 = counter2/2*a;
            System.out.println(x1+","+x2);
        }
        else if(Math.sqrt(sum)<0.0){
            System.out.println("There is no solution to a quadratic equation");
        }

}
}
