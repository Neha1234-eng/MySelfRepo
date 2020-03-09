package com.pack1.java;
class Sub{
	int a=1,b=2,c;
	Sub()
	{
		c=a-b;
		System.out.println(c);
	}
}

public class Add extends Sub {
	public Add()
	{
		c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Add ob=new Add();

	}

}
