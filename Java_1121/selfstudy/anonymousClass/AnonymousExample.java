package org.selfstudy.anonymousClass;

public class AnonymousExample {
	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method(new Vehicle() {	

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("트럭이 달립니다.");
			}
		}
		
		);

	}
}
