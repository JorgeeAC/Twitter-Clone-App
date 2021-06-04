/*
Course: Object-Oriented Programming
Section:001
Semester:Spring 2020

Name: Jorge Carlos

Title: Project 1


 */
package project1;
//import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;


public class Project1 {


    public static void main(String[] args) {
        //FileWriter fw = new FileWriter("output.txt");
        //PrintWriter pw = new PrintWriter(fw);
        try{
           FileReader fr = new FileReader("MatadorSong.html");
           BufferedReader br=new BufferedReader(fr);
           FileWriter writer = new FileWriter("output.txt",true);
           String str;

           
           //Runs through entire file until the end
           while((str=br.readLine())!=null)
           {

               //checking where the text lies in the html code
               if(str.contains("<p>"))
               {
                   //Checking where img tag is to get rid of it 
                   if(str.contains("<img"))
                   {
                       str="";
                   }
                //check where there is a break tag in the code and create our
                //own break by printing out each string in a new line 
                String[] arrOfStr= str.split("<br />", 1000);
                //Checks the array of strings to get the string without tags
                for(String s: arrOfStr)
                {

                        s=s.replaceFirst("<p>", " ");
                        s=s.replaceAll("</p>", " ");
                        writer.write(s);
                        writer.write("\n");
                        
                    
                }
               }
               //Gets rid of all header tags
               if(str.contains("<h1>")||str.contains("<h2>")||str.contains("<h3>")||str.contains("<h4>")||str.contains("<h5>")||str.contains("<h6>"))
                  
               {
                   
                   str=str.replaceAll("<h1>", " ");
                   str=str.replaceAll("</h1>"," ");
                   str=str.replaceAll("<h2>", " ");
                   str=str.replaceAll("</h2>"," ");
                   str=str.replaceAll("<h3>", " ");
                   str=str.replaceAll("</h3>"," ");
                   str=str.replaceAll("<h4>", " ");
                   str=str.replaceAll("</h4>"," "); 
                   str=str.replaceAll("<h5>", " ");
                   str=str.replaceAll("</h5>"," ");
                   
                   writer.write(str);
                   writer.write("\n");
                    //System.out.println(str);
               }
               
               
               
               //These will handle the tables of the html code
               String[] newTable=str.split("<th />",100000);
               if(str.contains("<th>"))
               {
                   for(String a: newTable)
                   {
                        a=a.replaceFirst("<th>", " ");
                        a=a.replaceAll("</th>", ",");
                        
                        writer.write(a);
                        //writer.write("");
                        //System.out.print(a);                       
                   }
               }
               //Large number is used to match sure to catch all tags
               String[] tableOfStr=str.split("<td />",100000);
               if(str.contains("<td>"))
               {
                   for(String a: tableOfStr)
                   {
                        a=a.replaceFirst("<td>", " ");
                        a=a.replaceAll("</td>", ",");
                        
                        writer.write(a);
                        //writer.write("");
                        //System.out.print(a);                       
                   }
               }
               String[] tableOfStrHead=str.split("<th />",100000);
               if(str.contains("<tr>"))
               {
                   for(String a: tableOfStrHead)
                   {
                       
                        a=a.replaceFirst("<tr>", "");
                        a=a.replaceAll("</tr>", ",");
                        writer.write("\n");
                        writer.write(a);
                        //writer.write("");
                     
                        //System.out.print(a);                       
                   }
                   //System.out.println(str);
               }
           }
                    writer.close();
        } 
        catch (IOException e){
        }

    }
    
}
