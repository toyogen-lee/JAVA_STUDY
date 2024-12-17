package java_study_1217;
class resto {
	String name;
	String foodType;
	//메소드(or 생성자) 이름은 동일한데 파라미터 타입만 다르면, 메소드 이름 중복 가능(Overloading)
	public resto() {
		
	}
	public resto(String name, String foodType) {
		this.name = name;     //this. : 필드변수
		this.foodType = foodType;
	}
	public void restoName() {
		//void : 리턴할 게 없음
		System.out.println("식당 이름 : " + this.name);
		System.out.println("타입 : " + this.foodType);
	}
}
public class 복습2 {

	public static void main(String[] args) {
		resto a = new resto();   //default 생성자 선택
		a.name = "스바라시봉명점";
		a.foodType = "일식";
//		System.out.println(a.name);
//		System.out.println(a.foodType);
		a.restoName();
		resto b =new resto("맛찬들","한식");   //파라미터가 있는 생성자 선택
//		System.out.println(b.name);
//		System.out.println(b.foodType);
		b.restoName();  //메소드를 이용해서 코드량 줄이기
		
		/*
		 * 메소드
		 * 1. 코드량 줄이기 가능
		 * 2. 코드 재사용성 증가
		 * 3. 코드 유지보수 & 협업 능률 증가
		 */

	}

}
