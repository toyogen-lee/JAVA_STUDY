package java_study_1217;
class Food {
	String name;
	int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	public void eat() {
		System.out.println("Eating : " + this.name);
	}
	public int getCalories() {
		return this.calories;
	}
}
class Pizza extends Food{
	String[] toppings;
	public Pizza(String name, int calories, String[] toppings) {
		super(name, calories);  //super : 부모클래스 생성자 호출
		this.toppings = toppings;
	}
	@Override
	public void eat() {
		System.out.println("Eating a slice of " + super.name + " pizza");
	}
	public void showToppings() {
		System.out.print("Toppings : ");
		for(String s : toppings) {
			System.out.print(s + " , ");
		} System.out.println();
	}
}
class Sushi extends Food{
	String fishType;
	public Sushi(String name, int calories, String fishType) {
		super(name,calories);
		this.fishType = fishType;
	}
	@Override
	public void eat() {
		System.out.println("Eating " + super.name + " sushi");
	}
	public void showFishType() {
		System.out.println("FishType : " + this.fishType);
	}
}
public class 수업2 {

	public static void main(String[] args) {
		Food food = new Food("Food", 100);
		String[] toppings = {"Tomato","Mozzarella","Basil"};
		Pizza margherita = new Pizza("margherita", 300, toppings);
		
		Sushi salmonRoll = new Sushi("salmon Roll", 250, "Salmon");
		
		food.eat();
		margherita.eat();
		salmonRoll.eat();
		
		margherita.showToppings();
		salmonRoll.showFishType();
		
		/*
		 * Food 클래스 : 기본 음식 클래스, 모든 음식의 공통 속성인
		 * name 과 calories 그리고 eat() 메소드를 가진다.
		 * 
		 * Pizza Sushi 클래스 : Food 를 상속받아 eat 메소드를 **오버라이딩**
		 * 또한 Pizza 클래스에는 토핑을 보여주는 showToppings() 메소드 구현
		 * Sushi 클래스에는 생선 종류를 보여주는 showFishType() 메소드 구현
		 */

	}

}
