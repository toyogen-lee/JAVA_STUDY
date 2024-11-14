package java_study_1114;

import java.util.Scanner;     //Scanner 의  기능을 사용할 때 import 키워드를 이용해서 불러옴.

public class javaStudy1114_3 {

	public static void main(String[] args) {
		
//		Scanner 를 이용한 키 입력
		Scanner scan = new Scanner(System.in);    //데이터를 입력받을 때 사용
//		ctrl + shift + o   -> import ja...
		
//		문제 1. 두 개의 정수를 입력받아, 그 합을 출력하기
		System.out.print("첫번째 정수를 입력하세요 : ");
		int x = scan.nextInt();      //정수형 입력받기		
		System.out.print("두번째 정수를 입력하세요 : ");
		int y = scan.nextInt();
		
		int sum = x + y;  
		System.out.println("두 정수의 합 : " + sum);
		int mul = x * y;
		System.out.println("두 정수의 곱 : " + mul);
		int div = x / y;
		System.out.println("나눈 값 : " + div);
		
//		문제 2. 실수형 변수 height 을 선언하고 180.7을 할당(대입)하는 코드를 작성하기
		double height =180.7;
		
//		문제 3. 입력받은 두 정수형 평균값 구하기
		System.out.print("a : ");
		int a  =scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		
		int avg = (a + b) / 2;
		System.out.println("입력받은 두 정수의 평균 : " + avg + " 입니다. ");
		
//		연습
		System.out.print(" 이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		System.out.println("안녕하세요, " + name + " 님! 당신은 " + age + "살 입니다. ");
		
	}

}
