
//Jorge Carlos


package testpro;

import java.util.*;


public class Hand 
{

    
    //public String[] sort(String orghand[])
    public void sort(String orgHand[])
    {
        int size=orgHand.length;

        //Simple way to sort the array by color
        Arrays.sort(orgHand);
        
        System.out.println(Arrays.toString(orgHand));
        
        
    }
    
    //Reads in what color card it is and will interpret what kind of workout it will be 
    public void interpret(String myHand[])
    {
        int size=myHand.length;
        //Thinking of having it return the string to display in console/html file
        for(int i=0;i<size;i++)
        {
            
            if(myHand[i].contains("Red"))
            {
                 System.out.println("Sit ups");    
            }
            else if(myHand[i].contains("Blu"))
            {
                 System.out.println("Push ups");         
            }
            else if(myHand[i].contains("Yel"))
            {
                System.out.println("Squats");      
            }
            else if(myHand[i].contains("Gre"))
            {
                System.out.println("Lunges");
            }
            else if(myHand[i].contains("draw2"))
            {
                System.out.println("All cards of mathcing color are mulitplied by 2");
            }
            else if(myHand[i].contains("reverse"))
            {
                System.out.println("All cards of matching color will return to bottom of pile");  
            }
            else if(myHand[i].contains("wild"))
            {
              System.out.println("Add 10 Burpees");     
            }
            else if(myHand[i].contains("wiFour"))
            {
             System.out.println("Multiply each color by 4 and add 10 burpees");   
            }
            
            switch (myHand[i]) {
                case "Blue 0":
                    System.out.println("1 Minute break");
                    break;
                case "Red 0":
                    System.out.println("1 Minute break");
                    break;
                case "Yellow 0":
                    System.out.println("1 Minute break");                        
                    break;
                case "Green 0":
                    System.out.println("1 Minute break");
                    break;
                      

                default:
                    break;
            }
        }


    }
    
    //We want to count the amount of reps per workout before being discarded
    //Ideal situation is calling this method when we are done with one hand and workout is discarded
    
    
    //Just print out to console
    public void count(String myHand[])
    {
        //Individually identify each count since wild cards can change/negate some counts 
        //Can later change these to workout name counts
        int redCount=0,blueCount=0,greenCount=0,yellowCount=0,burpees=0;
        int redSkip=0,blueSkip=0,greenSkip=0, yellowSkip=0;
        
        
        boolean drawFlag=false;
        boolean wild4Flag=false;
        boolean wildFlag=false;
        boolean skipFlag=false;

        
        String skipColor=" ";
        String drawColor=" ";
        
        
        Integer result;
        int getReps;
        int size=myHand.length;
        
        for(int i=0;i<size;i++)
        {
            //Statements will get values of all 
            if(myHand[i].contains("Red"))
            {
                getReps = Character.getNumericValue(myHand[i].charAt(myHand[i].length()-1));
                redCount=getReps+redCount;
                //System.out.println(redCount);
            }
            else if(myHand[i].contains("Blu"))
            {
                getReps=Character.getNumericValue(myHand[i].charAt(myHand[i].length()-1));
                blueCount=getReps+blueCount;
                //System.out.println(blueCount);
            }
            else if(myHand[i].contains("Yel"))
            {
               getReps=Character.getNumericValue(myHand[i].charAt(myHand[i].length()-1));
               yellowCount=getReps+yellowCount;
               //System.out.println(yellowCount);
            }
            else if(myHand[i].contains("Gre"))
            {
                getReps=Character.getNumericValue(myHand[i].charAt(myHand[i].length()-1));
                greenCount=getReps+greenCount;
                //System.out.println(greenCount);
            }
            
            //Action Cards
            else if (myHand[i].contains("skip"))
            {
                skipFlag=true;
                skipColor = myHand[i];
            }
            else if (myHand[i].contains("draw2"))
            {
                drawFlag=true;
                drawColor = myHand[i];  
            }
            else if (myHand[i].contains("wild"))
            {
                wildFlag=true;
            }
            else if (myHand[i].contains("wiFour"))
            {
                wild4Flag=true;

            }
 
            }
        
        
        //Just check using the flag and will mulitply it by 4
        if(wild4Flag)
        {
                burpees=burpees+10;
                redCount=redCount*4;
                blueCount=blueCount*4;
                yellowCount=yellowCount*4;
                greenCount=greenCount*4;            
        }
        //Will need to check color and multiply the number of reps by 2 
        else if(drawFlag)
        {
            if(drawColor.contains("Red"))
            {
                redCount=redCount*2;
            }
            else if(drawColor.contains("Blu"))
            {
                blueCount=blueCount*2;
                
            }
            else if(drawColor.contains("Yel"))
            {
                yellowCount=yellowCount*2;
                
            }
            else if(drawColor.contains("Gre"))
            {
                greenCount=greenCount*2;
                
            }
        }
        else if(wildFlag)
        {
            burpees=burpees+10;
        }
        //We need the color of the skip to discard 
        else if(skipFlag)
        {
            if(skipColor.contains("Red"))
            {
                redSkip=redCount;
                redCount=0;
            }
            else if(skipColor.contains("Blu"))
            {
                blueSkip=blueCount;
                blueCount=0;
            }
            else if(skipColor.contains("Yel"))
            {
                yellowSkip=yellowCount;
                yellowCount=0;
            }
            else if(skipColor.contains("Gre"))
            {
                greenSkip=greenCount;
                greenCount=0;
            }
        }
        
        
        //Total Counts
        System.out.println("Sit Up Reps: "+redCount);
        System.out.println("Push Up Reps: "+blueCount);
        System.out.println("Squat Reps: "+yellowCount);
        System.out.println("Lunge Reps: "+greenCount);
        System.out.println("Burpees Reps: "+burpees);
        
        //Total Skips
        System.out.println("Sit up Reps Skipped: "+redSkip);
        System.out.println("Push up Reps Skipped: "+blueSkip);
        System.out.println("Squat Reps Skipped: "+yellowSkip);
        System.out.println("Lunge Reps Skipped: "+greenSkip);
        }
        //Should get cards from the pile
    public void grabCards(String myHand[])
    {
        String color=" ";
        boolean reverseFlag=false;
        String[] newArr = null;
        
        Queue queue = new Queue();
        Hand hand_arr=new Hand();
        
        int size=myHand.length;
        for(int i=0; i<size; i++)
        {
          Queue.enqueue(myHand[i]);
        }
        while(queue != null)
        {
            reverseFlag = false;
            for(int i =0; i<7;i++)
            {
               newArr[i]=queue.dequeue();
               if(newArr[i].contains("reverse"))
               {
                reverseFlag=true;
                color=newArr[i];

               }
            if(reverseFlag)
            {
                if(color.contains("red"))
                {
                    //Enqueue back into the queue since there is the reverse flag
                    Queue.enqueue(newArr[i]);
                    
                }
                else if(color.contains("blu"))
                {
                    Queue.enqueue(newArr[i]);
                }
                else if(color.contains("gre"))
                {
                    Queue.enqueue(newArr[i]);
                }
                else if(color.contains("yel"))
                {
                    Queue.enqueue(newArr[i]);
                }
              
            }
            }
            hand_arr.sort(newArr);
            hand_arr.interpret(newArr);
            
            
        }
            
        
        
    }

    }
