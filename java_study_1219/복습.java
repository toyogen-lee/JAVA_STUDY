package java_study_1219;
/*
 * 객체지향 언어(Java, C++, Python, C# . . .)의 특징
 */
class A{
	/*
	 * 1. 필드변수
	 * 2. default 생성자
	 * 3. 메소드
	 */
	int x;   //필드변수(전역변수) : '클래스 안에 작성된' 모든 메소드에서 필드변수를 사용할 수 있음.
	public A(){    //기본 생성자
		/*
		 * 1. 생성자 이름이 클래스 이름과 동일
		 * 2. 리턴타입 x
		 */
	}
	public A(int x) {    //파라미터 값이 존재하는 생성자
		//오버로딩으로 메소드(생성자) 이름 중복 사용 -   why?  변수 or 메소드 이름 짓는게 힘들어서
		this.x = x;    //파라미터로 받은 값을 필드변수 'x' 에 대입
	}
	/*
	 * 리턴타입이 int 인 메소드 'getNum'
	 * 파라미터로 int x, int y 를 받습니다.
	 * 리턴은 int 형으로 해줍니다.
	 */
	public int getNum(int x, int y) {
		return x + y;
	}
	/*
	 * 리턴타입이 String[] 인 메소드 'getArr'
	 * 파라미터로 String[] 를 받습니다.
	 * 리턴은 '문자형 배열' 로 합니다.
	 */
	public String[] getArr(String[] array) {
		return array;
	}
}
public class 복습 {
	public static void main(String[] args) {
		
	}

}
