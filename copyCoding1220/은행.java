package copyCoding1220;

import java_study_1220.bank.BasicAccount;

public class 은행 {
	private BasicAccount[] accounts;
	private int accountCount;
	
	public 은행() {    
		accounts = new BasicAccount[10];    
		accountCount = 0;
	}
	
	public void createAccount(String accountNumber) {   
		if(accountCount < accounts.length) {
			accounts[accountCount] = new BasicAccount(accountNumber);   
			++accountCount;
			System.out.println("계좌 생성 완료 : " + accountNumber);
		} else System.out.println("더 이상 계좌를 생성할 수 없습니다.");
	}
	public BasicAccount findAccount(String accountNumber) {  
		
		for(int i=0; i<accountCount; i++) {
			
			if(accounts[i].getAccountNumber().equals(accountNumber)) {
				
				return accounts[i];
			}
		}
		return null;
	}

}
