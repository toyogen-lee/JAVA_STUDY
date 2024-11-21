package java_study_1121;

import java.util.Scanner;

public class 스위치1121 {

	public static void main(String[] args) {
		
		//switch문 : 중첩 else문과 비슷한 기능
		char grade = 'a';
		switch(grade) {
		case 'a' : System.out.println("A");  
		break;     //멈추다
		case 'b' : System.out.println("B");
		break;    
		default : System.out.println("잘못된 학점입니다. ");   //case에 맞는 조건이 없을 때 실행
		}   //코드가 길어서 자주 쓰진 않음.
		
		//문제 1. 1~5까지의 숫자를 입력받아 해당하는 과일 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("1~5 중에서 숫자를 입력하세요. ");
		int a = scan.nextInt();
		switch(a) {
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
		
		

	}

}
