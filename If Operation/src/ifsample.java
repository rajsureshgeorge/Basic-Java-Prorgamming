import java.util.Scanner;

public class ifsample {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		if (num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}

	}

}
