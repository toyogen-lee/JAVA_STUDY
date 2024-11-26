package java_study_1126;

import java.util.Random;

public class 배열2_1126 {

	public static void main(String[] args) {
		
		//자바에서 배열을 만드는 방법은 총 2가지
		//1. 값이 처음부터 들어있음.
	    int [] array = {2,3};
	    //2. 길이만 생성 / 값 x
	    int [] array2 = new int [2];
	    System.out.println("배열 길이 : " + array2.length);
	    
	    //값 넣기
	    array2[0] = 10;
	    array2[1] = 20;
//	    array2[2] = 20;      //배열 길이는 2인데 3번째에 20을 넣으려고 하니 에러.
//	    System.out.println(array[2]);
	    System.out.println(array2[1]);
	    
	    
	    
	    
	    //배열에 랜덤한 값 넣기
	    int []numbers = new int[10];
	    //1~100 중 랜덤한 값을 배열에 차례로 넣을 예정
	    Random random = new Random();     //랜덤클래스 ctrl + shift + o
	    numbers[0] = random.nextInt(100) + 1;
	    System.out.println("0번째 : " + numbers[0]);
	    
	    //0~9번째 인덱스에 랜덤 값 넣어보자.
	    for (int i = 0; i < numbers.length; i++) {
	    	numbers[i] = random.nextInt(100) + 1;
	    	System.out.print(i + "번째 : " + numbers[i] + "  ");
	    }

	}

}
