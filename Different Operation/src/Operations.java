import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
	int a,b;
	System.out.println("Enter 2 Number: ");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;
	int mod=a%b;
	System.out.println("Sum is "+sum);
	System.out.println("Differnce is"+sub);
	System.out.println("Multiplication is "+mul);
	System.out.println("Division is "+div);
	System.out.println("Modulus is "+mod);
	}

}
