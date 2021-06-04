//Ryan Browning

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bang;
import java.util.Random; 
/**
 *
 * @author Ryan
 */
public class Dice {
    String sides[] = new String[6];
    int side;
    
    public Dice(int side){
        this.side = side;
        sides[0] = "Indian Arrow";
        sides[1] = "Dynamite";
        sides[2] = "Bull's Eye 1";
        sides[3] = "Bull's Eye 2";
        sides[4] = "Beer";
        sides[5] = "Gatling";
    }
    
    public String keep(){
        return this.sides[this.side];
    }
    
    public String roll(){
        Random rand = new Random();  
        this.side = (rand.nextInt(10000000)%6);
        return sides[side];
    }
}