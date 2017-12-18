package javaTest2;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService myBankService = new BankService();
		int mySaving = myBankService.createNewAccount("saving", 
										new BigDecimal(500.000));
		int myInvestment = myBankService.createNewAccount("investment",
				new BigDecimal(100.000));
		myBankService.transferMoney(mySaving, myInvestment, 
				new BigDecimal(20.000));

	}

}
