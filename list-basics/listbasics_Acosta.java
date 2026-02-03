import java.util.*;

public class listbasics_Acosta {

    //Scanner and List initialization
    private static Scanner sc = new Scanner(System.in);
    private static List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        // Collecting 5 integers from the user
        System.out.println("Please enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            nums.add(sc.nextInt());
        }
        System.out.println("The list: " + nums);

        Menu();
        sc.close();
    }

    private static void Menu() {
        int choice;
        do {
            System.out.println("\n=== LIST OPERATIONS MENU ===");
            System.out.println("Current list: " + nums);
            System.out.print("Enter choice (0-11): ");
            choice = sc.nextInt();
            
            switch (choice) {

                case 1:
                    System.out.println("1. Basic List operations");
                    basicOperations();
                    break;
                case 2:
                    System.out.println("2. Iterate over elements");
                    iterateElements();
                    break;
                case 3:
                    System.out.println("3. Search for element");
                    searchElement();
                    break;
                case 4:
                    System.out.println("4. Sort list");
                    sortList();
                    break;
                case 5:
                    System.out.println("5. Copy list elements");
                    copyList();
                    break;
                case 6:
                    System.out.println("6. Shuffle list");
                    shuffleList();
                    break;
                case 7:
                    System.out.println("7. Reverse list");
                    reverseList();
                    break;
                case 8:
                    System.out.println("8. Extract portion");
                    extractPortion();
                    break;
                case 9:
                    System.out.println("9. Convert List/Array");
                    convertListArray();
                    break;
                case 10:
                    System.out.println("10. List to Stream");
                    streamOperations();
                    break;
                case 11:
                    System.out.println("11. Concurrent lists");
                    concurrentLists();
                    break;
                case 0:
                    System.out.println("Program Complete :)");
                    break;
                
            }
        } while (choice != 0);
    }

    private static void basicOperations() {
        System.out.println("\n--- Basic List Operations ---");
        System.out.println("Current list: " + nums);
        System.out.println("1. Add element  2. Retrieve element  3. Remove element  4. Update element");
        System.out.print("Choose operation: ");
        int operation = sc.nextInt();
        
        switch (operation) {
            case 1: 
                System.out.print("Enter number to add");
                int valueToAdd = sc.nextInt();
                nums.add(valueToAdd);
                System.out.println("Added " + valueToAdd + " at end. List is " + nums);
                break;
                
            case 2: // Retrieve element
                System.out.print("Enter index to retrieve: ");
                int index = sc.nextInt();
                if (index >= 0 && index < nums.size()) {
            
                    Integer element = nums.get(index);
                    System.out.println("Element at index " + index + " is: " + element);
                } else {
                    System.out.println("Invalid index!");
                }
                break;
                
            case 3: // Remove element
                System.out.print("Enter index to remove (0-" + (nums.size()-1) + "): ");
                int removeIndex = sc.nextInt();
                if (removeIndex >= 0 && removeIndex < nums.size()) {
                    Integer removed = nums.remove(removeIndex);
                    System.out.println("Removed " + removed + " from index " + removeIndex + ". List is " + nums);
                } else {
                    System.out.println("Invalid index!");
                }
                break;
            case 4: // Update element
                System.out.print("Enter index to update ");
                int updateIndex = sc.nextInt();
                System.out.print("Enter new value ");
                int newValue = sc.nextInt();
                nums.set(updateIndex, newValue);
                System.out.println("Updated index " + updateIndex + " to " + newValue + ". List is " + nums);
               
                break;
        }
    }
    private static void iterateElements() {
        nums.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    private static void searchElement() {
        System.out.print("Enter element to search ");
        int target = sc.nextInt();
        
        if (nums.contains(target)) {
            System.out.println(target + " found in the list");
        } else {
            System.out.println(target + " not found in the list");
        }
    }
    private static void sortList() {
        System.out.println("List is: " + nums);
        Collections.sort(nums);
        System.out.println("Sorted list is: " + nums);
    }
    private static void copyList() {
        List<Integer> copy = new ArrayList<>(nums);
        System.out.println("Copied list is: " + copy);
    }
    private static void shuffleList() {
        System.out.println("List is: " + nums);
        Collections.shuffle(nums);
        System.out.println("Shuffled list is: " + nums);
    }
    private static void reverseList() {
        System.out.println("List is: " + nums);
        Collections.reverse(nums);
        System.out.println("Reversed list is: " + nums);
    }
    private static void extractPortion() {
        System.out.print("Enter starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter ending index: ");
        int end = sc.nextInt();
        List<Integer> portion = nums.subList(start, end);
        System.out.println("Extracted portion is: " + portion);
    }
    private static void convertListArray() {
        Integer[] array = nums.toArray(new Integer[0]);
        System.out.println("Converted array: " + Arrays.toString(array));
    }
    private static void streamOperations() {
        System.out.println("List elements using stream:");
        nums.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
    private static void concurrentLists() {
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>(nums));
        System.out.println("Synchronized list is: " + syncList);
    }

}
