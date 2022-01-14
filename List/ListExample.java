import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> newNames = new Vector<>();

        // Adding new items to list
        names.add("Miles");
        names.add("Jacky");
        names.add("Alice");
        names.add("Pedro");
        names.add("Jobs");

        // Adding new items to vector list
        newNames.add("Henriques");
        newNames.add("Andre");

        // Adds a Collection of items to a list
        names.addAll(newNames);

        System.out.println(names);
        Collections.sort(names); //Sorts an ArrayList
        System.out.println(names);

        names.set(3, "Kiles"); // Alters item at specified position

        // Removes item at specified position
        // names.remove(4);

        final String nome = names.get(3);

        System.out.println(nome);

        // System.out.println(names.contains("Jacob"));
        // System.out.println(names.isEmpty());
        // System.out.println(names.indexOf("Kiles"));

        // Printing out names using for loop
        /*for (String name : names) {
            System.out.println(name);
        }*/

        Iterator<String> name = names.iterator();

        // Printing out names using Iterators
        while(name.hasNext()) {
            System.out.println(name.next());
        }



    }
}
