package java_study_1114;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
//		문제 1
		int age2 = 25;
				System.out.println(age2);
				
				//문제 2. 3
//				문제3
				System.out.println("Hello, Java");
//				문제4
				Scanner scan = new Scanner(System.in);
				System.out.print("a : ");
				int a = scan.nextInt();
				System.out.print("b : ");
				int b = scan.nextInt();				
				int sum = a + b;
				System.out.println("a + b : " + sum);
//				문제5
				double height = 180.5;
//				문제6
				System.out.print(" 이름 : ");
				String name = scan.next();
				System.out.print("나이 : ");
				int age = scan.nextInt();
				System.out.println("안녕하세요, " + name + " 님! 당신은 " + age + " 살 입니다. ");
//				문제7 
				int t1 = 500;
				double t2 = 500.55;
				char t3 = 'q';
				boolean t4 = true;
//				문제8
				System.out.print("첫번째 정수를 입력하세요 : ");
				int a2 = scan.nextInt();
				System.out.print("두번째 정수를 입력하세요 : ");
				int b2 = scan.nextInt();
				int sum2 = a2 + b2;
				System.out.println("합 : " + sum2);
//				문제9
				String xx ="10";
				int yy = Integer.parseInt(xx);
//             문제 10. 3
//				문제11
				System.out.print("숫자를 입력하세요 : ");
				int x = scan.nextInt();
				System.out.print("숫자를 입력하세요 : ");
				int y = scan.nextInt();
				System.out.print("숫자를 입력하세요 : ");
				int z = scan.nextInt();
				int arg = (x + y + z) / 3;
				System.out.println("입력받은 숫자의 평균은 " + arg + "입니다. ");
//				문제12
				System.out.print("숫자를 입력하세요 : ");
				int pro = scan.nextInt();
				int per = pro / 10;
				System.out.println("해당 숫자의 10%는 : " + per + "입니다. ");
	}

}
