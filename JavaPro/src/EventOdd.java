import java.util.Scanner;
class A
{
	int b;
}

public class EventOdd extends A{
	int a;
	void even()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=s.nextInt();
		b=s.nextInt();
		if(a%2==0 || b%2==0)
			System.out.println("even");
	}

	public static void main(String[] args) {
		EventOdd ob=new EventOdd();
		ob.even();

	}

}
