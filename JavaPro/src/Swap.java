import java.util.Scanner;
public class Swap {
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=s.nextInt();
		b=s.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+""+b);
	}

}
