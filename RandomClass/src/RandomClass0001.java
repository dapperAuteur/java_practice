//import java.util.Scanner;
import java.util.Random;

public class RandomClass0001 {

	/*public RandomClass0001() {
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Random().ints(10, 1, 10).forEach(System.out::println);
		
		Random rand = new Random();
		int num0 = rand.nextInt(7);
		int num1 = rand.nextInt(7);
		int num2 = rand.nextInt(7);
		int num3 = rand.nextInt(741);
		int num4 = rand.nextInt(9999);
		System.out.println(num0 + "" + num1 + "" + num2 + "-" + num3 + "-" + num4);
		

	}

}
