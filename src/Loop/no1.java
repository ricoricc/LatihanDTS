package Loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("M=");
        int m = sc.nextInt();
        System.out.print("N=");
        int n = sc.nextInt();

        System.out.println();

        System.out.println("No 1");
        for(int i = m;i< n;i++){
            if(i%3==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("No 2");
        int calResult = 0;
        for(int i = m;i<= n;i++){
            if(i != n){
                calResult += i;
            System.out.print(i+"+");
            }
            else {
                calResult += i;
                System.out.print(i+" = "+ calResult);
            }
        }

        System.out.println("No 3");
        int n1=0,n2=1,n3,i,count=7, no3Result = 1;
        System.out.print(n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            no3Result +=n3;
            n1=n2;
            n2=n3;
            if(i == count -1){
                System.out.println(" = "+ no3Result);
            }
        }

    }
}
