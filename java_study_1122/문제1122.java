package java_study_1122;

import java.util.Scanner;

public class 문제1122 {

	public static void main(String[] args) {
		//문제1
		for (int i = 1; i <= 10; i++) System.out.print(i + " ");
		System.out.println();
		
		//문제2
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) System.out.print(i + " ");
		} System.out.println();
		
		//문제3
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += 1; 
			} 
		} System.out.println(sum + "개");
		
		//문제4
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int g = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.print(g + "*" + i + "=" + g*i + "  ");
		} System.out.println();
		
		//문제5
		int san = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) san += i;
		} System.out.println(san);
		
		//문제6
		System.out.print("숫자를 입력하세요 : ");
		int p = scan.nextInt();
		for (int i = p - 1; i > 0; i--) {
			p *= i;
		} System.out.println(p);
		
		//문제7
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) System.out.print("FizzBuzz ");
			else if (i % 3 == 0) System.out.print("Fizz ");
			else if (i % 5 == 0) System.out.print("Buzz ");
			else System.out.print(i + " ");
		} System.out.println();
		
		//문제8
		int q = 0;
		for (int i = 10; i >= 1; i--) {
			q += i;
		} System.out.println(q);
		
		//문제11
		int n = 2;
		int t = 10;
		for (int w = 1; w <= t; w++) {
			n *= 2;
		} System.out.println(n);
		
		//문제12 실패
		int c = 6;
		int i = 1;
		while (i > 0) {
			i++;
			if (c % 2 == 0) {
				c /= 2;
			}
			else if (c % 2 != 0 && c != 1) {
				c = c * 3 + 1;
			} else if (c == 1) break; 
		} System.out.println(i);

	}

}
