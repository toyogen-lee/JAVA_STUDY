package java_study_1119;

public class 수업1 {

	public static void main(String[] args) {
		
		//비교 연산자 : 비교연산자 결과는 true 혹은 false 로 표기
		boolean 비교 = 3 < 5;
		System.out.println(비교);
		boolean 비교2 = 4 > 10;
		System.out.println(비교2);
		boolean 비교3 = 5 == 5;
		System.out.println(비교3);
		boolean 비교4 = 5 != 7;
		System.out.println(비교4);
		
		//논리 연산자
		boolean 배가고프다 = true;
		boolean 돈이있다 = true;
		boolean 식당에갈수있다 = 배가고프다 && 돈이있다;
		System.out.println("식당에 갈 수 있다 : " + 식당에갈수있다);
		
		boolean 비가온다 = true;
		boolean 우산이있다 = true;
		boolean 외출가능 = 비가온다 || 우산이있다;   //or
		System.out.println("외출 가능 : " + 외출가능);
		
		boolean 햇빛이쨍쨍 = true;
		boolean 흐린날씨 =! 햇빛이쨍쨍;   //not | 변수명 앞에 느낌표
		System.out.println("흐린날씨 : " + 흐린날씨);
		
		
		
		//복합 대입 연산자
		int a = 10;
		int b = 20;
//		a = a + b;
		a += b;
		System.out.println("a의 값은? " + a);
		
		int c =5; 
		int d = 6;
//		c = c * d;
		c *= d;
		System.out.println("c의 값은? " + c);
		
		
		
		//증감 연산자
		//변수의 값을 +_1
		int 증감 = 0;
		증감++;
		System.out.println("증감 : " +증감);
		증감++;
		System.out.println("다시 증감 : " + 증감);
		증감--;
		System.out.println("감소 : " +증감);
		
		//증감 연산자는 전위 연산자와 후위 연산자로 나뉨
		//전위 연산자(변수명 앞에 ++--)
		int apple = 100;
		System.out.println(++apple);   // 1 증가
		System.out.println(apple);    // 그대로
		
		int bana = 100;
		System.out.println(bana++);    // 그대로
		System.out.println(bana);    // 1 증가
		
		
		
		//삼항 연산자 (3개의 피연산자)
		int num = 3;
		int num2 = 5;
		int 결과 = num > num2 ? num - num2 : num + num2;
		// opr1 ? opr2 : opr3  |  1 true - 2 실행, 1 false - 3 실행
		System.out.println("result : " + 결과);
		
		
//		문제 1.
		int 용돈 = 5000;
		용돈 -= 3000;
		System.out.println("용돈 : " +용돈);
		용돈 += 3000;
		System.out.println("용돈 : " +용돈);
		
		
		double weight = 70.5;
	    double height = 1.77;
	    double bmi = weight / (height * height);
	    System.out.println("bmi : " + bmi);
	   
	    
	}

}
