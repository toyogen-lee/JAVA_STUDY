package java_study_1128;

import java.util.Scanner;

public class 문자열문제1128 {

	public static void main(String[] args) {
		
		/*
		 * 같이 풀어보기
		 * contains 이용해서 특정 이메일 추출하기
		 */
		String[]email = {"123@naver.com", "456@gmail.com", "789@naver.com"};
		//네이버 이메일을 사용하는 계정만 출력
		for(int i = 0; i<email.length; i++) {
			String e = email[i];
			System.out.println("email address : " + e);
			if(e.contains("naver.com")) {
				System.out.println("naver email : " + e);
			}
		}
		//split 활용하여 특정 문자 개수 구하기
		String food = "돈까스@돈까스@라면@김밥@돈까스";
		String[]foodArray = food.split("@");
		int count = 0;
		for(int i=0; i< foodArray.length; i++) {
			if(foodArray[i].equals("돈까스")) {
				++count;
			}
		} System.out.println("돈까스 개수 : " + count);
		
		//1.
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String x1 = scan.next();
		System.out.println(x1.length());
		
		//2. 3   3. 1
		
		//4.
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
		
		//5.
		System.out.print("첫번째 문자열을 입력하세요. ");
		String x2 = scan.next();
		System.out.print("두번째 문자열을 입력하세요. ");
		String x3 = scan.next();
		System.out.println(x2.equals(x3));
		
		//6.
		System.out.print("문자열을 입력하세요. ");
		String x4 = scan.next();
	    System.out.println(x4.substring(0,1));
	    int l = x4.length();
	    int l2 = l - 1;
	    System.out.println(x4.substring(l2,l));
	    
	    //7.
	    System.out.print("문자열 : ");
	    String x5 = scan.next();
	    System.out.print("n : ");
	    int n = scan.nextInt();
	    System.out.println(x5.substring(0, n));
		
	    //8. dedf
	    String word = "aabbacccaaaaa";
	    
	    //9.
	    String e = "user@gmail.com";
	    String[] m = e.split("@");
	    System.out.println(m[1]);
	    
	    //10.ff
	    String[] strArr = {"there", "are", "no", "a", "ds"};
	    
	    //11.ff
	    String my_string = "nice to meet you";
	    
	    //12.fd       
	    String numbers = "onefourzerosixseven";
	    System.out.print(numbers.replace("one", "1"));
	    System.out.print(numbers.replace("four", ""));
	    System.out.print(numbers.replace("zero", "0"));
	    System.out.print(numbers.replace("six", "6"));
	    System.out.print(numbers.replace("seven", "7"));

	}

}
