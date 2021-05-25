import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		System.out.println("Enter the Radius: ");
		Scanner s=new Scanner(System.in);
		double rad=s.nextDouble();
		double pi=3.14;
		double area=pi*rad*rad;
		double perimeter=2*pi*rad;
		System.out.println("Area is :"+area);
		System.out.println("Perimeter is :"+perimeter);

	}

}
