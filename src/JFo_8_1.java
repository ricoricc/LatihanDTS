import java.util.Scanner;

public class JFo_8_1 {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        char[] sentence = new char[100];
        double[] teamPoints = new double[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<myArray.length;i++){
            myArray[i] = sc.nextInt();
        }
        for(int i = 0;i<teamPoints.length;i++){
            teamPoints[i] = sc.nextDouble();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
    void printInt(){
        System.out.println();
    }
}
