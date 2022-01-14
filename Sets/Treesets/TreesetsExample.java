package Treesets;

import java.util.TreeSet;

public class TreesetsExample {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();

        // Adding cities to tree
        cities.add("Luanda");
        cities.add("Bié");
        cities.add("Cabinda");
        cities.add("Benguela");
        cities.add("Huambo");
        cities.add("Malanje");
        cities.add("Lunda Norte");
        cities.add("Namibé");
        cities.add("Móxico");

        // Printing out tree
        System.out.println(" Cities ==>> " + cities);

        // Getting first element on tree
        System.out.print("First City: " + cities.first());

        // Getting last element on tree
        System.out.print("\nLast City: " + cities.last());


        // Get element at left node of specified branch on tree
        System.out.println("\nNode Left of Huambo: " + cities.lower("Huambo"));
        
        // Get element at right node of specified branch on tree
        System.out.println("\nNode Right of Cabinda: " + cities.higher("Cabinda"));

        // Removing last node
        System.out.println("\nRemoving Node: " + cities.pollLast());

        // Cities after removing node
        System.out.println(" Cities ==>> " + cities);

        // Empty tree
        cities.clear();

        // Verify tree size
        System.out.println("\nCities size: " + cities.size());

        // Verify if tree is empty
        System.out.println("\nIs Cities Empty: " + cities.isEmpty());

    }
}
