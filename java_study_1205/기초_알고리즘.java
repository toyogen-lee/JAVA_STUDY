package java_study_1205;

import java.util.Random;
import java.util.Scanner;

public class 기초_알고리즘 {

	public static void main(String[] args) {
		
		//1. 3    3. 3
		//2.
		String x = "10";
		int y = Integer.parseInt(x);
		
		//4.
		for (int i=1; i<=100; i++) {
			if(i%2==0) System.out.print("짝수 : " + i + "   ");
			else System.out.print("홀수 : " + i + "   ");
		} System.out.println();
		
		//5. false
		//6.
		int bai = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) bai += i;
		} System.out.println(bai);
		
		//7.
		int n = 15;
		if(n%7!=0) {
			int n2 = n/7 + 1;
			System.out.println("pizza : " + n2);
		} else {
			int n2 = n/7;
			System.out.println("pizza : " + n2);
		}
		
		//8.
		Scanner scan = new Scanner(System.in);
		System.out.print("팩토리얼 : ");
		int p = scan.nextInt();
		for(int i=p-1; i>0; i--) {
			p *= i;
		} System.out.println(p);
		
		//9.
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+" x "+j+" = "+i*j + "    ");
			}
		} System.out.println();
		
		//10.
		for(int i=0; i<=4; i++) {
			for(int j = 0; j < 4-i; j++) System.out.print("*");
			System.out.println();
		}
		
		//11.
		System.out.print("아이디를 입력하세요. ");
		String ai = scan.next();
		if(ai.length()>=11) System.out.println("아이디는 10글자 이하로 작성해주세요.");
		else System.out.println("문자열 길이 : " + ai.length());
		
		//12. 4
		//13. 
		int[] a = new int[10];
		int max = 0;
		Random r = new Random();
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100) + 1;
			if (max < a[i]) max = a[i];
		} System.out.println(max);
		
		//14.
		double avg = 0;
		int[] a2 = new int[10];
		for(int i=0; i<a2.length; i++) {
			a2[i] = r.nextInt(100) + 1;
			avg += a2[i];
		} System.out.println("평균은 " + avg / a2.length + ", 총합은 " + avg);
		
		//15.
		String agae = "Java Programming";
		int count = 0;
		String[] a3 = agae.split("");
		for(int i=0; i<a3.length; i++) {
			if(a3[i].contains("a")) {
				++count;
			}
		} System.out.println("문제 15. a의 개수 : " + count);
		
		//16.
		int money = 15000;
		int ame = 5500;
		System.out.println("아메리카노 "+money/ame+"잔, 남은돈 "+money%ame+"원");
		
		//17.
		int[] a4 = {149,180,192,170};
		int height = 167;
		int count2 = 0;
		for(int i=0; i<a4.length; i++) {
			if(height < a4[i]) ++count2;
		} System.out.println("길동이보다 큰 사람 : "+count2);
		
		//18. ???
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String[] a5 = cipher.split("");
		for(int i=1; i<=a5.length; i++) {
			if(i % code == 0) {
				//cipher = cipher.replaceAll(a5[i], "");
				System.out.print(a5[i-1]);
			}
		} 
		
		//19.
		String phone_number = "0171238888";
		String[] a6 = phone_number.split("");
		for(int i=0; i<a6.length; i++) {
			if(i < a6.length-4) {
				phone_number = phone_number.replaceAll(a6[i], "*");
			} 
		} System.out.println("phone_number : " + phone_number);
		
		//20. while 활용   fail...
		int c = 100;
		int c2 = 0;
		while (c < 10) {
			c = c/10;
			c2 = c2 + c;
		} System.out.println(c2);
		
		//21. fail...
		String w = "people";
		String[] a7 = {"p","e"};
		String[] a8 = w.split("");
		for(int i=0; i<a8.length; i++) {
			
			if(i >=3); 
		}
		
		
		//22. 
		int hp =24;
		int z = 5;
		int b = 3;
		int e = 1;
		int z1 = hp/z;
		hp = hp%z;
		int b1 = hp/b;
		hp = hp%b;
		int e1 = hp/e;
		int sai = z1+b1+e1;
		System.out.println("최소한의 병력 : " + sai);

	}

}
