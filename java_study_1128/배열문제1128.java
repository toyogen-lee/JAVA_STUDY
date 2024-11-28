package java_study_1128;

import java.util.Random;

public class 배열문제1128 {

	public static void main(String[] args) {
		//1번. 4번 맞춰보기
		int []array = {1,2,3,4,5,6,7,8,9,10};    //첫번째 방법
		int []a2 = new int[10];    //두번째 방법
		for (int i = 0; i<a2.length; i++) {
			a2[i] = i+1;
		} int result = a2[2] * a2[5];
		System.out.println("1번 : " + result);
		
		
		
		Random r = new Random();
		int []a3 = new int[10];      //크기가 10인 정수 배열 선언
		for(int i=0; i<a3.length; i++) {
			a3[i] = r.nextInt(100) + 1;
		}
		int max = 0;
		for(int i=0; i<a3.length; i++) {
			if (max < a3[i]) {
				max = a3[i];
			}
		} System.out.println("max : " + max);

	}

}
