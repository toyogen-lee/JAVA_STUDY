package java_study_0102;

import java.util.ArrayList;

public class 복습 {

	public static void main(String[] args) {
		/*
		 * ArrayList 는 자바에서 가장 많이 사용되는 자료구조 중 하나
		 * 일반 배열과 비슷하지만 크기가 유동적으로 변할 수 있는 '동적 배열'
		 * 
		 * 일반 배열은 크기가 고정된 장바구니
		 * ArrayList 는 필요에 따라 크기가 늘어나는 장바구니입니다.
		 * 
		 * ArrayList 큰 특징
		 * 1. 일반 배열과 다르게 사이즈를 선언할 필요가 없습니다.  ex) 일반 배열 : new int[];
		 * 2. 클래스 타입(레퍼런스 타입)만 추가할 수 있습니다. (int, double, boolean (x))
		 */
		//ArrayList 생성(String 타입의 항목을 저장)
		ArrayList<String> shoppingList = new ArrayList<String>();       // <> : 제네릭
		ArrayList<Integer> list = new ArrayList<>();    //int 대신. Integer : wrapper 클래스
		
		//항목 추가  .add("")
		shoppingList.add("milk");
		shoppingList.add("egg");
		shoppingList.add("bread");
		//장바구니에 있는 모든 항목을 출력
		System.out.println("장바구니 내용 : " + shoppingList);
		//장바구니에 있는 항목 하나씩 출력
		for(String s : shoppingList) System.out.println("장바구니 내용 : " + s);
		
		//특정 위치에 항목 추가  .add(  ,"")
		shoppingList.add(1, "cheese");
		//수정된 장바구니 내용 출력
		System.out.println("장바구니 내용 : " + shoppingList);
		
		//항목 개수 확인  .size()
		System.out.println("장바구니에 담긴 항목 수 : " + shoppingList.size());
		//특정 항목이 있는지 확인  .contains("")
		if(shoppingList.contains("bread")) {
			System.out.println("빵은 장바구니에 있습니다.");
		} else System.out.println("빵은 장바구니에 없습니다.");
		//특정 항목 제거  .remove("")
		shoppingList.remove("egg");
		//최종 장바구니 내용 출력
		System.out.println("최종 장바구니 : " + shoppingList);
	}

}
