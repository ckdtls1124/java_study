package org.study.utilEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1117 {
	public static void main(String[] args) {
		
		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("Oracle Driver Connect Success!");
//		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Oracle Driver Connect Fail!");
//		}
		
		Date now=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		
		
		String a=format.format(now);
		System.out.println(a);
		
		
		
		
		
		
	}
}
