
package simplecalculator;

import java.util.Scanner;

public class Division extends Calculation{
     void result(){
        Scanner quotient = new Scanner(System.in);
        
        System.out.print("1st Number: ");
        int x = quotient.nextInt();
        
        System.out.print("2nd Number: ");
        int y = quotient.nextInt();
        
        int divide = x / y;
        System.out.println("Result is " + divide);
    }
}
