package org.study.loopEx;

public class WhileEx02 {
	public static void main(String[] args) {
		System.out.println("while문");
		
		System.out.println("구구단(2단~9단)");
		
		int i=2;
		
		while (i<10) {
			System.out.println(i+"단입니다.");
			
			int j=1;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			
			i++;
		}
		
	
	}
}
