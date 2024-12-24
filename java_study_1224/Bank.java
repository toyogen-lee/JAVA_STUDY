package java_study_1224;

public class Bank {     //계좌를 생성하고 관리하는 클래스
	//세번째 순서 - 'Bank' 클래스 만들기
	
	private BasicAccount[] accounts;    //여러개의 계좌를 저장하는 배열
	private int accountCount;    //계좌 개설 개수
	
	public Bank() {
		accounts = new BasicAccount[10];
		accountCount = 0;
	}
	
	public void createAccount(String accountNumber) {
		if(accountCount < accounts.length) {
			accounts[accountCount] = new BasicAccount(accountNumber);
			accountCount++;
			System.out.println("계좌 생성 완료");
			System.out.println("남은 횟수 : " + accountCount);
		} else System.out.println("더 이상 계좌를 생성할 수 없습니다.");
	}
	//계좌조회
	public BasicAccount findAccount(String accountNumber) {
		for(int i=0; i<accountCount; i++) {
			if(accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}

}
