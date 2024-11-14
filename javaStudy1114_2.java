package java_study_1114;

public class javaStudy1114_2 {

	public static void main(String[] args) {
		
		int number = 10; //오른쪽에서 왼쪽으로 데이터 대입
		
	    System.out.println("안에 있는 숫자는 뭘까? " + number);
		/*
		 * int  : 정수형 데이터 타입
		 * number : 식별자
		 * = : 대입
		 * 10 : 정수형 데이터
		 * ; : 문단 종료
		 */
	    
	    /*
	     * 자바는 기본데이터타입 8개와 레퍼런스타입 1개, 총 9개의 데이터타입을 가지고 있다.
	     * String 은 레퍼런스 타입
	     * 레퍼런스란? 다음시간에 계속.
	     */
	    
	    int x = 10; 
	    System.out.println("정수형 데이터타입 : " + x);
	    double y = 10.5555;
	    System.out.println("실수형 데이터타입 : " + y);
	    boolean z = true;                                  //true or false
	    System.out.println("논리형 데이터타입 : " + z);
	    char a = 'a';  
	    System.out.println("문자 데이터타입 : " + a);
	    String s = "Hello World";
	    System.out.println("문자열 데이터타입 : " + s);
	    // 문자는 한 단어만 입력가능, 문자열은 여러 단어 입력가능
	    
	    final double PI = 3.14;     //원주율 3.14 -> 고정된 값을 상수라 함. 
	    //상수는 데이터타입 앞에 final 이라는 키워드 작성
//	    상수에 식별자는 대문자
	    
	    //형변환
	    int num = 10;      //int 는 4바이트
	    double num2 = num;    //double 은 8바이트
	    /*
	     * 정수형 변수 num 에 10 대입
	     * 실수형 변수 num2 에 num 대입
	     * 작은 바이트 크기에서 큰 바이트 크기로 대입할 때 자동으로 형변환
	     * 즉, int num 이 double 로 변환됨.
	     */
	    
	    System.out.println("최종 값 : " + num2);
//	    큰 바이트 크기에서 작은 바이트 크기로 변환할 때는 개발자가 의도적으로 타입을 변환해야 함.
	    double num3 = 100.45;
	    int num4 = (int)num3;     //정수형 변수 num4 에 num3 을 대입함. (강제 타입변환)
	    System.out.println("최종 값 : " +  num4);   //정수 - 뒤에 소수점 없어짐.
	    
//	    그 외
//	    1. 문자형을 숫자로 변환
	    String s1 = "123";     //숫자가 아니라 문자
	    int num5 = Integer.parseInt(s1);       //문자 "123" 을 숫자 123으로 변환
	    System.out.println("최종 값 : " + num5);
	    
//	    2. 숫자를 문자로 변환
	    int num6 = 8000;
	    String s2 = Integer.toString(num6);      //숫자 8000을 문자 "8000" 으로 변환
	    /*
	     * 문자형태인 숫자 "123" 과 숫자 123 의 차이
	     * 문자형태인 숫자는 사칙연산이 불가능
	     */
	}

}
