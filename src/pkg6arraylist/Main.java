/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


/**
 *
 * @author Clera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //1.resizing array - disadvantages
        //2.resizing arrylist
        //3. legth of the arraylist
        //4. using iterator print arraylist elements
        
        String[] countries = new String[4];
        countries[0]= "NZ";
        countries[1]= "Australia";
        countries[2]= "Norvay";
        countries[3]= "Finland";
        //countries[4]= "India";
            //1. Try to add one extra element at number 4.
            //2. Try to add number instead of string
            // Arrays can't be manipulated...if you want to add resize array then creat a new array with five elements and then copy old into new array.
            //An ArrayList is slightly different from an array in that it stores its elements as objects instead of primitive types (ints, bools, etc). 
        
        //shortcut fori
        for (int i = 0; i < countries.length-1; i++) {
            System.out.println(countries[i]);
            
        }
        
        //while arraylist can be manipulative.
        //can add extra element whenever we want 
        //except any type of datatype
        ArrayList listArray = new ArrayList();
        listArray.add("First item");
        listArray.add("Second item");
        listArray.add(3);
        listArray.add(4.67);
        listArray.add(0,"O item");
        
        System.out.println(listArray.get(2));//access 2nd element from the arraylist
        System.out.println(listArray);//prints all elements of arraylist
        
        //adding some more elements in an arraylist
        
        listArray.add("X");
        listArray.add("Y");
        listArray.add("Z");
        
        //adding an element at the particular position
        
         listArray.add(7, "Hi");//adding element in a sequence
         System.out.println(listArray);
         
         listArray.remove(7);//removing an element from the particular position
         listArray.remove("First item");
         System.out.println("********");
         System.out.println(listArray);//output ==> [O item, Second item, 3, 4.67, X, Y, Z]
                 
         
         listArray.size();//to get size of the array
         System.out.println(listArray.size());
         
         Iterator it = listArray.iterator();
         
         while(it.hasNext()){
             System.out.println(it.next()); //output in a sequence
         }
        
    }
    
}
