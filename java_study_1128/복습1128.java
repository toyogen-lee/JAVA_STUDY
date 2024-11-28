package java_study_1128;

public class 복습1128 {

	public static void main(String[] args) {
		
		//1차원 배열
		int []array = {1,2,3};     //배열 선언과 동시에 값 초기화
		
		//2차원 배열
		int [][]a2 = { {1,2,3}, {1,2,3}, {1,2,3} };
		//출력
		for(int i = 0; i < a2.length; i++) {
			for (int j=0; j<a2[i].length; j++) {
				System.out.println("2차원 배열 출력 : " + a2[i][j]);
			}
		}
		
		//배열 형변환
		int []a3 = new int[3];
		String[]a4 = new String[4];
		
		a3[0]=3;
		a4[0]="apple";
		//array4 0번째 인덱스에 3 넣기
//		a4[1]=3;    //array4는 문자열 배열이기 때문에 숫자 대입 불가능
		a4[1]=Integer.toString(a3[0]);
		//***Integer.toString : 숫자에서 to 문자 형변환
		//Integer.parseInt() : 문자에서 숫자로 형변환

	}

}
