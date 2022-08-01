import java.util.Scanner;

public class jfo_6 {
    public static void main(String[] args) {
        //Problem 1
        int pin = 1234;

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your pin: ");
            int inputPin = sc.nextInt();

            if(inputPin == pin){
                System.out.println("Your pin is correct \n Welcome Back!");
                break;
            }
            System.out.println("Your pin is incorrect \n Try Again!");
        }


        //Problem 2
        System.out.print("Input a number to calculate: ");
        int n = sc.nextInt();

        for(int i = 1;i<=12;i++){
            System.out.println(n+"x" + i +"= " + n * i);
        }
    }
}
