
package simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner pick = new Scanner(System.in);
        
        System.out.println("A. Addition");
        System.out.println("B. Subtraction");
        System.out.println("C. Multiplication");
        System.out.println("D. Division");
        System.out.print("Please choose your operation: ");
        
        char choices = pick.next().charAt(0);
        switch(choices){
            case 'A':
                Calculation add = new Addition();
                add.result();
                System.out.print("Thank you for using Omne's calculator ");
                break;
                
            case 'B':
                Calculation subtract = new Subtraction();
                subtract.result();
                System.out.print("Thank you for using Omne's calculator ");
                break;
                
            case 'C':
                Calculation multiply = new Multiplication();
                multiply.result();
                System.out.print("Thank you for using Omne's calculator ");
                break;
                
            case 'D':
                Calculation divide = new Division();
                divide.result();
                System.out.print("Thank you for using Omne's calculator ");
                break;
                
            default: 
                Calculation simple = new Calculation();
                    simple.result();
                
                
        }
    }
    
}
