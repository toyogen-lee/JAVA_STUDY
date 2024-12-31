package java_study_1231;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 수업 {

	public static void main(String[] args) {
		
		/*
		 * ***제네릭과 컬렉션즈*** (배열하고 같은 개념)
		 * 배열기초 -> 객체배열 -> 제네릭과 컬렉션즈 (공부순서)
		 * 
		 * 제네릭과 컬렉션즈란?
		 * 배열처럼 데이터를 저장함.
		 * 빠른 접근 속도와 '동적 크기' 조절이 가능한 장점들이 있습니다.
		 */
		
		int []array = new int[6];     //배열은 저장 공간을 작성해야 했음.
		array[0] = 10;
		array[5] = 7;
//		array[6] = 5;//error - 사이즈가 넘어감.
		//배열 큰 단점 : 삭제 기능 없음
		
		//ArrayList 컬렉션
		ArrayList<Integer> list = new ArrayList<Integer>();  //ctrl+shift+o
		/*
		 * 제네릭(<>) 특징
		 * 1. 클래스 타입만 넣을 수 있음. int 형을 담고 싶으면 int 에 클래스 타입인 Integer 작성
		 */
		list.add(10);
		list.add(5);
		list.add(34);
		int num1 = list.get(0); //0번째 값 가져오기
		System.out.println("조회 : " + num1);
		
		//list 사이즈 조회
		System.out.println("사이즈 조회 : " + list.size());
		list.add(5);
		System.out.println("사이즈 조회 : " + list.size());      //사이즈가 동적으로 변경
		
		list.remove(0); //0번째에 저장된 값 삭제
		System.out.println("0번째 조회 : " + list.get(0)); //10 제거되고 5가 출력
		System.out.println("사이즈 조회 : " + list.size());
		
		list.set(0, 100); //0번째 요소 100으로 수정
		System.out.println("0번째 조회 : " + list.get(0));
		
		//전체 출력
		for(int i : list) System.out.print(i + "  ");
		
		//list 에 저장된 총합과 평균 구하기
		list.add(40);
		int sum = 0;
		int avg = 0;
		for(int i : list) {
			sum += i;
		} System.out.println("total : " + sum);
		System.out.println("average : " + sum / list.size());
		
		/*
		 * HashSet 컬렉션즈
		 * HashSet : 중복 제거가 필요하거나 집합 연산을 수행해야 할 때 유용하게 사용됨
		 * 1. 중복을 허용하지 않는 고유한 요소만 저장
		 */
		HashSet<Integer> set = new HashSet<Integer>(); //ctrl+shift+o
		set.add(10);
		set.add(20);
		set.add(10); //무시(중복)
		System.out.println(set.size());
		//HashSet 은 특정요소 조회 불가능(get 없음)
		set.contains(10);      //내부에 값이 존재하는지만 판단할 수 있음.
		set.remove(20); //HashSet 에 저장된 20 찾아서 삭제
//		-> 즉! HashSet 은 추가와 삭제만 가능
		
		/*
		 * HashMap 컬렉션즈
		 * 사전에서 단어(키)를 찾으면 그에 해당하는 뜻(값)이 나오는 것처럼,
		 * 키를 사용해 값을 저장하고 검색하는 자료구조 입니다.
		 */
		HashMap<String, Integer> map = new HashMap<String, Integer>(); //ctrl+shift+o
		/*
		 * String(Key), Integer(Value)
		 * 1. 데이터는 항상 키와 값의 쌍으로 저장됩니다.
		 * 2. 각 키는 중복될 수 없지만, 값은 중복될 수 있습니다.
		 * 3. 키를 사용해 값을 조회합니다.
		 * 4. HashMap 은 데이터의 순서를 보장하지 않습니다.
		 */
		map.put("apple", 500); 
		map.put("grape", 800);
		int price = map.get("grape"); //키를 이용해서 값을 조회
		System.out.println("포도 값은 " + price); 
		map.put("grape", 2000); //수정
		price = map.get("grape");
		System.out.println("포도 값은 " + price);
		map.remove("apple"); //키를 입력해서 삭제
		boolean hasBanana = map.containsKey("banana"); //데이터 존재 확인
		System.out.println("바나나 있어요? " + hasBanana);
		
		//전체 출력(keySet)
		for(String key : map.keySet()) {
			System.out.print(key + "  ");
			System.out.print(map.get(key) + "  ");
		}

	}

}
