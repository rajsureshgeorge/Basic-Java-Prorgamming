import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number For its Multiplication Table : ");
		int a=s.nextInt();
		
		for (int i=1;i<=10;i++) {
			int mul=a*i;
			System.out.print(a+" * "+i+" :" +mul+"\n");
		}
	
	}
	

}
