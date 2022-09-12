import java.util.Scanner;
public class Multiplication {
	public satic void main (String[] args) {
		int a,b,mul;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		a = sc.nextInt();
		b = sc.nextInt();

		mul = a * b;
		System.out.println("The multiplication of" +a +"and"+ b+"is" + mul);

		sc.close();
	}
}
