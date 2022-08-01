package latihan_practice_section_3;

import javax.swing.*;
import java.util.Scanner;

public class practices_3 {
    public static void main(String[] args) {
        //Your program must also do the following:
        //• Accept at least 1 input, to be parsed as a String
        //• Accept at least 1 input, to be parsed as an int
        //• Accept at least 1 input, to be parsed as a double
        //• Use at least 1 input in a question for the user
        //• Do math with at least 1 int input
        //• Do math with at least 1 double input
        //• Accept at least 10 total inputs
        //It’s ok for this problem set to write your entire program within the main method.

        //JOptionPane Method

        //Input Nama (String)
        String nama = JOptionPane.showInputDialog("Siapa namamu?");

        //Input umur (String)
        String strUmur = JOptionPane.showInputDialog("Berapa umurmu?");
        int umur = Integer.parseInt(strUmur);

        //Input tinggi badan (double)
        String strTinggiBadan = JOptionPane.showInputDialog("Berapa tinggi badanmu?");
        double tinggiBadan = Double.parseDouble(strTinggiBadan);

        //Input tahun lahir (int)
        String hobi = JOptionPane.showInputDialog("Apa Hobimu?");

        //Input Nama (String)
        String nama2 = JOptionPane.showInputDialog("Siapa nama kakakmu?");

        //Input umur (String)
        String strUmur2 = JOptionPane.showInputDialog("Berapa umur kakakmu?");
        int umur2 = Integer.parseInt(strUmur2);

        //Input tinggi badan (double)
        String strTinggiBadan2 = JOptionPane.showInputDialog("Berapa tinggi badan kakakmu?");
        double tinggiBadan2 = Double.parseDouble(strTinggiBadan2);

        //Input tahun lahir (int)
        String hobi2 = JOptionPane.showInputDialog("Apa Hobi kakakmu?");

        //Input Question (String) *Isi dengan "Ceritakan pengalaman perbincangan tentang dirimu dan salah satu anggota keluargamu..."*
        String question = JOptionPane.showInputDialog("Masukan Pertanyaannya...");

        //Menghitung Selisih Umur
        int selisihUmur = umur2 - umur;

        int umur5tahunLagi = umur + 5;

        double tinggiBadan12 = tinggiBadan + tinggiBadan2;
        double tinggiBadanbagi2 = (tinggiBadan + tinggiBadan2)/2;

        System.out.println();
        System.out.println("Question: " + question);
        System.out.println();
        System.out.println("Pada siang hari " + nama + " bertanya kepada kakaknya " + nama2 + ". ");
        System.out.println(nama + " ingin tahu berapa selisih umur " + nama + " dengan " + nama2 + " kakaknya");
        System.out.println(nama2 + " menjawab bahwa selisih umur " + nama2 + " dan " + nama + " adalah " + selisihUmur +" tahun.");
        System.out.println(nama2 + " juga menjawab dalam waktu 5 tahun lagi "+nama+" akan berumur " + umur5tahunLagi + " tahun.");
        System.out.println();
        System.out.println("Kakakku dan aku memiliki hobi yang unik kakakku suka hobi " + hobi2 + " dan aku suka hobi " + hobi + ". ");
        System.out.println();
        System.out.println("Tinggi badan ku hanya " + tinggiBadan + " tetapi kakakku " + tinggiBadan2 + ". ");
        System.out.println("Jika kedua tinggi badan ku digabung akan menjadi " + tinggiBadan12 +"... WOW, ");
        System.out.println("dengan tinggi badan "+tinggiBadan12+" pasti bisa mancapai atap dirumah :),");
        System.out.println("tetapi jika tinggi aku dan kakakku di bagi 2 akan menjadi " + tinggiBadanbagi2 + " jadi pendek :')");

        JOptionPane.showMessageDialog(null, "Question: " + question + "\n" +
                "\n" +
                "Pada siang hari " + nama + " bertanya kepada kakaknya " + nama2 + ". \n" +
                nama + " ingin tahu berapa selisih umur " + nama + " dengan " + nama2 + " kakaknya\n" +
                nama2 + " menjawab bahwa selisih umur " + nama2 + " dan " + nama + " adalah " + selisihUmur +" tahun.\n" +
                nama2 + " juga menjawab dalam waktu 5 tahun lagi "+nama+" akan berumur " + umur5tahunLagi + " tahun. \n" +
                "\n" +
                "Kakakku dan aku memiliki hobi yang unik kakakku suka hobi " + hobi2 + " dan aku suka hobi " + hobi + ". \n" +
                "\n" +
                "Tinggi badan ku hanya " + tinggiBadan + " tetapi kakakku " + tinggiBadan2 + ". \n" +
                "Jika kedua tinggi badan ku digabung akan menjadi " + tinggiBadan12 +"... WOW, \n" +
                "dengan tinggi badan "+tinggiBadan12+" pasti bisa mancapai atap dirumah :),\n" +
                "tetapi jika tinggi aku dan kakakku di bagi 2 akan menjadi " + tinggiBadanbagi2 + " jadi pendek :')");

//        //Scanner Method
//        Scanner sc = new Scanner(System.in);
//
//        //Input Nama (String)
//        System.out.println("Siapa namamu?");
//        System.out.print("ans: ");
//        String nama = sc.nextLine();
//
//        //Input umur (String)
//        System.out.println("Berapa umurmu?");
//        System.out.print("ans: ");
//        int umur = sc.nextInt();
//
//        //Input tinggi badan (double)
//        System.out.println("Berapa tinggi badanmu?");
//        System.out.print("ans: ");
//        double tinggiBadan = sc.nextDouble();
//
//        //Input tahun lahir (int)
//        System.out.println("Apa Hobimu?");
//        System.out.print("ans: ");
//        String hobi = sc.next();
//        sc.nextLine();
//
//        //Input Nama2 (String)
//        System.out.println("Siapa namamu kakakmu?");
//        System.out.print("ans: ");
//        String nama2 = sc.nextLine();
//
//        //Input umur (String)
//        System.out.println("Berapa umurmu kakakmu?");
//        System.out.print("ans: ");
//        int umur2 = sc.nextInt();
//
//        //Input tinggi badan (double)
//        System.out.println("Berapa tinggi badanmu kakakmu?");
//        System.out.print("ans: ");
//        double tinggiBadan2 = sc.nextDouble();
//
//        //Input tahun lahir (int)
//        System.out.println("Apa hobi kakakmu?");
//        System.out.print("ans: ");
//        String hobi2 = sc.next();
//        sc.nextLine();
//
//        //Input Question (String) *Isi dengan "Ceritakan pengalaman perbincangan tentang dirimu dan salah satu anggota keluargamu..."*
//        System.out.println("Input Question?");
//        System.out.print("ans: ");
//        String question = sc.nextLine();
//        sc.close();
//
//        //Menghitung Selisih Umur
//        int selisihUmur = umur2 - umur;
//
//        int umur5tahunLagi = umur + 5;
//
//        double tinggiBadan12 = tinggiBadan + tinggiBadan2;
//        double tinggiBadanbagi2 = (tinggiBadan + tinggiBadan2)/2;
//
//        System.out.println();
//        System.out.println("Question: " + question);
//        System.out.println();
//        System.out.println("Pada siang hari " + nama + " bertanya kepada kakaknya " + nama2 + ". ");
//        System.out.println(nama + " ingin tahu berapa selisih umur " + nama + " dengan " + nama2 + " kakaknya");
//        System.out.println(nama2 + " menjawab bahwa selisih umur " + nama2 + " dan " + nama + " adalah " + selisihUmur +" tahun.");
//        System.out.println(nama2 + " juga menjawab dalam waktu 5 tahun lagi kamu akan berumur " + umur5tahunLagi + " tahun.");
//        System.out.println();
//        System.out.println("Kakakku dan aku memiliki hobi yang unik kakakku suka hobi " + hobi2 + " dan aku suka hobi " + hobi + ". ");
//        System.out.println();
//        System.out.println("Tinggi badan ku hanya " + tinggiBadan + " tetapi kakakku " + tinggiBadan2 + ". ");
//        System.out.println("Jika kedua tinggi badan ku digabung akan menjadi " + tinggiBadan12 +"... WOW, ");
//        System.out.println("dengan tinggi badan "+tinggiBadan12+" pasti bisa mancapai atap dirumah :),");
//        System.out.println("tetapi jika tinggi aku dan kakakku di bagi 2 akan menjadi " + tinggiBadanbagi2 + " jadi pendek :')");
    }
}
