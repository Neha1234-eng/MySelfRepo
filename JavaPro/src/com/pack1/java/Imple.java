package com.pack1.java;

public class Imple implements AllPro{

	public static void main(String[] args) {
		Imple ob=new Imple();
		ob.getData();
		ob.PutData();
	}

	@Override
	public void getData() {
		System.out.println("jkagja");
		
	}

	@Override
	public void PutData() {
		System.out.println("dkjhdah");
		mull();
		
	}
	public void mull()
	{
		System.out.println("i m in subn interface:");
	}

}
