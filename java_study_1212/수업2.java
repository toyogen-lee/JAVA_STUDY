package java_study_1212;
class Person {
	String name;
	int age;
	Person(String name, int age){   //생성자 : new 후 초기화를 위해 실행되는 특별한 method
		this.name = name; 
		this.age = age;
//		this.x = 10;   => 필드변수에 x 라는 변수가 없으므로 error
		}  
	/*
	 * 1. 생성자 이름과 클래스 이름은 동일해야 합니다.
	 * 2. 생성자는 리턴타입이 없는 '메소드' 입니다.
	 * 3. 생성자는 파라미터 타입만 있고, 기본(default) 생성자는 아무것도 받지 않습니다.
	 * 생성자 파라미터의 역할 : 받은 값을 필드변수에 대입함.
	 */
	
	//void -> return type 없는 method 'celebrateBirthday' 생성
	public void celebrateBirthday(String name) {++age;}
}

public class 수업2 {

	public static void main(String[] args) {
		Person p = new Person("kim", 20);
		p.name = "kim";
		p.age = 20;
		System.out.println("이름 : "+p.name+" | 나이 : "+p.age);
		p.celebrateBirthday("kim");   //파라미터에 값이 있다면, 무조건 넣어야 함.
		System.out.println(p.age);
		
		Person p2 = new Person("hong", 30);     //생성자로 필드변수 초기화
		System.out.println("이름 : "+p2.name+" | 나이 : "+p2.age);

	}

}
