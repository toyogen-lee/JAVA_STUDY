package java_study_1128;

public class 수업1128 {

	public static void main(String[] args) {
		//***length : 문자열 길이
		String text = "ediya";
		System.out.println("length : " + text.length());
		
		String userId = "lph";
		if (userId.length()>=10) {
			System.out.println("아이디는 10글자 미만으로 작성해주세요. ");
		} else System.out.println("사용 가능한 아이디입니다. ");
		
		//concat : 두 문자열을 합친다. (빈도수 5%)
		String a = "apple";
		String b = "watch";
		System.out.println(a.concat(b));
		
		//*substring : 부분 문자열 추출 (빈도수 80~90%)
		String text1 = "Hello, World";
		System.out.println(text1.substring(0,5));
		//퀴즈 : Wor 만 서브스트링으로 출력
		System.out.println(text1.substring(7,10));
		
		//*indexOf : 문자열 검색
		System.out.println(text1.indexOf("l"));
		System.out.println(text1.indexOf("W"));
		
		//***replace : 문자열 대체
		String word = "순대국밥";
		System.out.println(word.replace("순대", "돼지"));      //순대를 돼지로 대체
		
		//*toUpper, toLower : 소 -> 대  |  대 -> 소
		String code = "abcd00";
		System.out.println(code.toUpperCase());
		
		//**trim : 공백 제거
		String word2 = "     안녕     ";
		System.out.println(word2.trim());
		
		//***split : 문자 분할 (실무에서 데이터분석 혹은 코딩테스트 단골 손님!)
		String word3 = "한화이글스,두산베어스,롯데자이언츠";
		String[] result = word3.split(",");
		System.out.println(result[0]);
		System.out.println(result[2]);
		
		//**contains : 특정 문자열이 포함되어 있는지 여부확인
		String word4 = "hyunsangwon93@gmail.com";
		System.out.println(word4.contains("@"));
		System.out.println(word4.contains("e"));
		
		//***equals : 문자열 비교 (*자바의 특징)
		String food = "등심돈까스";
		String food2 = "등심돈까스";
		String food3 = "치즈돈까스";
		// ==, 자바에서는 문자열 비교는 equals
		System.out.println(food.equals(food2));
		System.out.println(food.equals(food3));

	}

}
