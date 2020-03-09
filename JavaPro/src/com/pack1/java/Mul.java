package com.pack1.java;
class Div{
	int a=4,b=3,c;
	Div()
	{
		c=a/b;
		System.out.println(c);
	}
	
}

public class Mul extends Div{
	Mul()
	{
		c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Mul ob=new Mul();
		Sub ob1=new Sub();

	}

}
