import java.util.Scanner;

public class Subtraction extends Calculation {
     void result(){
        Scanner difference = new Scanner(System.in);
        
        System.out.print("1st Number: ");
        int x = difference.nextInt();
        
        System.out.print("2nd Number: ");
        int y = difference.nextInt();
        
        int subtract = x - y;
        System.out.println("Result is "  + subtract);
    }
}