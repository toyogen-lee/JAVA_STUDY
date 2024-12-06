package java_study_1206;

import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {
		
		//1. 3(상수)
		//2. Integer.parseInt()
		//5. false
		
		//7. strange pizza store give 7 piece
		int n = 15;
		final int SLICE = 7;
		int x = n % SLICE;                //this logic is used to board. (게시판)
		int result = n / SLICE;
		if(x>0) ++result;
		
		//8. factorial
		System.out.print("int : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int f = 1;
		for(int i=2; i<=num; i++) {
			f *= i;
		} System.out.println(num+"! = "+f);
		
		/*
		 * 10.
		 * ****
		 * ***
		 * **
		 * *
		 */
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) System.out.print("*");
			System.out.println();
		} 
		
		//11.
		String word = "hh";
		System.out.println("length : " + word.length());
		
		//17.[배열]
		int[] a = {149,180,192,170};
		int height = 167;
		int count = 0;
		for(int i : a) {
			if(height < i) ++count;
		} System.out.println("tall : " + count);
		
		//18.
		String cipher = "dhjardstddetckdaccccdegk";
		int code = 4;
		String answer = "";
		for(int i=1; i<cipher.length(); i++) {
			if((i+1) % code == 0) {
				answer += cipher.substring(i, i+1);
			}
		} System.out.println("answer : " + answer);
		
		//19. 전화번호
		//first.
		String pn = "0171238888";
		int temp = pn.length() - 4;
		String star = "";
		for(int i=0; i<temp; i++) {
			star += "*";
		} String lastNum = pn.substring(temp);
		System.out.println("lastNumber : " + lastNum);
		pn = star + lastNum;
		System.out.println("phone_number : " + pn);
		//second.
		String[] phone = pn.split("");
		String result2 = "";
		for(int i=0; i<phone.length; i++) {
			if(i < (pn.length()-4)) result2 += "*";
			else result2 += phone[i];
		} System.out.println("sec. "+result2);
		
		
		//String 붙여지는 코드
		String str = "Hello";
		String str2 = "World";
		System.out.println(str+str2);
		String aa = "";
		for(int i=0; i<3; i++) aa += "!";
		System.out.println(aa);
		
		//20. chicken - while code
		int c = 1081;
		int chi = 0;
		while(c >= 10) {
			int coupon = c % 10;
			chi += c / 10;
			c = coupon + c / 10;
		} System.out.println("total service chicken : " + chi);
		
		//21. [hard level] contains
		String s = "people";
		String[] a2 = s.split("");
		String result3 = "";
		for(int i=0; i<a2.length; i++) {
			if(!result3.contains(a2[i])) {
				result3 += a2[i];
			}
		} System.out.println(result3);
		
		//22. [hard level] ant soldier   (그리드 알고리즘)
		int hp = 24;
		int count2 = 0;
		count2 += hp / 5;      
		hp %= 5;
		count2 += hp / 3;
		hp %= 3;
		count2 += hp;
		System.out.println(count2);

	}

}
