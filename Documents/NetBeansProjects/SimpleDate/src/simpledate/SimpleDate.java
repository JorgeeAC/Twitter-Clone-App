// CS 2365 OOP Spring 2020
// Mario Alberto Pitalu Rodriguez

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledate;

import java.util.Scanner;
/**
 *
 * @author BlackStar
 */
public class SimpleDate {
    
    // Use 3 integers for month, day and year
    
    private int month, day, year;
    // CONSTRUCTOR
    
    public SimpleDate()
    { month=1;
      day=1;
      year=2000;
    }
    
    public SimpleDate(int Month, int Day, int Year) // METHOD OVERLOADING
    {
    this.month = Month;
    this.day  = Day;
    this.year = Year;
    }
    
    // Accesor GETTERS
    public int getMonth()
    {
    return month;}
    
    public int getDay()
    {
    return day;}
    
    public int getYear()
    {
    return year;}
    
    // Mutator SETTERS
    public void setMonth( int month)
    {
        this.month = month;
    }
    public void setDay( int day)
    { this.day = day;
    }
    public void setYear( int year)
    {
        this.year=year;
    }
    
    public void setDate(int m, int d, int y){
    month = m;
    day   = d;
    year  = y;
    }
    
    public String toString ()   // Method OverRiding
    { return this.getMonth() + "/" + this.getDay() + "/" + this.getYear() ;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDate objDate;
        
        objDate = new SimpleDate();
        
        System.out.println(objDate);
        
        objDate.setMonth(7);
        objDate.setDay(3);
        objDate.setYear(2010);
        
//        System.out.println( objDate.getMonth() );
//        System.out.println( objDate.getDay() );
//        System.out.println( objDate.getYear() );
//        
        SimpleDate objDate2 = new SimpleDate(2,28,2019);
        if((objDate2.getMonth()>12||objDate2.getDay()>31)||(objDate2.getMonth()==2&&objDate2.getDay()>28))
        {
            System.out.println("Invalid num");
        }
        else
        {
        System.out.println( objDate2.getMonth() );
        System.out.println( objDate2.getDay() );
        System.out.println( objDate2.getYear() );
        }

        
//        objDate2.setDate (8,8,2020);
//        System.out.println( objDate2 );
//        
//        Scanner scan = new Scanner ( System.in );
//        
//        String courseName = "CS 2365 Sections 1-3";
//        System.out.println(courseName);
//        
//        System.out.print("Course Name:");
        //courseName=  scan.nextLine();
        //System.out.println(courseName);
        /*
        for (int i=0;i < courseName.length();i++)
        {
            System.out.println(courseName.charAt(i));
        }
*/

        
    }
    
}