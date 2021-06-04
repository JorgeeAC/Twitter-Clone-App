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
//import Deck.*;
public class TestPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Deck deck = new Deck();
       // Cards cards = new Cards([Blue],1);
       DiscardStack stack = new DiscardStack();
       //Hand hand = new Hand();
        Queue queue = new Queue(108);
        
        String[] test = new String[] {"Red 3","Green 3","Blue 4","Yellow 3","Red 6","Red 0","wiFour"};

        Hand something = new Hand();
        
        something.sort(test);
        something.count(test);
        something.interpret(test);
        
    
        /*
        //Deck.Deck[0].value();
       // System.out.println(deck.deck[].value);
        queue.enqueue("hey");
        queue.enqueue("hello");
        queue.display();
        
        stack.push("morning");
        stack.print();
        */
                
    }
    
}
