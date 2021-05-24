import java.util.Scanner;

public class FunctionsSample {

	public static void main(String[] args) {
		System.out.println("Enter 2 Number");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int result=sum(num1,num2);
		System.out.println(result+" is the result" );
	}
	static int  sum(int a,int b) {
	int su=a+b;
	return su;
}
}
