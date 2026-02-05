import java.util.*;

public class priorityQueue_Acosta {

    public static void main(String[] args) {

        System.out.println("lets make a priority queue!");

        // Max heap comparator - largest elements removed first
        PriorityQueue<Integer> nums = new PriorityQueue<>((a, b) -> b - a);

        nums.add(8);
        nums.add(6);
        nums.add(7);
        nums.add(5);
        nums.add(3);
        nums.add(0);
        nums.add(9);

        System.out.println("Our priority queue is as follows ==> " + nums);

        System.out.println("We created a comparator (a, b) -> b - a  that we placed in the constructor of the priority queue "
       + "This means that the largest elements will be removed first when we call poll()");
        
        System.out.println("lets see how it works");
        while (!nums.isEmpty()) {
            System.out.println("Removed ==>" + nums.poll());
        }
        
        



    }


}


