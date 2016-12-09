import java.util.Scanner;

public class MathClass {

	public MathClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("I printed this without looking at someone else's code.");
		System.out.println("Give me a number: ");
		number = scan.next();
		System.out.println("Your number is " + number); */
		int num1 = 0;
		int num2 = 0;
		double cube = 0;
		double sumCube = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number: ");
		num1 = scan.nextInt();
		
		System.out.println("Please enter the second number: ");
		num2 = scan.nextInt();
		scan.close();
		cube = Math.pow(num1 + num2, 3);//(num1 + num2) * (num1 + num2) * (num1 + num2);
		sumCube = Math.pow(num1, 3) + Math.pow(num2, 3); //num1 * num1 * num1 + num2 * num2 * num2;
		
		System.out.println("The cube of the sum of " + num1 + " and " + num2 + " is " + cube);
		System.out.println("The sum of the cube of " + num1 + " and " + " the cube of " + num2 + " is " + sumCube);
		
		

	}

}
