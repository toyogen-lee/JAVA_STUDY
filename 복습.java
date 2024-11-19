package java_study_1119;

public class 복습 {

	public static void main(String[] args) {
		//8가지 기본타입 + 레퍼런스 타입 = 총 9가지 데이터타입
		/*
		 * 1. int 
		 * 2. double
		 * 3. String
		 * 4. boolean
		 */
		int x = 10;    // 데이터 타입. 변수 이름. 대입 연산자. 데이터;
		
//		변수 이름은 중복 불가능
		int a  = 20;
		a = 10;    // a 라는 변수 재활용 (변수를 재활용할 때는 앞에 데이터타입 작성 x)
		System.out.println("a의 최종 값은? " + a);
		
		int b = 20;   //b 라는 변수 생성 -> 선언문(초기화)
		b =40;   // 재활용
		
//		문제 11
		int n1 = 100;
		int n2 = 90; 
		int n3 = 80;
		int avg = 0;   // 평균을 구할 변수
		
		avg = (n1 + n2 + n3) / 3;
		System.out.println("평균 : " +avg);
		
//		문제 12
		int money = 800;
		double percent = money * 0.1;
		
		System.out.println("800의 10%는 " + percent);

	}

}
