Java program for reversing a linked list using in-built collections class
import java.util.*;
  
public class Main 
{
    public static void main(String[] args)
    {
        // Declaring linkedlist without any initial size
        LinkedList<Integer> ll = new LinkedList<Integer>();
  
        // Appending elements at the end of the list
        ll.add(new Integer(1));
        ll.add(new Integer(2));
        ll.add(new Integer(3));
        ll.add(new Integer(4));
        ll.add(new Integer(5));
        System.out.println("The elements of the linked list before reversing: " + ll);
        // Collections.reverse method to reverse the list
        Collections.reverse(ll);
        System.out.println("The elements of the linked list after reversing: " + ll);
    }
}

The elements of the linked list before reversing: [1, 2, 3, 4, 5]
The elements of the linked list after reversing: [5, 4, 3, 2, 1]
