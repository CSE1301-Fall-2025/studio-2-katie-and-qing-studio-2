package studio2;

import java.util.Scanner;

public class Ruin {
 
    public static void main(String[] args){
     
        Scanner in = new Scanner(System.in);
     
     System.out.println("How mcuh money are you starting with?");
     int startAmount = in.nextInt();

     System.out.println ("what is the win chance");
     double winChance = in.nextDouble();

   
     while (startAmount <= 100){
        double casinoNumber = Math.random();
        if (casinoNumber > 0.5){
        casinoNumber = Math.random();
        startAmount++;
        System.out.println("you have " + startAmount + "money");
        }
    else {
         casinoNumber = Math.random();   
         startAmount--;
    }
    
     }
  
     }
    }
