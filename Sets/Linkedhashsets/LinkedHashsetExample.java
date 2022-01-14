package Linkedhashsets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numberSequence = new LinkedHashSet<>();

        // Adding numbers to LinkedHashSet
        numberSequence.add(93);
        numberSequence.add(3);
        numberSequence.add(9);
        numberSequence.add(1);
        numberSequence.add(4);
    
        // Does not alter order elements have been added
        System.out.println("LinkedHashSet::: " + numberSequence);

        numberSequence.remove(1);

        Iterator<Integer> numbersIterator = numberSequence.iterator();

        while(numbersIterator.hasNext()) {
            System.out.println("Number ==>> " + numbersIterator.next());
        }

        System.out.println("Is Empty =>>>>.. " + numberSequence.isEmpty());

    }
}
