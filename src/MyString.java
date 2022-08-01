import java.sql.SQLOutput;

public class MyString {
    public static void main(String[] args) {
        String kalimat = new String ("Surabaya");
        String kal2 = "Kota Jakarta";
        int a = 1;
        int intkar=kal2.charAt(a);
        char charkar=kal2.charAt(a);
        System.out.println("Char["+a+"]: "+ intkar);
        System.out.println("Char["+a+"]: "+ charkar);
        System.out.println("Panjang String "+kal2+": "+kal2.length());

        int posisi = kal2.indexOf('a', 2);
        System.out.println("Index Of a from index 6: " + posisi);

        String temp = kal2.substring(3);
        System.out.println("Substring: " + temp);
        String temp2 = kal2.substring(3, 7);
        System.out.println("Substring dari index 3 -> 4: " + temp2);

        String str = "Using String replace to replace character";
        String newStr = str.replace("i", "XXX");
        String newStrString = str.replaceFirst("i", "XXX");
        System.out.println(str);
        System.out.println(newStr);
        System.out.println(newStrString);

        String namaUser = "Steve Smith";

        int indexSpasi = namaUser.indexOf(" ");
        String firstNameUser = namaUser.substring(0,indexSpasi);
        String lastNameUser = namaUser.substring(indexSpasi+1);
        System.out.println(firstNameUser);
        System.out.println(lastNameUser);

        String myString = "Hello";
        myString = myString.concat(" World!");
        myString = myString + "!!";
        System.out.println(myString);


    }
}
