package java_study_1122;

import java.util.Scanner;

public class 수업1122 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {  
			System.out.println("Hello World!");
		}
		
		//"안녕" 20번 출력해보자.
		for (int i = 0; i < 20; i++) {
			System.out.print("안녕");           //for문 밖에서는 변수명 중복 가능
		} System.out.println();
		
		for (int i = 0; i < 9; i++) 
			System.out.print("i : " + i);
		System.out.println();
		
		/*
		 * for문은 이것만 알아두자.
		 * 1. for문 실행순서 초기식 -> 조건식 -> 코드 실행 -> 증감식
		 * 2. 조건식이 만족할 때까지 반복함.
		 */
		
		//1~10까지의 총합 구하기
	    int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		} System.out.println("1부터 10까지의 총합 : " + sum);
		
		//1~20까지의 숫자 중 짝수만 출력하기
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0)
			System.out.print(i + "은/는 짝수입니다. ");
		} System.out.println();
		
		//1~30까지의 숫자 중 5의 배수만 출력하기
		for (int i = 1; i<= 30; i++) {
			if (i % 5 == 0) System.out.print(i + "은/는 5의 배수입니다. ");
		} System.out.println();
		
		//break;
		for (int i = 1; i <= 5; i++) {
			if (i == 2) {
				System.out.println(i);
				break;
			} System.out.println(i);
		} 
		
		int 구구단 = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.print(구구단 + "*" + i + "=" + 구구단*i + "  ");
		} System.out.println();
		
		/*
		 * while문은 조건이 참인 동안 코드 블록을 반복적으로 실행하는 반복문
		 */
		int i = 1;
		while (i <= 5) {
			System.out.println("while문 i : " + i);
			i++;
		}
		
		//커피 자판기 예제
		int coffee = 10;  //커피 10잔
		while (coffee > 0) {
			System.out.println("커피를 판매합니다, 남은 커피 : " + coffee);
			coffee--;
			if (coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다. ");
				break;
			}
		}
		
		int x = 0;
		while (true) { 
			x++;
			if (x == 10) break;    //for문은 범위 o | while 문은 범위 x
		}

	}

}
