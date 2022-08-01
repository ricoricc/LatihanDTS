import java.util.Scanner;

public class ComputeFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 11 && age < 65)
            System.out.println("Fare $5");
        else
            System.out.println("Fare $3");


    }
}
