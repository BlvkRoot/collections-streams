package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {
    public static void main(String[] args) {
        Queue<String> bankList = new LinkedList<>();

        bankList.add("Henriques");
        bankList.add("Angela");
        bankList.add("Bianca");

        System.out.println(bankList);

        // Return first item from linkedList and remove
        /*
         * String clientToBeAssisted = bankList.poll();
         * 
         * System.out.println(clientToBeAssisted);
         * 
         * System.out.println(bankList);
         */

        // Return first item or null from Queue 
        String firstClient = bankList.peek();

        System.out.println(firstClient);

        System.out.println(bankList);

        // Empty Queue
        // bankList.clear();

        // Return first item or error from Queue
        String firstClientOrError = bankList.element();

        System.out.println(firstClientOrError);

        System.out.println(bankList);

        Iterator<String> clientList = bankList.iterator();

        while (clientList.hasNext()) {
            System.out.println(clientList.next());
        }
        
    }
}
