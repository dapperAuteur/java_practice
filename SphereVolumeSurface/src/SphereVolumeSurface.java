import java.util.Scanner;
import java.text.DecimalFormat;

public class SphereVolumeSurface {

	public SphereVolumeSurface() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat decForm = new DecimalFormat("0.####");
		Double radius;
		Double volume;
		Double surfaceArea;
		System.out.println("What is the radius of the sphere?");
		radius = scan.nextDouble();
		scan.close();
		volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		System.out.println("A sphere with a radius of " + radius + " has a volume of " + decForm.format(volume) + " and a surface area of " + decForm.format(surfaceArea) + ".");

	}

}
