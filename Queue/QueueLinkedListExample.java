package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {
    public static void main(String[] args) {
        Queue<String> bankList = new LinkedList<>();

        bankList.add("Henriques");
        bankList.add("Angela");
        bankList.add("Bianca");

        System.out.println(bankList);
    }
}
