import java.util.Scanner;
import java.util.Random;

public class StringManipulation {

	public StringManipulation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String lastName;
		String finalName;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name ");
		firstName = scan.next();
		System.out.println("Please enter your last name: ");
		lastName = scan.next();
		
		while (lastName.length()< 5)
		{
			System.out.println("Last name must be at least 5 characters long. Please try again: ");
			lastName = scan.next();
		}
		
		scan.close();
		
		finalName = firstName.substring(0,1);
		finalName += lastName.substring(0, 5);
		finalName += rand.nextInt(99) + 10;
		
		System.out.println(finalName);

	}

}
