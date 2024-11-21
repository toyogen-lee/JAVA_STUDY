package java_study_1121;

import java.util.Scanner;

public class 문제1121 {

	public static void main(String[] args) {
		
		//문제 1. 3     2. 1
		
		//문제 3. 
		Scanner scan = new Scanner(System.in);
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		if (a > b) System.out.println("a가 더 크다. ");
		else if (a < b) System.out.println("b가 더 크다. ");
		else System.out.println("같다. ");
		
		//문제 4.
		System.out.print("나이를 입력하시오. ");
		int age = scan.nextInt();
		if (age >= 19) System.out.println("성인");
		else  System.out.println("미성년자");
		
		//문제 5.
		System.out.print("숫자를 입력하시오. ");
		int x = scan.nextInt();
		if (x % 5 == 0) System.out.println("5의 배수입니다.");
		else System.out.println("5의 배수가 아닙니다.");
		
		//문제 6.
		System.out.print("숫자를 입력하시오. ");
		int y = scan.nextInt();
		if (y % 2 != 0) System.out.println("홀수");
		else System.out.println("짝수");
		
		//문제 7.
		System.out.print("숫자를 입력하시오. ");
		int q = scan.nextInt();
		if (q % 3 == 0 && q % 5 == 0) System.out.println("3과 5의 공배수입니다.");
		else if (q % 3 == 0 && q % 5 != 0) System.out.println("3의 배수입니다.");
		else if (q % 3 != 0 && q % 5 == 0) System.out.println("5의 배수입니다.");
		else System.out.println("해당 없음");
		
		//문제 8.
		System.out.print("국어 : ");
		int k = scan.nextInt();
		System.out.print("수학 : ");
		int m = scan.nextInt();
		System.out.print("영어 : ");
		int e = scan.nextInt();
		double avg = (k + m + e) / 3;
		if (avg >= 90 && avg <= 100) System.out.println("A");
		else if (avg >= 80 && avg < 90) System.out.println("B");
		else if (avg >= 70 && avg < 80) System.out.println("C");
		else if (avg >= 60 && avg < 70) System.out.println("D");
		else System.out.println("F");
		
	   //문제 9.
		System.out.print("s1 : ");
		int s1 = scan.nextInt();
		System.out.print("s2 : ");
		int s2 = scan.nextInt();
		if (s1 < 0 || s2 < 0) System.out.println("음수가 포함되어 있습니다. ");
		else System.out.println("모두 양수입니다. ");
		
		//문제 10. 
		System.out.print("1~5 중에서 숫자를 입력하세요. ");
		int fruit = scan.nextInt();
		switch(fruit) {
		case 1 : System.out.println("사과");
		break;
		case 2 : System.out.println("바나나");
		break;
		case 3 : System.out.println("오렌지");
		break;
		case 4 : System.out.println("포도");
		break;     
		case 5 : System.out.println("복숭아");
		break;
		}
		
		//문제 11.
		System.out.print("몇 명이에요? ");
		int n = scan.nextInt();
		if (n % 7 == 0) {
			int n3 = n / 7;
			System.out.println("피자" + n3 + "판이 필요합니다. ");
		}
		else {
			int n2 = (n / 7) + 1;
			System.out.println("피자" + n2 + "판이 필요합니다. ");
		}
		
		//문제 12. 
		System.out.print("금액을 입력하세요 : ");
		int price = scan.nextInt();
		if (price >= 500000) {
			int co1 = price * 4 / 5;
			System.out.println("지불할 금액은 " + co1 + "원 입니다. ");
		} else if (price >= 300000 && price < 500000) {
			int co2 = price * 9 / 10;
			System.out.println("지불할 금액은 " + co2 + "원 입니다. ");
		} else if (price >= 100000 && price < 300000) {
			int co3 = price * 19 / 20;
			System.out.println("지불할 금액은 " + co3 +"원 입니다. ");
		} else System.out.println("지불할 금액은 " + price + "원 입니다. ");
		
	}

}
