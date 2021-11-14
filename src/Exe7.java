import java.util.Scanner;
public class Exe7 {
    public static void Appointment(int selectDay, int minimumTime, int maximumHour) {
        if (selectDay <= 7 & selectDay > 0) {
            if (selectDay == 1 || selectDay == 2 || selectDay == 4 || selectDay == 5) {
                if (minimumTime >= 9 & maximumHour <= 17) {
                    if (maximumHour > minimumTime) {
                        System.out.println("An appointment has been made");
                    }
                    System.out.println("Pay attention to times");
                }
                else if (minimumTime < 9 & maximumHour > 17){
                            System.out.println("Invalid time selection");
                }
            }
                else if (selectDay == 6 || selectDay == 7) {
                System.out.println("Our office is closed now");
                }

                if (selectDay == 3) {
                    if (minimumTime >= 8 & maximumHour <= 12) {
                        if (maximumHour > minimumTime){
                        System.out.println("An appointment has been made");
                    }
                        System.out.println("The minimum is greater than the maximum");
                    }
                   else System.out.println("Pay attention to times");
                }
                else if (minimumTime < 8 & maximumHour > 12) {
                        System.out.println("Invalid time selection");
                }
        }
        else System.out.println("Invalid day Try again");
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type a day");
            int userInput = scanner.nextInt();
            System.out.println("Please type a minimum time");
            int userInput2 = scanner.nextInt();
            System.out.println("please type a maximum time");
            int userInput3 = scanner.nextInt();
            Appointment(userInput, userInput2, userInput3);


        }


    }