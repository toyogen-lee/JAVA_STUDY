package copyCoding1220;

import java.util.Scanner;

import java_study_1220.bank.BasicAccount;

public class 은행시스템 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		은행 bank = new 은행();
		while(true) {
			System.out.println("무엇을 도와?");
			System.out.println("1.계좌생성 2.입금 3.출금 4.잔액조회 5.종료");
			System.out.print("업무선택");
			int ch = s.nextInt();                   s.nextLine();
			switch(ch) {
			case 1:
				System.out.println("새 계좌번호 : ");
				String da = s.next();
				System.out.print("입금액 : ");
				double dam = s.nextDouble();
				//입금할 계좌가 없다면?
				BasicAccount account = bank.findAccount(da);
				if(account != null) {      //null : 값이 없다
					System.out.println();
				} else System.out.println("못찾아");
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
				System.out.print("종료");
				s.close();
				System.exit(0);
				break;
			default: System.out.println("안돼");
			}
		}
	}

}
