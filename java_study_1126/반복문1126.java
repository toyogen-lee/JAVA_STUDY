package java_study_1126;

import java.util.Scanner;

public class 반복문1126 {
	public static void main(String[] args) {
		
		/*
		 * 이중 for문 (중첩 반복)
		 * 반복문이 다른 반복문을 내포하는 구조
		 * 이론적으로 2중 3중 4중 ... n중까지 가능하나,
		 * 너무 많은 중첩은 프로그램 구조를 복잡하게 한다. 그래서 2중이 적당하다.
		 */
		
		for (int i = 0; i < 3; i++) {    //outer
			System.out.print("아우터 for문 ");
			for (int j = 0; j < 3; j++) {    //iner
				System.out.print("이너 for문 ");
			}
		} 
		//아우터 for문 실행 -> 이너 for문 모두 실행 -> 아우터 for문 실행 ...
		
		//구구단 (이중 for문 이용)
		for (int i = 2; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "   ");
			}
		}
		
		//직사각형 출력 (이중 for문)
		int a = 5;
		int b = 3;
		for (int i = 0; i < b; i++) {
			System.out.println("");
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
		} System.out.println();
		
		//문제9
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int v = scan.nextInt();
		for (int i = 1; i <= v; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		//문제10
		System.out.print("숫자를 입력하세요 : ");  //나
		int d = scan.nextInt();
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d - i; j++) {
				System.out.print("*");
			} System.out.println();
		} 
		System.out.print("숫자를 입력하세요 : ");  //선생님
		int f = scan.nextInt();
		for (int i = f; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}

}
