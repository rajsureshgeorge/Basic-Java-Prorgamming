
public class Class_Sample {

	public static void main(String ar[]) {
		
		class2 s1=new class2();
		class2 s2=new class2();
		s1.a=20;
		s1.b=30;
		s2.a=100;
		s2.b=12;
		System.out.println("\nS1-a:"+s1.a+"  \nS1-b: "+s1.b+"  \nS2-a: "+s2.a+"  \nS2-b: "+s2.b);
		s1.display();
		s2.display();
	}

}
