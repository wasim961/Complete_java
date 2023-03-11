package DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTimeFormat {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
		
		System.out.println("Current Date: "+ft.format(date));
	}

}
