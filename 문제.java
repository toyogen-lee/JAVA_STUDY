package java_study_1119;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 1. 12000
		//문제 2. 170   true    false
		
		//문제 5
		int a = 10;
		int b = 5;
		int sum = a * b;
		System.out.println("a * b : " + sum);
		
		//문제 6
		boolean p = true;
		boolean q = false;
		boolean pq = p && q;
		System.out.println("결과 : " + pq);
		
		//문제 7
		final double PI = 3.14;
		double radius = 5.0;
		double s = PI * radius * radius;
		System.out.println("면적 : " + s);
		
		//문제 8
		double weight = 70.5;
		double height = 1.77;
		double bmi = weight / (height * height);
		System.out.println("bmi : " + bmi);
		 
		// 문제 9. 2
		
		//문제 10
		System.out.print("age : ");
		int age = scan.nextInt();
		System.out.print("year : ");
		int year = scan.nextInt();
		int y = year - age + 1;
		System.out.println("출생 연도 : " + y);
		
		//문제 11 (상)
		System.out.print("거스름돈 : ");
		int mon = scan.nextInt();
		int c = 500; 
		int d = 100;
		int c1 = mon / c;
		System.out.println("오백원 : " + c1 + "개");
		int c2 = mon % c;
		int d1 = c2 / d;
		System.out.println("백원 : " + d1 + "개");
		
	}

}
