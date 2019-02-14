package demo;

enum Currency{USD, EURO;
	public double conversionRateTo(Currency target) {return 1.0;}
}

public class BadMoneyImp {
	private double value;
	private Currency currency;
	
	public BadMoneyImp(double value, Currency currency) {
		this.value = value;
		this.currency = currency;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}

class Test {
	private static void dispenseFounds(BadMoneyImp amount) {/** */}
	public static void test() {
		/** error prone and hard to maintain code **/
		BadMoneyImp balance = new BadMoneyImp(1.0, Currency.EURO);
		BadMoneyImp request = new BadMoneyImp(1.0, Currency.USD);
		double normalizedBalance = balance.getValue() *
				balance.getCurrency()
						.conversionRateTo(Currency.USD);
		double normalizedRequest = request.getValue() *
				request.getCurrency()
						.conversionRateTo(Currency.USD);
		if (normalizedBalance > normalizedRequest) {
			dispenseFounds(request);
		}
	}
}

