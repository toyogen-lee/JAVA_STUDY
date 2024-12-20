package java_study_1220;
class B extends Object{    //Object 상속, 기본 생성자
	int x;   //필드변수(전역변수) : 모든 메소드에서 접근 가능
	public B() {
		/*
		 * 생성자 특징
		 * 1. 리턴타입 없음
		 * 2. 메소드 이름과 클래스 이름이 동일
		 */
	}
	//오버로딩 : 메소드 이름은 동일, 파라미터 값 다름 (이름 짓기 편리)
	public B(int x) {
		this.x = x;   //this 이용해서 파라미터 값을 필드변수 x 에 대입
	}
	public void showMessage() {
		System.out.println("Hello, I'm B class.");
	}
}
//implements : 구현하다
class A extends B implements C{    //Java 는 다중상속 지원 x -> interface
	/*
	 * A클래스는 B클래스에 선언된 메소드와 필드변수를 사용할 수 있음.
	 * 단, 접근지정자가 public or protected 로 되어있어야 함.
	 */
	@Override
	public void showMessage() {     //부모클래스 메소드 '재정의'
		System.out.println("I'm A class");
	}

	@Override
	public void showMessage2() {    //인터페이스에 정의된 메소드를 '강제로' 구현해야 함. (계약)
		System.out.println("override");
	}
}
interface C{     //인터페이스는 메소드 '선언' 만 가능, '구현' 불가능
	public void showMessage2();
}
public class 복습 {

	public static void main(String[] args) {
		A a = new A();
		a.showMessage();
		a.x = 10;
		a.showMessage2();

	}

}
