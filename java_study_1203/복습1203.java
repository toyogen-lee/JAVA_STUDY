package java_study_1203;

import java.util.Scanner;

public class 복습1203 {

	public static void main(String[] args) {
		//1. 1~100 중 짝수만 출력해.
		for(int i=1; i<=100; i++) {
			//if 이용해 짝수 판단
			if(i%2==0) System.out.print(i + "  ");  //코드 한줄이면 중괄호 생략 가능
		} System.out.println();
		//1~100 범위 => for
		//반복문 1.for  2.while  3.do-while(거의없음)
		
		//2. 1~10 총합
		int sum = 0;
		for(int i=1; i<=10; i++) {
			//+=(복합연산자) => sum = sum + i;
			sum += i;
		} System.out.println(sum);
		
		//3. 배열, apple이 총 몇 개인지 출력하기
		int count = 0;  
		String[] array = {"apple","apple","apple","banana"};
		for(int i=0; i<array.length; i++) {
			if(array[i] == "apple") ++count; 
		} System.out.println("총 " + count + "개");      //나
		
		int count2 = 0;
		for(String i : array) {
			if(i.equals("apple")) {
				++count2;
			}
		} System.out.println(count2);    //선생님
		
		//4.
		double price = 580000;
		if (price >= 500000) {
			price *= 0.8;
		} else if (price >= 300000) {
			price *= 0.9;
		} else if (price >= 100000) {
			price *= 0.95;
		} System.out.println("가격 : " + price);
		
		/*
		 * [문자열 문제]
		 * 문자열 my_string에 "hello"가 주어질 때
		 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열 출력하기
		 * n = 3
		 */
		String my_string = "hello";
		int n = 3;
//		String[] a = my_string.split("");
//		for(String i : a) {
//			my_string = my_string.replaceAll(i, i+i+i);
//		} System.out.println(my_string);
//		
//		String[] match = {"h","e","l","l","o"};
//		for(int i=0; i<match.length; i++) {
//			String c = match[i];
//			my_string = my_string.replaceAll(c, c);
//		} System.out.println(my_string);                  내가 푼건 실패
		
		//이중 for문
		String result = "";
		for(int i=0; i<my_string.length(); i++) {
			String word = my_string.substring(i, i+1);
			for (int j=0; j<n; j++) {
				result += word;
			}
		} System.out.println("result : " + result);
		
		//repeat : 특정 문자를 반복
		String s = "Hello";
		System.out.println(s.repeat(3));
		
		//repeat 활용해서 위 문제 다시 풀어보자.
		String[] strArray = my_string.split("");
		String result2 = "";
		for(String i : strArray) {
			result2 += i.repeat(n);
		} System.out.println(result2);
		
		//[배열] 짝수, 홀수 갯수 구하기
		/*
		 * 정수형 배열 num_list가 주어질 때 num_list의 원소 중 짝수와 홀수의 개수를
		 * 담은 정수형 배열 answer_list를 완성하기.
		 */
		int[] num_list = {1,3,5,7};
		int[] answer_list = new int[2];
		int count3 = 0;
		int count4 = 0;
		for(int i : num_list) {      //forEach
			if(i % 2 == 0) ++count3;
			else ++count4;
		} 
		answer_list[0] = count3;         //0번째 인덱스에 값 대입
		answer_list[1] = count4;         //1번째 인덱스에 값 대입
		
		int yang = 12000;
		int umryo = 2000;
		Scanner scan = new Scanner(System.in);
		System.out.println("양꼬치 : ");
		int n1 = scan.nextInt();
		System.out.println("음료수 : ");
		int k = scan.nextInt();
		if(n1 / 10 > 0) k -= n1/10;
		int price2 = yang * n1 + umryo * k;
		System.out.println("지불해야 할 가격 : " + price2);

	}

}
