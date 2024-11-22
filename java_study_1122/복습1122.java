package java_study_1122;

import java.util.Scanner;

public class 복습1122 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//문제 11
		int n = 15;
		int slice = 7;
		int pizzaCount = 0;
		
		pizzaCount = n / slice;
		
		if (n / slice != 0) {
			++pizzaCount; 
		} System.out.println("pizza count : " + pizzaCount);
		
		//문제 12
		System.out.print("금액을 입력하세요 : ");
		int price = scan.nextInt();
		if (price >= 500000) {
			price *= 0.8;
		} else if (price >= 300000) {
			price *= 0.9;
		} else if (price >= 100000) {
			price *= 0.95;
		} System.out.println("price : " + price);      //내가 했던 코드보다 훨씬 간단하다.

	}

}
