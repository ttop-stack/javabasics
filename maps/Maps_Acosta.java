import java.util.*;



public class Maps_Acosta {
    
    public static void main(String[] args){

        System.out.println("We will make some maps today");
        System.out.println("We will make hashmaps, linked hashmaps, and treemaps");

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Big Mac");
        hashMap.put(2, "McChicken");
        hashMap.put(3, "McNuggets");
        hashMap.put(4, "McRib");

        System.out.println("Here is the hashmap of food items" + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "Coke");
        linkedHashMap.put(2, "Sprite");
        linkedHashMap.put(3, "Fanta");
        linkedHashMap.put(4, "Dr. Pepper");

        System.out.println("Here is the linked hashmap of vending machine drinks" + linkedHashMap);

        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("Nǐhǎo", "Hello");
        treeMap.put("Zàijiàn", "Goodbye");
        treeMap.put("Qǐng", "Please");
        treeMap.put("Xièxiè", "Thank you");

        System.out.println("Here is the treemap of chinese words and their english translations" + treeMap);

        System.out.println("We will now perfrom basic operations on the hashmap");
        System.out.println("such as put(), get(), containsKey(), containsValue(),remove(), replace(), size() and isEmpty()");
        System.out.println("Lets add a new item to the menu");
        hashMap.put(5, "Fries");
        System.out.println("Here is the hashmap after adding an item" + hashMap);
        System.out.println("Lets get the item number 3 from the menu" + hashMap.get(3));
        System.out.println("Does the menu have the number 2? " + hashMap.containsKey(2));
        System.out.println("Does the menu have 'McRib'? " + hashMap.containsValue("McRib"));
        System.out.println("I dont like the McRib, lets remove it");
        hashMap.remove(4);
        System.out.println("Here is the menu after removing the McRib" + hashMap);
        System.out.println("Lets replace item number 1 with a Quarter Pounder");
        hashMap.replace(1, "Quarter Pounder");
        System.out.println("Here is the menu after the replacement" + hashMap);
        System.out.println("How many items are on the menu? " + hashMap.size());
        System.out.println("Is the menu empty? " + hashMap.isEmpty());

        System.out.println("Now we will iterate through the elemtns using using keyset(), values() and entrySet()");

        System.out.println("Iterating using keyset()");

        Set<Integer> setKeys = hashMap.keySet();
        Iterator<Integer> iterator = setKeys.iterator();
 
            while (iterator.hasNext()) {
                Integer itemNumber = iterator.next();
                String menuItem = hashMap.get(itemNumber);
            
                System.out.println(itemNumber + " => " + menuItem);
            }
        System.out.println("Iterating using values()");

        Collection<String> menuItems = hashMap.values();
        
        for (String menuItem : menuItems) {
            System.out.println(menuItem);
        }

        System.out.println("Iterating using entrySet()");

        Set<Map.Entry<Integer, String>> Entree = hashMap.entrySet();
        
 
        for (Map.Entry<Integer, String> entry : Entree) {
            Integer number  = entry.getKey();
            String menuEntree = entry.getValue();
        
            System.out.println(number + " => " + menuEntree);
        }

        System.out.println("Now we will do some bulk operations");
        System.out.println("such as putAll() and clear()");

        System.out.println("well clear is easy, it basically empties the map");
        System.out.println("Lets clear the linked hashmap of vending machine drinks");
        linkedHashMap.clear();
        System.out.println("lets confirm its empty. Is the magic linked hashmap of vending machine drinks empty? " + linkedHashMap.isEmpty());
        System.out.println("Now for putAll(), it basically merges two maps together");

        System.out.println("I will create another map of food items to merge with the original menu");
        Map<Integer, String> newHashMap = new HashMap<>();
        newHashMap.put(6, "McFlurry");
        newHashMap.put(7, "McCafe");
        newHashMap.put(8, "McSalad");
        System.out.println("Here is the new hashmap of food items" + newHashMap);
        System.out.println("Here is the original menu as a reminder" + hashMap);
        System.out.println("Now we will combine and morph the menus into one");
        hashMap.putAll(newHashMap);
        System.out.println("Here is the menu after the merge" + hashMap);

        System.out.println("Now we will create a treemap to match movies to their ratings");
        System.out.println("We will also use a special custom comparator to sort them in descending order!");

        SortedMap<String, Double> movies  = new TreeMap<>();

        movies.put("Inception", 8.8);
        movies.put("The Dark Knight", 9.0);
        movies.put("Interstellar", 8.6);
        movies.put("Dunkirk", 7.9);

        System.out.println("Here is our small treempas of movies" + movies);

        System.out.println("Notice how the movies are sorted in alphabetical order, lets change that with a custom comparator");

        SortedMap<String, Double> moviesDescending = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String movie1, String movie2) {
                return movie2.compareTo(movie1);
            }
        });

        System.out.println("And with our custom comparator, here is the new treemap of movies sorted in descending order" + moviesDescending);

        System.out.println("Thats all she wrote folks, goodbye");
        





        




 








    }


}