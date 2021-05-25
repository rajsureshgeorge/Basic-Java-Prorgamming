import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
			 System.out.println("Enter 3 numbers");
			  Scanner s=new Scanner(System.in);
			  int num1=s.nextInt();
			  int num2=s.nextInt();
			  int num3=s.nextInt();
			  int avg=(num1+num2+num3);
			  avg =avg/3;
			  System.out.println("Average is :"+avg);
	}

}
