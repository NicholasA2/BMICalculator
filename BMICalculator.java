/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        //First I get all the user input
        Scanner myWeight = new Scanner(System.in);
        Scanner myHeight = new Scanner(System.in);
        
        System.out.print("Please enter your weight (in kilograms):");
        double weight = myWeight.nextDouble();
        
        System.out.print("Please enter your height(in meters):");
        double height = myHeight.nextDouble();
        
        //Now we do the math
       double BMI = weight / (Math.pow(height, 2));
       System.out.println("Your BMI is: " + BMI);
       
       //Now we add if...else statements to determine which section the user belongs to
       if (BMI < 18.5) {
           System.out.println("You are underweight");
       } 
       
       else if 
               ((BMI >= 18.5) && (BMI < 25.0)) 
               {System.out.println("Your BMI is normal");} 
       
               else if
                       ((BMI >= 25.0) && (BMI < 30.0))
               {System.out.println("You are overweight");} 
               
               else 
               {System.out.println("You are obese");}
    
    }
}
