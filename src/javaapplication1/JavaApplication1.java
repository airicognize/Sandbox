/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cstuser
 */

import java.util.*;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        System.out.println("its ya boy yong vanilla");
        
        int a = 5;
        int b = 5;
        
        System.out.println();
        System.out.println("Equality: a==b " + (a==b));
        System.out.println("Equality: a!=b " + (a!=b));
        System.out.println("Equality: a!=b " + !(a==b));
        
        //a = 2;
        if(a<b){
            System.out.println("a is less than b");
        }
        else{
            System.out.println("outside the if");        
        }

        String result;
        //result = (a==b)?"TRUE":"FALSE";
        
        System.out.println("Is a = to b? ");

        if (a==b){
            result = "Yes, of course it is TRUE";
            
        } else {   
            result = "FALSE";
        }            
        System.out.println(result);
  
    }     
}
