package java_study_1217;

import java.util.Scanner;

class calcu {     //if, calcu 클래스 수정 불가능  |  +- 기능이 있는 클래스 필요
	//Scanner : 

	public int sum(int x, int y) {
		return x + y;
	}
}
	class calcu2 {     //-> 그대로 복사한다.
		public int sum(int x, int y) {
			return x + y;
		}
		public int minus(int x, int y) {
			return x - y;
		}
}
	/*
	 * ***extends*** : 상속
	 * 상속을 이용해 '계산기' 클래스 기능을 물려받을 수 있음.
	 * '계산기3'(자식클래스 == subClass)은
	 * '계산기'(부모클래스 == superClass)에 있는 필드변수와 메소드를 사용할 수 있다.
	 */
	class calcu3 extends calcu {
		/*
		 * 부모클래스에 있는 메소드 가져오기
		 * @Override : 오버라이딩(부모클래스 메소드 '재정의')  -  **매우 중요**
		 * Overloading : 메소드 이름 중복 허용(파라미터 타입 다르게)
		 */
		@Override
		public int sum(int x, int y) {
			// TODO Auto-generated method stub
			return super.sum(x, y);
		}
		public int minus(int x, int y) {
			return x - y;
		}
	}
public class 수업 {

	public static void main(String[] args) {
		calcu c = new calcu();
		int result = c.sum(10, 10);
		System.out.println(result);
		
		//자바는 무료 오픈소스이기 때문에 내장클래스 확인 가능
		Scanner scan = new Scanner(System.in);
		
		calcu3 c3 = new calcu3();
		c3.sum(10, 20);
		System.out.println(c3.sum(10, 20));

	}

}

