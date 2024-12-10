package java_study_1210;

public class 복습 {

	public static void main(String[] args) {
		/*
		 * 가장 많이 쓰는 연산자
		 * 1. =(대입)
		 * 2. +, -, /, % (사칙연산)
		 * 3. ++, -- (증감)
		 */
	    int x = 10;     //초기 선언식
		x = 30;
		System.out.println(x);
		
		String s = "123";
		String s2 = "456";
		String result = s + s2;
		System.out.println("result : " + result);
		
		int num = Integer.parseInt(result);     //문자 -> 숫자
		System.out.println("result : " + num);
		
		int count = 0;
		++count;
		count++;
		++count;
		System.out.println("count : " + count);
		
		//제어문
		/*
		 * if (95%)
		 * switch (5%)
		 *
		 * 조건문 : 특정 조건을 평가하여 그 결과에 따른 다른 코드를 실행
		 * if(조건식) {
		 *       코드 작성(조건이 true 일 때 실행할 코드)
		 * }
		 * if-else : 조건이 참일 때와 거짓일 때 각각 다른 코드를 실행
		 *if(조건식) {
			 
		 } else {
			 조건이 거짓일 때 실행할 코드
		 }
		 
		 else-if : 여러 개의 조건을 평가
		 if(조건식) {
		 } else if() {
		 } else if() {
		 } else {
		      모든 조건이 거짓일 때 실행되는 코드
		 }
		 */
		
		//boolean 타입 변수는 앞에 'is' 먼저 시작함.(규칙)
		boolean isData = false;
		if(!isData) {
			System.out.println("OK");
		} else {
			System.out.println("impossible");
		}
		
		//두 비밀번호 비교하기
		String password = "123";     //비밀번호
		String rePassword = "456";     //비밀번호 재입력
		// ==(비교)
		//자바에서는 문자를 비교할 때 비교연산자가 아니라 equals 사용
		if(password.equals(rePassword)) {
			System.out.println("비밀번호가 일치합니다. ");
		} if(!password.equals(rePassword)) {         //else 대신 if 로 나타냈을 때
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		if(10!=5) {
			System.out.println("A");
		} else System.out.println("B");
		
		/*
		 * 반복문 : 특정 블록의 코드를 여러 번 반복해서 실행.
		 * for : 반복 횟수가 정해져 있을 때 사용
		 * while : 조건이 참인 동안 반복 실행(횟수제한 x)
		 * for(초기화(1); 조건식(2); 증감식(4)) {
		 *        반복할 코드(3)
		 * }
		 * while(조건식(1)) {
		 *       반복할 코드(2)
		 * }
		 */
		for(int i=1; i<=10; i++) {       //1~10 출력
			//짝수만 출력
//			System.out.print(i + "  ");
			if(i%2==0) {
				System.out.print(i + "  ");
			}
		} System.out.println();
		
		/*
		 * 배열 : 동일한 데이터 타입의 여러 데이터를 하나의 변수로 관리할 수 있게 해주는 자료구조
		 * 쉽게 말해, 같은 종류의 데이터들을 한 줄로 나열한 것
		 * for 절친
		 */
		
		//1. 배열 선언 및 초기화
		int[] array = {1,2,3,4};   
		int[] array2 = new int[4];
		//2. 배열 요소(아이템) 접근 및 조작
		System.out.println("0번 index : " + array[0] + "요소(아이템)");
		System.out.println("1번 index : " + array[1] + "요소(아이템)");
		System.out.println("2번 index : " + array[2] + "요소(아이템)");
		System.out.println("3번 index : " + array[3] + "요소(아이템)");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(i+"번 index : " +array[i]+"요소(아이템)");
		}
		
		//배열 요소 값 변경하기
		System.out.println("2번 index : " + array[2] + "요소(아이템)");
		array[2] = 50;
		System.out.println("2번 index : " + array[2] + "요소(아이템)");
		
		//같이풀기 1. score 보다 점수 높은 사람 카운트
		int[]score = {50,80,100,100,90};
		int myScore = 77;
		int count3 = 0;
		for(int i=0; i<score.length; i++) {
			if(score[i] > myScore) {
				++count3;
			}
		} System.out.println(count3);
		
		//같이풀기 2. 배열에서 최댓값 찾기
		int[] numbers = {12,45,7,23,56,89,34};
		int max = 0;
		for(int i=0; i<numbers.length; i++) {
			int temp = numbers[i];
			if(max < temp) max = temp;
		} System.out.println("max : " + max);
		
		//같이풀기 3. 닉네임 중복체크하기
		String[] nickNames = {"사과","바나나","오렌지","포도","키위"};
		String userNickName = "사과";
		for(String i : nickNames) {
			if(i.equals(userNickName)) System.out.println("닉네임이 중복됩니다. ");
		}
		      //선생님이 푼 코드
		boolean isFlag = false;      //flag (0 or 1)
		for(int i=0; i<nickNames.length; i++) {
			String temp = nickNames[i];
			if(temp.equals(userNickName)) isFlag = true;
		} if(isFlag) System.out.println("닉네임이 중복됩니다. ");
		
		//같이풀기 4. 배열의 모든 요소의 합 구하기 (for-each)
		int[]numbers2 = {5,10,15,20,25};
		int sum = 0;
		for(int i : numbers2) {
			sum += i;
		} System.out.println("total : " + sum);

	}

}
