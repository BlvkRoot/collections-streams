package sets;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Double> coins = new HashSet<>();

        coins.add(3.2);
        coins.add(5.2);
        coins.add(3.76);
        coins.add(0.2);
        coins.add(9.8);
        coins.add(6.3);
        coins.add(98.2);

        System.out.print(coins);

        Iterator<Double> coinIterator = coins.iterator();

        while (coinIterator.hasNext()) {
            System.out.println("Coins =>> " + coinIterator.next());
        }
    }
}
