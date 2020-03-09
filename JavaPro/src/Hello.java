import java.util.Scanner;
public class Hello {
	int a,b,c;
	void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println(c);
	}
	void mul()
	{
		c=a*b;
		System.out.println(c);
	}
	void div()
	{
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Hello b=new Hello();
		b.add();
		b.mul();
		b.div();

	}

}
