import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0;i<20;i++){
            numbers.add(i);
        }

        Iterator<Integer> numIterator = numbers.iterator();

        while(numIterator.hasNext()){
            System.out.print(numIterator.next()+" ");
        }
        System.out.println();

        for(int i = 0;i<numbers.size();i++){
            if(numbers.get(i) % 2 == 0){
                numbers.remove(i);
            }
        }

        for(int i = 0;i<numbers.size();i++){
            System.out.print(numbers.get(i) + " ");
        }
        
        
         
    }
}
