
public class ForLoop1 {

	public static void main(String[] args) {
		int a[]= {1,2};
		try {
		for(int i: a)
			System.out.println(a[i]);}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ff");
			}

	}

}
