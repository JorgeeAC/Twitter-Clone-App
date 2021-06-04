
/* CS 2365 OOP Spring 2020
Mihir Patel 
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpro;

/**
 *
 * @author Mihir
 */
public class Queue
{
    // declare variables
    private static int capacity;
    private static int counter = 0;
    private static String queue[];

    // create new queue array
    Queue(int c)
    {
        capacity = c;
        queue = new String[capacity];
    }

    // function to insert an element at the rear of the queue
    static void enqueue(String in)
    { 
        // check if the queue is full
        if (counter == queue.length)
        {
            System.out.println("\nQueue is full\n");
        }
  
        // insert element at the rear
        else
        {
            System.out.println("Inserting: " + in);
            queue[counter] = in;
            counter++;
        }
    }

    // function to delete an element from the front of the queue
    static String dequeue()
    {
        // check if the queue is empty
        if (counter == 0)
        {
            System.out.println("\nQueue is empty\n");
            return null;
        }

        // shift all the elements to the right by one
        else
        {
            String s = queue[0];
            
            System.out.println("Removing: " + queue[0]);
            
            for (int i = 0; i < counter - 1; i++)
            {
                queue[i] = queue[i + 1];
            }
  
            // store null at the rear indicating there's no element
            if (counter < capacity)
                queue[counter] = "";
  
            // decrement counter
            counter--;
            
            return s;
        }
    }

    // print queue elements
    static void display()
    {
        if (counter == 0)
        {
            System.out.println("\nQueue is Empty\n");
            return;
        }
        
        System.out.println("");
        System.out.println("Printing elements of queue: ");
  
        // traverse front to rear and print queue elements
        for (int i = 0; i < counter; i++)
        {
            System.out.println("Element " + i + ": " + queue[i]);
        }

        System.out.println("");
    }

    // function to print front element of the queue
    static String front()
    {
        // check if the queue is empty
        if (counter == 0)
        { 
            System.out.println("\nQueue is Empty\n");
            return null;
        }
        
        // print front element
        System.out.println("Front element is: " + queue[0] + "\n");

        return queue[0];
    }

    // function to print rear element of the queue 
    static String rear()
    {
        // check if the queue is empty
        if (counter == 0)
        {
            System.out.println("\nQueue is Empty\n");
            return null;
        }

        // print the rear element
        System.out.println("Rear element is: " + queue[counter] + "\n");

        return queue[counter];
    }

    Queue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
