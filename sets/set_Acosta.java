import java.util.*;

class Helper implements Comparator<String> {
    
    public int compare(String s1, String s2) {

        String first_s;
        String second_s;

        first_s = s1;
        second_s = s2;

        // using compareTo() to ensure
        return second_s.compareTo(first_s);
    }
}

public class set_Acosta {

    public static void main(String[] args) {

        System.out.println("Lets create some sets, we will start witht the hashset");
        Set<Integer> nums = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Here is the hashset" + nums);
        System.out.println("Now lets create a LinkedHashSet");
        Set<Integer> linkednums = new LinkedHashSet<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println("Here is the linked hashset" + linkednums);
        System.out.println("Now lets create a TreeSet");
        Set<Integer> treenums = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        System.out.println("Here is the treeset" + treenums);

        System.out.println("hmmm cool right! lets do some basic operations");
        System.out.println("Lets add an element to the hashset");
        nums.add(6);
        System.out.println("Here is the hashset after adding an element" + nums);
        System.out.println("I dont like 6, lets remove it");
        nums.remove(6);
        System.out.println("Here is the hashset after removing 6" + nums);
        System.out.println("easy peesy, lets check for emptiness???");
        System.out.println("Is the hashset empty? " + nums.isEmpty());
        System.out.println("duh it aint empty,");
        System.out.println("lets see how many elemnts are in the hashset");
        System.out.println("The size of the hashset is " + nums.size());
        System.out.println("Im getting sleepy, lets iterate through the hashset");

        Iterator<Integer> iterator = nums .iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
            }


        System.out.println("right on, lets go searching now!");

        System.out.println("Does the magic hashset contain 3? " + nums.contains(3));
        System.out.println("Does the magic hashset contain 10? " + nums.contains(10));

        System.out.println("Im done with the sets because its time to bulk!");
        System.out.println("lets do bulk operations between two sets!!");

        System.out.println("Lets find the union of the hashset and this new one we will make");
            Set<Integer> newnums = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
            System.out.println("Here is the new hashset" + newnums);
            System.out.println("here is the old hashset as a reminder" + nums);
            nums.add(newnums);
            System.out.println("Now they are married"+ nums);
            System.out.println("Now lets find the intersection of the two sets");
            nums.retainAll(newnums);
            System.out.println("The intersection of the two sets is" + nums);
            System.out.println("Now lets find the difference of the two sets");
            nums.removeAll(newnums);
            System.out.println("The difference of the two sets is" + nums);

            System.out.println("okay okay nowwww i will create a TreeSet containing Strings and Display all elements in the Treeset");

            TreeSet<String> tree_set = new TreeSet<String>();
            tree_set.add("Apple");
            tree_set.add("Banana");
            tree_set.add("Cherry");
            tree_set.add("Mango");
            tree_set.add("Blueberry");
            System.out.println("The TreeSet is " + tree_set);

            System.out.println("the tree set is sorted in natural order, lets see how to sort it in reverse order");

            TreeSet<String> tree_set1 = new TreeSet<String>(new Helper());
            tree_set1.add("Apple");
            tree_set1.add("Banana");
            tree_set1.add("Cherry");
            tree_set1.add("Mango");
            tree_set1.add("Blueberry");

            System.out.println("The TreeSet in reverse order is " + tree_set1);
       
            System.out.println("That was the review of sets! bon voyage!");


    }



}