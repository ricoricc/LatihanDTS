public class Chickens01 {
    public static void main(String[] args) {
        float a = 9.5f;
        a = 100;


        double eggsPerChicken = 5.0;
        double chickenCount = 3.0;

        double totalEggs = (chickenCount * eggsPerChicken) + ((chickenCount+1) *eggsPerChicken)  + (((chickenCount+1) * eggsPerChicken)/2);
        System.out.println("5, 3: " + totalEggs + " Eggs");

        eggsPerChicken = 4.0;
        chickenCount = 8.0;
        totalEggs = (chickenCount * eggsPerChicken) + ((chickenCount+1) *eggsPerChicken)  + (((chickenCount+1) * eggsPerChicken)/2);
        System.out.println("4, 8: " + totalEggs + " Eggs");
    }
}
