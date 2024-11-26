package java_study_1126;

import java.util.Random;

public class 문제1126 {

	public static void main(String[] args) {
		
		//문제1
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int k = a[2] * a[5];
		System.out.println(k);
		
		//문제2
		int b = 0;
		for(int i = 0; i < a.length; i++) {
			b += a[i];
		} System.out.println(b);
		
		//문제3
		Random r = new Random();
		int []c = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = r.nextInt(100) + 1;
			if (c[i] % 2 == 0) {
				System.out.print(i + "번째는 짝수 " + c[i] + "   ");
			}
		} System.out.println();
		
		//문제4 실패
		int num = 0;
		int []d = new int [10];
		for (int i = 0; i < d.length; i++) {
			d[i] = r.nextInt(100) + 1;
		}

	}

}
