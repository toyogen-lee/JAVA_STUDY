package java_study_1126;

public class 배열1126 {                   
	public static void main(String[] args) {
		
		// < < 배열은 정말 중요하다. > >
//		배열 > for문 > if/else
		
		/*
		 * 배열은 ""같은 타입"" 의 데이터들이 순차적으로 저장되는 ""공간""
		 * 배열은 0부터 시작합니다.
		 * why? 자바(미국) -> 미국은 0부터 센다.
		 */
		
		int [] array = {10, 20, 30, 40};   //배열 초기화
		//array라는 int형 배열에 10, 20, 30, 40 총 4개의 데이터를 저장
		System.out.println("0번째 배열 값 : " + array[0]);
		System.out.println("1번째 배열 값 : " + array[1]);
		
		int sum = array[1] + array[3];   //첫번째 + 세번째
		System.out.println("총 합 : " + sum);
			//순서? => 인덱스(프로그래밍에서는 순서를 인덱스라고 한다.)
		
		
		
		
		int [] array2 = {10,20,30,40,10,20,30,40,10,20,30,40};
		/*
		 * 배열 안에 들어있는 값이 많아질 때는 인덱스 번호를 이용해서 조회하는게 한계
		 * 배열 안에 있는 값을 효과적으로 가져오기 위해서는 **반복문** 을 사용해야 한다.
		 * 배열하고 for문은 짝궁
		 * array2.length : 배열 길이를 나타냄
		 */
		for (int i = 0; i < array2.length; i++) {
			System.out.print("배열 값 : " + array2[i] + "  ");
		} System.out.println();System.out.println("배열 길이 : " + array2.length);
		
		
		
		
		int [] a3 = {2,3,4,5,6};     //짝수만 출력해봐.
		for (int i = 0; i < a3.length; i++) {
			int num = a3 [i];
			if (num % 2 == 0) {
				System.out.print("짝수 : " + num + "  ");
			}
		} System.out.println();
		//총합과 평균을 구해봐.
		int sum1 = 0;
		double avg = 0;
		for (int i = 0; i < a3.length; i++) {
			sum1 += a3 [i];
		} System.out.println("총합 : " + sum1);
		System.out.println("평균 : " + sum1/a3.length);
		
		
		
		//for문을 이용해서 array4에 있는 3의 배수 총합 출력해보자.
		int [] a4 = {1,2,3,4,5,6,7,8,9,10};
		int b = 0;
		for (int i = 0; i < a4.length; i++) {
			int num = a4 [i];
			if (num % 3 == 0) {
				b += a4 [i];
			}
		} System.out.println("3의 배수 총합 : " + b);
	}

}
