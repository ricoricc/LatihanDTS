import java.util.Scanner;

public class WatchMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("Masukan Movie Price: ");
            int price = sc.nextInt();
            System.out.print("Masukan Movie Rating: ");
            int rating = sc.nextInt();

            if (price >= 12 && rating == 5)
                System.out.println("\"I'm interested in watching the movie\"\n");
            else
                System.out.println("I'm not interested in watching the movie\n");
        }
    }
}
