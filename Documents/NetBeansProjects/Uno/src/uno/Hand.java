

//Jorge Carlos
//Rough draft think this will work but have not extensively tested (INCOMPLETE at the moment)
//Please feel free to add/fix somethings I've done not extremely proud of this 



package uno;


public class Hand 
{
    
    public String sort(Card orgHand[])
    {
        int size=orgHand.length;
        int j=0;
        Card newHand[];
        newHand = null;
        //Going to check which of the special cards we will get 
        //Then we will sort them by precedence 
        for(int i=0;i<size;i++)
        {
            //First ones set to the new array
            //Should get each color to go in order, will then go in order of wilds
            switch (orgHand[i].color) {
                case "blue":
                    //Do this to make 
                    j=i;
                    while(j<size)
                    {
                        if(orgHand[i].color.equals("blue"))
                        {
                        newHand[i]=orgHand[i];                            
                        }
                        j++;
                    }
                    j=0;
                    break;
                    
                case "red":
                    j=i;
                    while(j<size)
                    {
                        if(orgHand[i].color.equals("red"))
                        {
                        newHand[i]=orgHand[i];                            
                        }
                        j++;
                    }
                    j=0;
                    break;
                case "yellow":
                    newHand[i]=orgHand[i];
                    j=i;
                    while(j<size)
                    {
                        if(orgHand[i].color.equals("yellow"))
                        {
                        newHand[i]=card[i];                            
                        }
                        j++;
                    }
                    j=0;
                    break;
                case "green":
                    newHand[i]=card[i];
                    j=i;
                    while(j<size)
                    {
                        if(card[i].color.equals("green"))
                        {
                        newHand[i]=card[i];                            
                        }
                        j++;
                    }
                    j=0;
                    break;
                case "skip":
                    newHand[i]=card[i];
                    j=i;
                    while(j<size)
                    {
                      if(card[i].color.equals("skip"))
                      {
                          newHand[j]=card[j];
                          
                      }
                      j++;
                    }
                            
                    break;     
                case "draw2":
                    newHand[i]=card[i];
                    break;    
                case "reverse":
                    newHand[i]=card[i];
                    break;  
                case "wild":
                    newHand[i]=card[i];
                    break;            
                case "wild4":
                    newHand[i]=card[i];
                    break;                   
                default:
                    break;
            }
            
        }

        
        return "something";
    }
    
    //Reads in what color card it is and will interpret what kind of workout it will be 
    public String interpret(Card card[])
    {
        int size=card.length;
        //Thinking of having it return the string to display in console/html file
        for(int i=0;i<size;i++)
        {
            /*
            if(card[i].color.equals("red"))
            {
                return "Sit ups";
            }
            if(card[i].color.equals("blue"))
            {
                return "Push ups";
                
            }
            if(card[i].color.equals("green"))
            {
                return "Lunges";
                
            }            
            if(card[i].color.equals("yellow"))
            {
                return "Squats";
            }
*/
            switch (card[i].color) {
                case "blue":
                    return "Push ups";
                case "red":
                    return "Sit ups";
                case "yellow":
                    return "Sqauts";                        
                case "green":
                    return "Lunges";
                default:
                    break;
            }
        }


        return "None";
    }
    
    //We want to count the amount of reps per workout before being discarded
    //Ideal situation is calling this method when we are done with one hand and workout is discarded
    public void count(Card card[])
    {
        //Individually identify each count since wild cards can change/negate some counts 
        //Can later change these to workout name counts
        int redCount,blueCount,greenCount,yellowCount;
        String reps;
        Integer result;

        int size=card.length;
        for(int i=0;i<size;i++)
        {
            result = Integer.valueOf(card[i].value);
            reps=card[i].value;
        }
        
    }
    
    public void discradCondition(int arrPos)
    {
        
    }
    
    
}





