package javaTest2;

public interface IAccount {
	public void deposit(BigDecimal amount);
	public void withdraw(BigDecimal amount);
	public void transfer(BigDecimal amount);
	public int getAccountNumber();
}

/*
	public class Chequing implements IAccount {...}
	public class Saving implements IAccount {...}
	public class Investment implements IAccount {...}
*/