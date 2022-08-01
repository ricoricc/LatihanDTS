import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylistContoh {
    public static void main(String[] args) {
        ArrayList<String> students;

        students = new ArrayList<>();

            students.add("Amy");
            students.add("Bob");
            students.add("Cindy");
            students.add("David");

        Iterator<String> iterator = students.iterator();

        ListIterator<String> listIterator = students.listIterator();

//        System.out.println("Printing elements in students array...");
//            for(int i = 0;i< students.size();i++){
//                System.out.println(students.get(i));
//            }
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println("students ArrayList size is " + students.size());
    }
}
