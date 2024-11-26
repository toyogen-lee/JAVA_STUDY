package java_study_1126;

public class 복습1126 {

	public static void main(String[] args) {
		
		//for문 (반복문)
		for(int i = 0; i < 3; i++) {
			System.out.println("Hello World!");
		}
		
		//1~100까지의 숫자 중 3의 배수
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if ( i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
		}
		
		int n = 2;
		int t = 10;
		//1~10시간이라는 범위가 정해짐. -> for
		for (int i = 1; i<=t; i++) {
			n *= 2;
		}
		
		//콜라츠 추측 -> while
		/*
		 * 주어진 수가 1이 될 때까지
		 * 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다.
		 * 범위 지정 x => while문
		 */
		int count = 0;
		int n2 = 6;
		while (n2 != 1) {     //n2가 1이 될 때까지 반복
			if (n2 % 2 == 0) {
				n2 /= 2;
				++count;
			} else {
				n2 = n2 * 3 + 1;
				++count;
			}
		} System.out.println("count : " + count);

	}

}
