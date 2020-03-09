package com.pack1.java;
class Get{
	public interface A{
		void Add1();
	}
}

public class Incre extends Get {
	void Add1()
	{
		System.out.println("i m inter caller:");
	}

	public static void main(String[] args) {
		Incre ob=new Incre();
		ob.Add1();

	}

}
