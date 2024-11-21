package java_study_1121;

import java.util.Scanner;

public class 조건문_문제풀이_1121 {

	public static void main(String[] args) {
		
		//문제 1. 3의 배수 판단
		Scanner scan = new Scanner(System.in);
	    System.out.print("x : ");
	    int x = scan.nextInt();
	    //if 와  else 안에 코드가 한줄이면 중괄호 생략 가능
		if (x % 3 == 0) 
			System.out.println("3의 배수입니다. ");
		else 
			System.out.println("3의 배수가 아닙니다. ");
		
		//문제 2. 5의 배수 판단
		System.out.print("y : ");
		int y = scan.nextInt();
		if (y % 5 == 0) System.out.println("5의 배수입니다. ");
		else System.out.println("5의 배수가 아닙니다. ");
		
		//문제 3. 두 정수를 입력받아 더 큰 수 출력
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("a의 값이 더 크다. ");
		}else if (a < b) {
			System.out.println("b의 값이 더 크다. ");
		}else  {
			System.out.println("같다. ");
		}
		
		//문제 4. 짝수 구하기
		int e = 4;
		if (e % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		//문제 5. 홀수 구하기
		int r = 9;
		if (r % 2 == 1) System.out.println("홀수");
		else System.out.println("짝수");
		
		//문제 6. 3과 5의 공배수 판단
		int q = 15;
		if (q % 3 == 0 && q % 5 == 0) System.out.println(q + "는 공배수입니다.");
		else System.out.println(q + "는 공배수가 아닙니다. ");

	}

}
