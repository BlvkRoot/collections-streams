import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Adding new items to list
        names.add("Miles");
        names.add("Jacky");
        names.add("Alice");
        names.add("Pedro");
        names.add("Jobs");

        System.out.println(names);
        Collections.sort(names); //Sorts an ArrayList
        System.out.println(names);

        names.set(3, "Kiles"); // Alters item at specified position

        // Removes item at specified position
        // names.remove(4);

        final String nome = names.get(3);

        System.out.println(nome);

        System.out.println(names.contains("Jacob"));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Kiles"));



    }
}
