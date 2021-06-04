//Jorge Carlos


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;



/**
 *
 * @author Jorge
 */

import java.util.*;

public class Bot {
    public int attackNum;
    public int protectNum;
    
    public String charName;
    public int charHealth;
    public String charRole;
    
    
    /*
    public void test()
    {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(10);
        
    }
    */
    //Constructor and makes all components global for later use 
    public Bot(String name, int health, String role, boolean comp)
    {
        charName = name;
        charHealth= health;
        charRole = role;
        
    }
    public void deadCards()
    {
        //We want to grab all of the players that have died 
    }
    public void behavior()
    {
        //Give all oposing players a value that is a threat to them 
        //Could attack this by adding certain values from each character and found clues from playing
        
    }
    public void roll()
    {
        //Roll dice and reroll based on what is in players best intrest 
        Dice dice1 = new Dice(0);
        Dice dice2 = new Dice(0);
        Dice dice3 = new Dice(0);
        Dice dice4 = new Dice(0);
        Dice dice5 = new Dice(0);
        dice1.roll();
        dice2.roll();
        dice3.roll();
        dice4.roll();
        dice5.roll();
        
        
    }
    public void attack()
    {
        
    }
    public void turn()
    {
        //Figure out how to go about going the turn of the bot
    }
    
}
/*
Bot case7Bot1 = new Bot(char_cards.get(1).name, char_cards.get(1).hp, role_cards.get(1).role, true);
                    Bot case7Bot2 = new Bot();
                    Bot case7Bot3 = new Bot();
                    Bot case7Bot4 = new Bot();
                    Bot case7Bot5 = new Bot();
                    Bot case7Bot6 = new Bot();
                    Bot case7Bot7 = new Bot();
*/