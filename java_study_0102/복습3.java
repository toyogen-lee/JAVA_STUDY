package java_study_0102;

import java.util.HashMap;

public class 복습3 {

	public static void main(String[] args) {
		/*
		 * HashMap 은 자바에서 가장 많이 사용되는 자료구조 중 하나
		 * key, value 의 쌍으로 데이터를 저장하는 '동적 배열' 이라고 생각하면 됩니다.
		 * 
		 * HashMap : 키(key)로 값을 검색하는 사전과 같습니다.
		 * HashMap 은 단어(key)로 그에 해당하는 뜻(value)을 찾을 수 있는 사전과 같다.
		 */
		HashMap<String, String> dictionary = new HashMap<>();
		
		//사전에 단어와 뜻 추가  .put(key, value);
		dictionary.put("성심당", "성심당은 대전광역시의 베이커리 전문점으로...");
		dictionary.put("엑스포", "1993년 세계 박람회...");
		dictionary.put("대전 오월드", "오월드는 중구 사정동에 위치한 종합 테마 공원...");
		//사전에 등록된 모든 단어와 뜻 출력
		System.out.println("사전 내용 : " + dictionary);
		//특정 단어의 뜻 찾기  .get(key)
		System.out.println("성심당 : " + dictionary.get("성심당"));
		//사전에 등록된 단어 개수 확인
		System.out.println("사전에 등록된 단어 수 : " + dictionary.size());
		//특정 단어가 있는지 확인  .containsKey(key)
		if(dictionary.containsKey("엑스포")) System.out.println("사전에 있는 단어입니다.");
		else System.out.println("사전에 없는 단어입니다.");
		//특정 단어 삭제
		dictionary.remove("대전 오월드");
		//최종 사전 내용 출력
		System.out.println("최종 사전 내용 : " + dictionary);

	}

}
