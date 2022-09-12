package simplecalculator;

import java.util.Scanner;

public class Multiplication extends Calculation{
     void result(){
        Scanner product = new Scanner(System.in);
        
        System.out.print("1st Number: ");
        int x = product.nextInt();
        
        System.out.print("2nd Number: ");
        int y = product.nextInt();
        
        int multiply = x * y;
        System.out.println("Result is " + multiply);
    }
}