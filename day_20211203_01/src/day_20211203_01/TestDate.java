package day_20211203_01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date d = new Date();
		int y = d.getYear();
		System.out.println(y);
		System.out.println(1900+y);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(d));
		
		System.out.println(sdf.format(d));
		
		Calendar c = Calendar.getInstance();
	}

}
