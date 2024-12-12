package java_study_1212;

class student {
	String name;           //필드변수(전역변수), 초기화 생략 가능
	int grade;
	/*
	 * 클래스 구조(객체지향 프로그램언어(C++ Python Java...)에 있는 공통 개념)
	 * 1. 필드변수
	 * 2. 메소드 : 특정 작업을 수행하는 코드의 집합
	 *         => 능력 있는 개발자는 메소드를 여러 개 만들어 코드를 분리함.
	 * 3. 생성자
	 */
	/*
	 * 메소드의 기본 구조
	 * public : 접근제어자
	 * int : 반환 데이터타입(리턴값)
	 * add : 메소드 이름 (보통 동사로 작성함.)
	 * (int a, int b) : 인자값 or 매개변수 or 파라미터(v)
	 * 파라미터 : 메소드가 작업을 수행하는 데 필요한 데이터
	 * return : 반환 데이터타입에 맞는 반환값(메소드의 결과를 반환)
	 */
public int add(int a, int b) {
		return a + b;
	}
public int minus(int a, int b) {
	return a - b;
}
//(question) 곱하기 메소드, 나누기 메소드를 만들자.
public int multy(int a, int b) {return a * b;}
public int divide(int a, int b) {return a / b;}

//반환 데이터타입(int String double char boolean...) + void = 10가지
public String hobby() {String hobby = "gym"; return hobby;}    //return type 과 반환데이터타입은 항상 일치해야 한다.
public void hobby2() { System.out.println("취미는 등산입니다. "); }   //void : 리턴 없음
}

//클래스 파일 하나에 public 한번만 작성 가능
public class 수업 {

	public static void main(String[] args) {
//		java memory : Heap 이라는 영역에 저장 (인스턴스 변수)
		student s1 = new student();       //new : 클래스를 불러오다(클래스를 인스턴스화 하다)
		s1.name = "hong";   //클래스를 불러오면(new)  -> 필드변수 접근( . )이 가능하다.
		s1.grade = 3;
		System.out.println("name : " + s1.name + "  |   grade : " + s1.grade);
	    System.out.println(s1);   //Heap 에 저장된 위치(memory address) 조회
		
		//동일한 클래스 한번 더 호출하기
		student s2 = new student();
		System.out.println(s2);   //Heap 에 저장된 위치(memory address) 조회
		s2.name = "kim";
		s2.grade = 1;
		System.out.println("name : " + s2.name + "  |   grade : " + s2.grade);
		
		s1.grade = 1;   //"hong" 학년 수정
		System.out.println("name : " + s1.name + "  |   grade : " + s1.grade);
		
		student s3 = new student();
		System.out.println(s3);    //새로운 Heap 영역에 저장
		
		int result = s3.add(10, 20);
		System.out.println("result : " + result);
		int result2 = s3.minus(30, 10);
		System.out.println("result2 : " + result2);
		
		String hobby = s3.hobby();
		System.out.println("Hobby : " + hobby);
		s3.hobby2();

	}

}
