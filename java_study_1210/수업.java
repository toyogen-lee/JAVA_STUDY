package java_study_1210;

//클래스 이름 : 수업
//클래스 이름은 앞에 대문자로 작성.
public class 수업 {
	
	int x = 10;       //필드변수(전역변수)
	
	public 수업() {    //생성자
		
	} public int getX() {    //메소드
		return x;
	}

	public static void main(String[] args) {        //main method      
		//객체지향 : 유지보수 하기 쉽게 코드를 나눈다.
		
		//붕어빵 클래스를 호출(파일 불러오기)
		//new : 클래스 호출
		//x : 붕어빵 클래스 변수 이름
		붕어빵 x = new 붕어빵();
		x.붕어빵종류 = "팥";
		x.붕어빵가격 = 500;
		// . : 접근하다.
		System.out.println("붕어빵 종류 : " + x.붕어빵종류);
		System.out.println("붕어빵 가격 : " + x.붕어빵가격);
		
		/*
		 * 메소드 안에 작성된 변수는 '지역변수' 라고 함.
		 * 지역변수는 선언과 동시에 값을 초기화(must) 해야 함.
		 */
		int num = 0;
		System.out.println(num);
		
		붕어빵 y = new 붕어빵();      //붕어빵 클래스 재호출 (새롭게 호출)
		//값을 대입한 적도 없는데 출력됨! 즉, 필드변수는 자동으로 초기화가 된다.
		System.out.println("붕어빵 종류 : " + y.붕어빵종류);
		System.out.println("붕어빵 가격 : " + y.붕어빵가격);
	}

}
