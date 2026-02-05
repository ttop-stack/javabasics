import java.util.*;

public class queueExamples_Acosta{

    public static void main(String[] args) {

        System.out.println("Today we will go over some queue examples");
        System.out.println("We will create a queue instance");
        System.out.println("adding elements to the queue");
        System.out.println("removing the head of the queue");
        System.out.println("Examining the head of the queue");
        System.out.println("and finally iterating over the queue");

        List<String> listNames = Arrays.asList("Billy", "Bob", "Bo", "Bobby", "Buck");
        Queue<String> namesQueue = new LinkedList<>(listNames);

        System.out.println("Here is the queue of names" + namesQueue);

        System.out.println("to add an element at the tail of the queue we can use .add()");
        namesQueue.add("Bobby Jo");
        System.out.println("Here is the queue after adding an element" + namesQueue);

        System.out.println("To remove the first or last elemnent of the queue, we use pollFirst() and pollLast() respectively");
        System.out.println("here is our current queue" + namesQueue);
        namesQueue.pollFirst();
        namesQueue.pollLast();

        System.out.println("I removed some elements so lets take a look at the head of the queue");
        System.out.println(namesQueue.peek());

        System.out.println("for iterating we can use a simple lambda expression");
        namesQueue.forEach(name -> System.out.println("==>" + name));







    }


}