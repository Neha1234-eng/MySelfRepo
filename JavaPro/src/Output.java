import java.lang.*;
import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		int l;String temp=null;
        String a[]= {"neha","mor","apple"};int i;
        for(i=0;i<3;i++)
        {
        	 if(a[i].length()>a[i+1].length())
        	  temp=String.valueOf(a[i]);
        	  a[i]=String.valueOf(a[i+1]);
        	  a[i+1]=String.valueOf(temp);
        	 
        	 
        }
        for(i=0;i<3;i++)
        	System.out.println(a[i]);
        
}
}
