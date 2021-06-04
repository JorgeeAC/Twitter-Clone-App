package testpro;

/**
 *
 * @author Mihir
 */

public class Deck {     
    /*
String[] newValues= new String[] {
       "Blue 0","Blue 1","Blue 2","Blue 3","Blue 4","Blue 5","Blue 6","Blue 7","Blue 8","Blue 9",
       "Blue 1","Blue 2","Blue 3","Blue 4","Blue 5","Blue 6","Blue 7","Blue 8","Blue 9",
       "skip","reverse","draw2","skip","reverse","draw2","wild","wild4",
       "Red 0","Red 1","Red 2","Red 3","Red 4","Red 5","Red 6","Red 7","Red 8","Red 9",
       "Red 1","Red 2","Red 3","Red 4","Red 5","Red 6","Red 7","Red 8","Red 9",
       "skip","reverse","draw2","skip","reverse","draw2","wild","wild4",
       "Green 0","Green 1","Green 2","Green 3","Green 4","Green 5","Green 6","Green 7","Green 8","Green 9",
       "Green 1","Green 2","Green 3","Green 4","Green 5","Green 6","Green 7","Green 8","Green 9",
       "skip","reverse","draw2","skip","reverse","draw2","wild","wild4",
       "Yellow 0","Yellow 1","Yellow 2","Yellow 3","Yellow 4","Yellow 5","Yellow 6","Yellow 7","Yellow 8","Yellow 9",
       "Yellow 1","Yellow 2","Yellow 3","Yellow 4","Yellow 5","Yellow 6","Yellow 7","Yellow 8","Yellow 9",
       "skip","reverse","draw2","skip","reverse","draw2","wild","wild4"};    
*/
String[] values = new String[]{
    "Blue 0","Blue 1","Blue 2","Blue 3","Blue 4","Blue 5","Blue 6","Blue 7","Blue 8","Blue 9",
    "Blue 1","Blue 2","Blue 3","Blue 4","Blue 5","Blue 6","Blue 7","Blue 8","Blue 9",
    "Red 0","Red 1","Red 2","Red 3","Red 4","Red 5","Red 6","Red 7","Red 8","Red 9",
    "Red 1","Red 2","Red 3","Red 4","Red 5","Red 6","Red 7","Red 8","Red 9",
    "Green 0","Green 1","Green 2","Green 3","Green 4","Green 5","Green 6","Green 7","Green 8","Green 9",
    "Green 1","Green 2","Green 3","Green 4","Green 5","Green 6","Green 7","Green 8","Green 9",
    "Yellow 0","Yellow 1","Yellow 2","Yellow 3","Yellow 4","Yellow 5","Yellow 6","Yellow 7","Yellow 8","Yellow 9",
    "Yellow 1","Yellow 2","Yellow 3","Yellow 4","Yellow 5","Yellow 6","Yellow 7","Yellow 8","Yellow 9",
};

String [] actionCards = new String[]{
    "Red skip","Red reverse","Red draw2","Red skip","Red reverse","Red draw2","wild","wiFour",
    "Blue skip","Blue reverse","Blue draw2","Blue skip","Blue reverse","Blue draw2","wild","wiFour",
    "Yellow skip","Yellow reverse","Yellow draw2","Yellow skip","Yellow reverse","Yellow draw2","wild","wiFour",
    "Green skip","Green reverse","Green draw2","Green skip","Green reverse","Green draw2","wild","wiFour"};

    public Card[] create(){        
        Card[] deck;                    //Makes a deck of type Card array
        deck = new Card[108];
        Card.card(deck);                //actually makes the deck
        return deck;                    //Returns type Card[]
    }
    /*
    public void main(String[] args)
    {
        Card[] deck;
        deck = create();
        System.out.println(deck[53].color);
    }
*/
}
class Card {
   String color; 
   String value;
   
   public static void card(Card[] deck){
       /*
       String[] values = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
       "skip", "reverse", "draw2", "1", "2", "3", "4", "5", "6", "7", "8", "9",
       "skip", "reverse", "draw2", "wild", "wild4"};
       */
       
       
       //Changing this to make it easier to deal with Hand methods 
       
       
       
       String color;
       int counter = 0;
       
       for(int i = 0; i < 108; i++){
           if(i <= 26){
               color = "red";
           }
           else if(i <= 53){
               color = "yellow";
           }
           else if(i <= 80){
               color = "blue";
           }
           else{
               color = "green";
           }               
           /*
           deck[i] = new Card(color, values[counter]);
           */
                   counter++;
           if(counter > 26){
               counter = 0;
           }
       }
   }

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   public String getValue(){
       return this.value;
   }
   public String getColor(){
       return this.color;
   }
    
   private Card(String c, String v){
       this.color = c;
       this.value = v;
   }
    
}