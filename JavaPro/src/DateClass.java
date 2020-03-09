import java.util.Date;
import java.text.*;
public class DateClass {

	public static void main(String[] args) {
		Date ob=new Date();
		System.out.println(ob.toString());
		System.out.println(ob.getTime());
		
		System.out.println(ob.getMonth());
		System.out.println(ob.getYear());
		System.out.println(ob.getHours());
		
		SimpleDateFormat ov=new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(ov.format(ob));

	}

}
