package java_study_1206;

public class 정렬문제 {

	public static void main(String[] args) {
		// 오름차순 정렬하시오.
		int[] a = { 10, 4, 3, 29, 31 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int x = a[j];
				int y = a[j + 1];
				if (x < y) {
					int temp = x;
					a[j] = y;
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(a[0] + "  " + a[1] + " ... " + a[a.length - 1]);

	}

}
