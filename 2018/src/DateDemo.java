
import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d= new Date();
		
		SimpleDateFormat Dr=new SimpleDateFormat("M/d/yyyy m:s");
		System.out.println(Dr.format(d));
		
		System.out.println(d.toString());	

	}

}
