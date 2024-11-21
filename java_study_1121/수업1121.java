package java_study_1121;

import java.util.Scanner;

public class 수업1121 {

	public static void main(String[] args) {
		
		//예제 => 시험 점수가 80점 이상이면 합격 판별을 하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		System.out.println("입력한 점수는 " + score);
		
		// >= 비교 연산자
		if(score >= 80) {  
			System.out.println("합격!");
		} else {
			System.out.println("불합격.");  //true -> if  |  false -> else
		}
		/*
		 * else 단독으로 사용 불가
		 * else 는 if 다음에 작성 가능 (옵션)
		 */
//		else {
		
		//중첩 if문 : 조건이 여러가지
		System.out.print("점수2를 입력하세요 : ");
		int score2 = scan.nextInt();
		
		if(score2 >= 90 && score2 <= 100) {
		System.out.println("A");
     }else if(score2 < 90 && score2 >= 80) {
    	 System.out.println("B");
     }else if(score2 < 80 && score2 >= 70) {
    	 System.out.println("C");
     }else
    	 System.out.println("F");
}
}

