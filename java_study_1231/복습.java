package java_study_1231;
import java.util.Scanner;

class A{
	private int x;
	private int y;
	public int getX() {     //get : 전역변수 리턴
		return x;
	}
	public void setX(int x) {     //set : 전역변수 값 초기화
		this.x = x;
	}
	public int getY() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class 복습 {

	public static void main(String[] args) {
		
		boolean isFlag = false;
		String inputWord = "apple";
		if(inputWord.equals("apple")) {
			isFlag = true;
		}
		if(isFlag) {    //플래그값을 이용해서 특정 코드를 실행할 수 있습니다.
			System.out.println("플래그 값 변경");
		}
		
		//ex)
		boolean isFlag2 = false;
		String book[] = {"책1","책2","책3"};
		Scanner s = new Scanner(System.in);
		System.out.print("책 입력 : ");
		String search = s.next();
		for(String d : book) {
			if(d.equals(search)) {
				isFlag2 = true;
			}
		} if(!isFlag2) {
			System.out.println("입력한 도서는 해당 도서관에 없습니다.");
		}
		
		A a =new A();
		a.setX(10);     //전역변수 x 10으로 초기화
		System.out.println(a.getX());     //전역변수 x 출력
		
		A[]array = new A[3];    //객체 배열
	    array[0] = a;     //클래스A 가 통째로 0번째에 들어감
	    array[0].getX();     //0번째에 들어간 A클래스 get 함수 사용가능
	    
	    A b = new A();
	    b.setX(20);
	    array[1] = b;
	    
	    A c = new A();
	    c.setX(30);
	    array[2] = c;
	    
	    int sum = 0;
	    for(A i : array) {
	    	sum += i.getX();
	    } System.out.println(sum);

	}

}
