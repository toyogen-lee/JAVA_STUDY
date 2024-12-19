package java_study_1219;
class X {
	int money;
	public X() {
		
	}
	public X(int money) {
		this.money = money;
	}
	public void showMeTheMoney() {
		System.out.println("my money : " + this.money + "$");
	}
}
class B {
	public void showMeTheMoney() {
		System.out.println("my money : " + 100000000 + "$");
	} 
}
//아쉽게도 Java 는 다중상속이 불가능 (C++, Python 은 가능)
class Y extends X{    //Y클래스가 X클래스를 상속받다.
	//Y클래스는 X클래스의 필드변수와 메소드를 사용할 수 있다.
	int myMoney = 1000;
	
	//부모클래스에서 기본 생성자를 수정했다면, 자식클래스 생성자에서 부모클래스 생성자를 무조건 호출해야 한다.
	public Y() {
		super(40000);   //public X(int money) { }
	}
	public int getMoney() {
		return this.myMoney;
	}
	
	@Override   //부모클래스에 정의된 메소드 '재정의(오버라이딩)'
	public void showMeTheMoney() {
		System.out.println("my(Y) money : " + 900000 + "$");
	}
	public void showMessage() {
		System.out.println("Hello, I'm Y. ");
	}
}
public class 복습2 {

	public static void main(String[] args) {
		X x = new X();
		x.showMeTheMoney();    //x 는 showMessage 가 없음
		/*
		 * 자식은 부모의 메소드와 필드변수를 사용할 수 있지만
		 * 부모는 자식의 메소드와 필드변수를 사용할 수 없다.
		 */
		Y y = new Y();
		y.showMeTheMoney();
		y.showMessage();
		int result = y.getMoney();   //리턴타입이 있는 메소드 호출
		//result 라는 변수에 getMoney 최종값을 리턴받음.
		System.out.println("result : " + result);

	}

}
