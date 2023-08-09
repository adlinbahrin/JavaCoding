/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaltrycatch;

/**
 *
 * @author adlin
 */
public class PracticalTryCatch {

    public static void main(String[] args) {
        
        try {  
           int data=60/4; 
           System.out.println("Your answer is " + data);
         }  
    
        catch(Exception e){  
          System.out.println("Can't divided by zero");  
      }  
    }  
}
