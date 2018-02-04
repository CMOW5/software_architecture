package javaTest2;

import java.util.Hashtable;

//Facade
public class BankService {
	private Hashtable<Integer, IAccount> bankAccounts;
	
	public BankService() {
		this.bankAccounts = new Hashtable<Integer,IAccount>();
	}
	
	public int createNewAccount(String type, BigDecimal initAmount ) {
		IAccount newAccount = null;
		switch (type) {
		case "checking":
			newAccount = new Chequing(initAmount);
			break;
		case "saving":
			newAccount = new Saving(initAmount);
			break;
		case "investment" :
			newAccount = new Investment(initAmount);
			break;
		default:
			//invalid account type
			break;
		}
		
		if(newAccount != null){
			this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
			return newAccount.getAccountNumber();
		}
		return -1;
	}
	
	public void transferMoney(int to, int from, BigDecimal amount){
		IAccount toAccount = this.bankAccounts.get(to);
		IAccount fromAccount = this.bankAccounts.get(from);
		fromAccount.transfer(toAccount,amount);
	}

}
