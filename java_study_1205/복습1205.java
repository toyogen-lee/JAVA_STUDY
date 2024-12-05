package java_study_1205;

import java.util.Scanner;

public class 복습1205 {

	public static void main(String[] args) {
		
		//1. 사칙연산 - 거스름돈
		int money = 74900;      
		int m1 = 50000;
		int m2 = 10000;
		int m3 = 1000; 
		int m4 = 500;
		int m5 = 100;
		int oman = money / m1;
		int man = (money % m1) / m2;
		int mo = money - (m1 * oman + m2 * man);
		int ch = mo / m3;
		int obak = (mo % m3) / m4;
		int bak = mo - (m3 * ch + m4 * obak);
		int bak2 = bak / 100;
		System.out.println("오만원 : " + oman + "   만원 : " + man + "   천원 : "
		+ ch + "   오백원 : " + obak + "   백원 : " + bak2);
		
		money = money % m1;
		int mangae = money / m2;
		
		
		
		
		/*
		 * 프로그래밍에서 상수표현은 데이터타입 앞에 'final' 키워드가 온다.
		 * 상수를 표현할 때 변수 이름은 대문자(개발자 약속)
		 */
		final double PI = 3.14;
		Scanner scan = new Scanner(System.in);
		System.out.print("radius : ");
		int r = scan.nextInt();
		System.out.println(PI*r*r);
		
		//직각삼각형(피타고라스)
		int a = 3;
		int c = 5;
		int b = c*c - a*a;
		System.out.println(b);
		
		int[] array = {1,3,5};       //배열 선언
		System.out.println(array[0]);
		//맨 마지막 인덱스 출력
//		System.out.println(array[2]);   x
		System.out.println(array[array.length-1]);
		
		// 1번 인덱스 값과 2번 인덱스 값 서로 교체
		int temp = array[1];  //temp(임시공간)에 3 대입
		array[1] = array[2];  //1번 인덱스에 5 대입
		array[2] = temp;  //2번 인덱스에 3 대입
		//swap
		
		//배열 문제는 무조건 for
		for(int i : array) System.out.println("i : " + i);

	}

}
