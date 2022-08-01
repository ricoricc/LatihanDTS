import java.util.Scanner;

public class switchComparation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tgl=in.nextInt();
        int bln=in.nextInt();
        int thn=in.nextInt();

        int jumHari=0;
        switch (bln){
            case 4: case 6: case 9: case 11:
                jumHari=30;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jumHari=31;
                break;
            case 2:
                if(thn % 400 ==0)
                    jumHari=29;
                else if(thn%4==0 && thn%100!=0)
                    jumHari=29;
                else
                    jumHari=28;
        }
        if(tgl>0 && tgl<=jumHari)
            System.out.println(tgl+"-"+bln+"-"+thn+" valid");
        else
            System.out.println(tgl+"-"+bln+"-"+thn+" tidak valid");
    }
}
