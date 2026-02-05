import java.util.*;

class Skateboarder implements Comparable<Skateboarder> {
    private String name;
    private int rating;
    private int networth;

    public Skateboarder(String name, int rating, int networth) {
        this.name = name;
        this.rating = rating;
        this.networth = networth;
    }

    public int getNetworth() {
        return networth;
    }

    @Override
    public int compareTo(Skateboarder other) {
        return Integer.compare(this.rating, other.rating);
    }

    @Override
    public String toString() {
        return String.format("(%s, %d, %d)", name, rating, networth);
    }
}

class SkaterNetworthComparator implements Comparator<Skateboarder> {
    @Override
    public int compare(Skateboarder s1, Skateboarder s2) {
        return s1.getNetworth() - s2.getNetworth();
    }
}

public class ListSorting_Acosta {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Kiwi", "Orange", "Mango", "Grapes"));

        System.out.println("Original list" + fruits);
        System.out.println("Lets sort the list");
        Collections.sort(fruits);
        System.out.println("Sorted list is" + fruits);
        System.out.println("Cool that sorted the list but it sorted it in ascending order. How about sorting it in descending order?");
        Collections.reverse(fruits);
        System.out.println("The sorted list in descending order is" + fruits);
        System.out.println("That wasnt too bad right? but the list was predefined. What if we wanted to sort a list whose elements are a custom type? ");

        System.out.println("Lets do a custom type of skateboarders and compare them by their rating");

        List<Skateboarder> skaters = new ArrayList<>();

        skaters.add(new Skateboarder("Tony Hawk", 99, 10000000));
        skaters.add(new Skateboarder("Bob Burnquist", 95, 800000));
        skaters.add(new Skateboarder("Tomas Acosta", 45, 600));
        skaters.add(new Skateboarder("Nyjah Huston", 90, 50000000));

        System.out.println("here is the skater list" + skaters);

        System.out.println("Lets sort them by their rating");
        Collections.sort(skaters);
        System.out.println("Voila!" + skaters);

        System.out.println("And for my final act, I will sort the skaters by their networth using the great Comparator");

        System.out.println("After another class created in the mystical land of Java, the skaters sorted networth is");
        Collections.sort(skaters, new SkaterNetworthComparator());
        System.out.println(skaters);
    }
}