package basicPackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx4 {
	public static void main(String[] args) {
		
		
		System.out.println("Date Format");
		
		Date now=new Date();
		System.out.println(now);
		
//		날짜(시간, 제외) (타입, 국가)
		DateFormat df1=DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		DateFormat df3=DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		DateFormat df4=DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
		DateFormat df5=DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.KOREA);
		System.out.println(" ");
		
		System.out.println(df1.format(now));
		System.out.println(df2.format(now));
		System.out.println(df3.format(now));
		System.out.println(df4.format(now));
		System.out.println(df5.format(now));
		
		
		
		
		
	}
}
