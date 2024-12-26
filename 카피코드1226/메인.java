package 카피코드1226;

import java.util.Scanner;

public class 메인 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		도서서비스 도 = new 임플(10);
		while(true) {
			System.out.print("1 2 3 중 하나");
			int cho = s.nextInt();
			s.nextLine();
			if(cho == 1) {
				String 제 = s.nextLine();
				String 저 = s.nextLine();
				String 번 = s.nextLine();
				도.애드(new 북(제, 저, 번));
			} else if(cho == 2) {
				System.out.print("검색어");
				String 키워드 = s.next();
				도.서치(키워드);
			} else if(cho == 3) {
				System.out.println("종료");
				s.close();
				System.exit(0);
			} else System.out.println("다시");
		}

	}

}
