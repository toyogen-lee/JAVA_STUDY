package java_study_1203;

public class 문제풀이1203 {

	public static void main(String[] args) {
		//2. concat    3. split
		//4.
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
		
		//5.
		String x = "goguma";
		String y = "goguma";
		if (x == y) System.out.println("same");
		//위 코드는 문자를 비교하는게 아닌, 메모리에 저장된 주소를 비교하는 것
		
		if (x.equals(y)) System.out.println("same");   //문자비교
		
		//6.
		String h = "안녕하세요";
		System.out.print(h.substring(0,1));
		System.out.println(h.substring(h.length()-1, h.length()));
		
		//7.substring
		
		//8.
		int count = 0;
		String word = "aabbacccaaaaa";
		String[] array = word.split("");
		for(int i=0; i<array.length; i++) {    //일반 for문
			if(array[i].equals("a")) {
				++count;
			}
		} System.out.println(count);
		
		for(String i : array) {     //배열의 길이만큼 자동으로 반복 (for-each문)
			//i에 자동으로 배열값이 대입됨.
			System.out.print("배열 값 : " + i + "   ");
		} System.out.println();
		
		//10.
		String[] strArr = {"and", "notad", "abcd"};
		for(String i : strArr) {
			if(!i.contains("ad")) {    //ad가 포함되어 있다면? -> ! -> ad 없다면?
				System.out.println(i);
			}
			if(i.contains("ad") == true) {}   //잘못된 코드
				//contains가 true or false인데 ,한번 더 true를 비교할 필요는 없다.
		}
		//11.
		String my_string = "nice to meet you";
		String[] vow = {"a","e","i","o","u"};
		for(String i : vow) {
			my_string=my_string.replaceAll(i, "");
		} System.out.println(my_string);
		
		//12.
		String numbers = "onefourzerosixseven";
		String[] matchNumbers = {"zero","one","two","three","four","five",
				"six","seven","eight","nine"};
		
		for (int i=0; i<matchNumbers.length; i++) {
			String n = matchNumbers[i];
			numbers =numbers.replaceAll(n, Integer.toString(i));
		} System.out.println(numbers);
	}

}
