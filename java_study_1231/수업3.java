package java_study_1231;

import java.util.HashMap;
import java.util.Scanner;

class PhoneBook{
	HashMap<String, String> phoneBook = new HashMap<String, String>();
	
	//전화번호 추가
	public void addContact(String name, String phoneNumber) {
		phoneBook.put(name, phoneNumber); //key, value
		System.out.println("연락처가 추가되었습니다.");
	}
	//전화번호 검색
	public void searchContact(String name) {
		String phoneNumber = phoneBook.get(name);
		if(phoneNumber != null) {
			System.out.println(name + " 의 전화번호 : " + phoneNumber);
		} else {
			System.out.println("해당 이름의 연락처를 찾을 수 없습니다.");
		}
	}
}

public class 수업3 {

	public static void main(String[] args) {
		//HashMap 을 활용한 전화번호부
		PhoneBook phoneBook = new PhoneBook();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("[연락처 프로그램]");
			System.out.println("[1]연락처 추가  [2]연락처 검색  [3]종료");
			int choice = s.nextInt();
			s.nextLine();
			if(choice == 1) {
				System.out.print("이름 입력 : ");
				String name  = s.nextLine();
				System.out.print("연락처 입력 : ");
				String number = s.nextLine();
				phoneBook.addContact(name, number);
			} else if(choice == 2) {
				System.out.print("이름 입력 : ");
				String name = s.nextLine();
				phoneBook.searchContact(name);
			} else if(choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else System.out.println("잘못된 번호입니다.");
		}

	}

}
