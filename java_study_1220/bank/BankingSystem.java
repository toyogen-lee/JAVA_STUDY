package java_study_1220.bank;

import java.util.Scanner;  //내장 클래스

//메인 클래스(Console 출력 확인)
public class BankingSystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(true) {    //은행 업무 선택
			System.out.println("안녕하세요. 길동은행입니다. 무엇을 도와드릴까요?");
			System.out.println("[1] 계좌 생성   [2] 입금   [3] 출금   [4] 잔액 조회   [5] 종료");
			
			System.out.print("업무 선택 : ");
			int choice = s.nextInt();    //스캐너로 업무 입력받기
			s.nextLine();   //버퍼 지우기
			
			switch(choice) {
			case 1:
				System.out.print("새 계좌번호 : ");
				String newAccountNumber = s.next();
				bank.createAccount(newAccountNumber);
				break;
			case 2:
				System.out.print("입금 계좌번호 입력 : ");
				String depositAccount = s.next();
				System.out.print("입금액 : ");
				double depositAmount = s.nextDouble();
				//입금할 계좌가 없다면?
				BasicAccount account = bank.findAccount(depositAccount);
				if(account != null) {      //null : 값이 없다
					account.deposit(depositAmount);
				} else System.out.println("계좌를 찾을 수 없습니다.");
				break;
			case 3:
				System.out.print("출금 계좌번호 입력 : ");
				String withdrawAccount = s.next();
				System.out.print("출금액 : ");
				double withdrawAmount = s.nextDouble();
				BasicAccount wAccount = bank.findAccount(withdrawAccount);
				if(wAccount != null) {
					wAccount.withdraw(withdrawAmount);
				} else System.out.println("계좌를 찾을 수 없습니다.");
				break;
			case 4:     //잔액 조회
				System.out.print("계좌번호 입력 : ");
				String balanceAccount = s.next();
				BasicAccount bAccount = bank.findAccount(balanceAccount);
				if(bAccount != null) System.out.println("현재 잔액 : " + bAccount.getBalance());
				else System.out.println("계좌를 찾을 수 없습니다.");
				break;
			case 5:
				System.out.print("프로그램을 종료합니다.");
				s.close();   //스캐너 종료
				System.exit(0);   //시스템 강제종료
				break;
				default:   //1~5번 말고 다른 번호를 입력한다면?
					System.out.println("잘못된 선택입니다.");
			}
			}
	}

}
