package java_study_1206;

public class 정렬 {

	public static void main(String[] args) {
		/*
		 * 정렬 알고리즘 (별로 안씀)
		 * 버블, 선택, 삽입
		 * 
		 * 버블 정렬 : 인접한 두 원소를 비교하여 큰 값을 뒤로 보내는 과정을 반복
		 * 만들기 쉽고 직관적이지만 알고리즘적 관점에서 매우 비효율적인 방식이다.
		 */
		int[] a = {7,4,5,1,3};
		for(int i=0; i<a.length-1; i++) {
			System.out.println("i : " + i);
			for(int j=0; j<a.length-i-1; j++) {
				int x = a[j];     //비교
				int y = a[j+1];
				if(x > y) {
					int temp = x;
					a[j] = y;
					a[j+1] = temp;
				}
			}
		} System.out.println("finish");

	}

}
