package input;

import java.util.Scanner;

public class InputDataScanner {
    public static void main(String[] args) {
        int a = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama: ");
        //Bisa langsung di print
//        System.out.println(sc.nextLine());
        String nama = sc.next();
        System.out.print("Masukan Angaktan: ");
        int angkatan = sc.nextInt();
        //Next line supaya untuk clear isi dari sc.nextInt() yang di atas,
        //karena ada isinya menyebabkan sc.nextLine() institusi keskip karena,
        //sc ada isinya / tidak kosong karena buffer keyboard
        sc.nextLine();
        System.out.print("Masukan Institusi: ");
        String institusi = sc.nextLine();
        System.out.println("Nama: "+ nama);
        System.out.println("Angkatan: "+ angkatan);
        System.out.println("Institusi: "+ institusi);
        sc.close();
    }
}
//        a = sc.nextInt();
