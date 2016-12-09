import java.util.Random;

public class RandomClass {

	public RandomClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int first = rand.nextInt(8);
		int second = rand.nextInt(8);
		int third = rand.nextInt(8);
		int middle = rand.nextInt(742);
		int last = rand.nextInt(9999);
		
		String middleString;
		String lastString;
		
		middleString = Integer.toString(middle);
		lastString = Integer.toString(last);
		
		while (middleString.length() < 3)
		{
			middleString = middleString + 0;
		}
		
		while (lastString.length() < 4)
		{
			lastString = lastString + 0;
		}
		
		System.out.println(Integer.toString(first) + Integer.toString(second) + Integer.toString(third) + "-" + middleString + "-" + lastString);

	}

}
