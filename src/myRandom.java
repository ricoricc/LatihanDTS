import java.util.Random;

public class myRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean bol = rand.nextBoolean();
        System.out.println(bol);

        int angkaI = rand.nextInt(16)+15; //rand from 15-30
        System.out.println(angkaI);

        float angkaF = rand.nextFloat();
        System.out.println(angkaF);
    }
}
