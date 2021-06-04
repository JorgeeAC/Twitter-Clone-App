/* CS 2365 OOP Spring 2020
Mihir Patel 
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpro;

import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public  class DiscardStack{
    
    private static ArrayList<String> DiscardStack;
    
    DiscardStack(){

 DiscardStack= new ArrayList();

}

static void push(String push)
{
System.out.println("Adding elements to stack");
DiscardStack.add(push);
}

static String pop()
{
if(DiscardStack.isEmpty()){
System.out.println("Stack is empty");
        return null;
}

String size = DiscardStack.get(DiscardStack.size()-1);
DiscardStack.remove(DiscardStack.size()-1);
return size;
}

static void print()
{
if(DiscardStack.isEmpty())
{
System.out.println("Stack is empty");
return;
}
System.out.println("Elements of stack: ");

for(int i= DiscardStack.size() -1; i>=0; i--)
{
System.out.println(DiscardStack.get(i));
}
}

static void empty()
{
DiscardStack.clear();
}
}
