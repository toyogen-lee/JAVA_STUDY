package java_study_1212;
class bungi{    //클래스는 '틀'
	int bunga;
	String bunzong;
	//기본생성자가 설정되어 있습니다.
	bungi(int bunga, String bunzong){
		//question) 필드변수 값을 초기화할 수 있게 이어서 코딩.
		this.bunga = bunga;
		this.bunzong = bunzong;
	}
	//메소드, 리턴타입이 'String', method name : add
public String add(String source1, String source2) {
	String last = source1 + source2;
	return last;
}
}

public class 붕어빵 {

	public static void main(String[] args) {
		bungi b = new bungi(1000, "팥");
		System.out.println("붕어빵 가격 : "+b.bunga);
		System.out.println("붕어빵 종류 : "+b.bunzong);
		String last = b.add("치즈", "파인애플");
		b.bunzong = b.bunzong + last + "붕어빵";
		b.bunga = 3000;
		System.out.println(b.bunzong);
		System.out.println(b.bunga);
		
		//철수네붕어빵 기본 : 슈크림, 가격 : 700원
		//철수네도 붕어빵 내용을 추가합니다. 스위트콘, 치즈
		//가격도 1400원으로 올립니다.
		//최종 붕어빵 가격과 타입을 출력하세요.
		bungi ch = new bungi(700, "슈크림");
		String last2 = ch.add("스위트콘", "치즈");
		ch.bunzong += last2 + "붕어빵";
		ch.bunga = 1400;
		System.out.println(ch.bunzong+", "+ch.bunga+"원");

	}

}
