package java_study;

import java.util.Scanner;

public class 자바복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "이풍현";
int age = 22;
String address = "대전 유성구 원내동";
String hobby = "헬스";
String mbti = "ISTJ";
//name ~ mbti : 변수명
//대문자는 안됨(개발자들 약속)
System.out.println("이름 : " + name);
System.out.println("나이 : " + age);
System.out.println("주소 : " + address);
System.out.println("취미 : " + hobby);
System.out.println("MBTI : " + mbti);

//입력받기
Scanner scan = new Scanner(System.in);
//ctrl + shift + o

System.out.print("이름을 입력해주세요 => ");
String n = scan.next();
System.out.println("입력하신 이름은 : " + n + " 입니다. ");

System.out.print("MBTI를 입력해주세요 => ");
String m = scan.next();
System.out.println("MBTI는 " + m + " 입니다. ");

System.out.print("나이를 입력해주세요 => ");
int a = scan.nextInt();
System.out.println("나이는 " + a + " 입니다. ");

//연습
System.out.print("취미는 무엇입니까? ");
String h = scan.next();
System.out.println("취미는 " + h + " 입니다. ");

System.out.print("이풍현 씨의 키는? ");
int l = scan.nextInt();
System.out.println("키는 " + l + " 입니다. ");


	}

}
