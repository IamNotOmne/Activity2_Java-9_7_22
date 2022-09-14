
package simplecalculator;

import java.util.Scanner;

public class Addition extends Calculation {
    void result(){
        Scanner sum = new Scanner(System.in);
        
        System.out.print("1st Number: ");
        int x = sum.nextInt();
        
        System.out.print("2nd Number: ");
        int y = sum.nextInt();
        
        int add = x + y;
        System.out.println("Result is " + add);
    }
}
