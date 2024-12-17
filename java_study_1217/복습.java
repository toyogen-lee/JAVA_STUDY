package java_study_1217;
//객체지향 개념
class 자동차 {        //클래스는 필드변수, 메소드, 생성자(리턴타입이 없는 메소드)로 구성됨.
	/*
	 * 필드변수
	 * 1. default 초기값이 존재 (String - null, int - 0)
	 * 2. 모든 메소드에서 필드변수를 사용할 수 있음.
	 * 3. 필드변수 -> 실무에서는 "속성(attribute)"
	 */
	String 브랜드명;
	String 자동차타입;
	public 자동차() {     //기본(default) 생성자
		/*
		 * 기본생성자 특징
		 * 1. 메소드 이름 = 클래스 이름
		 * 2. 리턴타입 없음
		 * 3. 필드변수 값을 초기화하기 위해 사용
		 */
	}
	/*
	 * public : 접근 지정자(*public, *private, protected, default)
	 * int : 리턴 데이터 타입
	 * getNumber : 메소드 이름(동사)
	 * (int x, int y) : 파라미터 or 인자 or 인수
	 */
	public int getNumber(int x, int y) {
		int result = x + y;
		return  result;
	}
	public int getMoney(int price) {
	    if (price >= 500000) price *= 0.8;
	    else if (price >= 300000) price *= 0.9;
	    else if (price >= 100000) price *= 0.95;
		return price;
	}
	/*
	 * 정수를 담고 있는 배열 arr 가 파라미터로 주어졌을 때
	 * arr 의 평균값을 return 하는 함수 getAvg 를 완성해보세요.
	 * 메소드 만들어보기, 로직 구현
	 */
	public double getAvg(int []arr) {
		double avg = 0;
		double sum = 0;
		for (int i : arr) sum += i;
		avg = sum / arr.length;
		return avg;
	}
	/*
	 * 정수를 담고 있는 배열 arr 가 파라미터로 주어졌을 때
	 * 배열 값 중 원소가 짝수면  해당 원소를 2로 나누고 다시 해당 원소에 대입
	 * 최종 배열 arr 를 return하는 함수 getArr 를 완성해보세요.
	 */
	public int []getArr(int []arr) {     //배열도 리턴할 수 있음.
		for (int i : arr) {
			if (i % 2 == 0) i /= 2;
		}
		return arr;
	}
	//총합 리턴하는 getArrSum 을 만들어보세요.
	public int getArrSum(int []arr) {
		int sum = 0;
		for (int i : arr) sum += i;
		return sum;
	}
}

public class 복습 {

	public static void main(String[] args) {
		자동차 car1 = new 자동차();
	    int 리턴값 = car1.getNumber(10, 20);
	    System.out.println(리턴값);
	    int last = car1.getMoney(340000);
	    System.out.println(last);
	    
	    int [] array = {80,90,100,100};
	    double avg = car1.getAvg(array);
	    System.out.println(avg);
	    
	    int []array2 = {60,70,80};
	    int []getArr = car1.getArr(array2);
	    for (int i : getArr) System.out.println(i);
	    
	    int []a3 = {40,50,70};
	    int sum = car1.getArrSum(a3);
	    System.out.println(sum);
	}

}
