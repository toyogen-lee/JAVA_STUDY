package java_study_1219;
//8.
class Animal {
	public void makeSound() {
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}
//9.
class Vehicle extends Object {   //Vehicle 기본 상속클래스는 Object
	//protected : 동일 패키지 혹은 상속받은 클래스에서 접근 가능
	//*public : 동일 프로젝트 안에서 모든 클래스가 접근 가능
	//*private : 클래스 안에서만 접근 가능, 외부 호출 불가능(데이터 보호)
	protected String brand = "Ford";
	public Vehicle() {
		System.out.println("Vehicle constructor called");
	}
	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}
class Car extends Vehicle {
	//private : Car 클래스 안에서만 사용 가능합니다.  *외부로 호출 불가능
	private String modelName = "Mustang";
	public Car() {
		super();  //부모 생성자 호출 ( 부모 생성자가 기본 생성자일 경우 생략 가능 )
		//기본 생성자가 가장 먼저 호출됩니다.
		System.out.println("Car constructor called");
	}
	@Override
	public void honk() {
		System.out.println("Beep, beep!");
	}
	public void printInfo() {
		System.out.println(brand + " " + modelName);
	}
}
public class 문제 {

	public static void main(String[] args) {
		//1.a   2.c   3.c   4.b   5.b   6.d   7.b
		//8.
		Animal ko = new Animal();
		ko.makeSound();
		Dog dog = new Dog();
		dog.makeSound();
		
		/*
		 * 9. Car constructor called**
		 * Beep, beep!  
		 * Ford Mustang
		 * Car constructor called**
		 * Beep, beep!**  
		 */
		Car myCar = new Car();  //Car 클래스 호출
		//Car 는 Vehicle 를 상속받았기 때문에 부모클래스의 생성자가 가장 먼저 호출된다.
		//순서 : 부모생성자 -> 자식생성자 -> 메소드 호출
		myCar.honk();
		myCar.printInfo();
//		myCar.modelName
		Vehicle myVehicle = new Car();   //?
		/*
		 * 부모클래스는 자식클래스를 대입받을 수 있음.
		 * 하지만, 자식클래스에서 정의된 메소드와 필드변수는 사용할 수 없음.
		 */
		myVehicle.honk();

	}

}
