package payroll_app.implementation;

import java.util.HashMap;

import payroll_app.domain.PaymentClassification;

public class HourlyClassification implements PaymentClassification {

	private double hourlyRate;
	private HashMap<Long, TimeCard> timeCards = new HashMap<>();

	public HourlyClassification(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void addTimeCard(TimeCard timeCard) {
		timeCards.put(timeCard.getDate(), timeCard);
	}

	public TimeCard getTimeCard(long  date) {
		return timeCards.get(date);
	}

	@Override
	public double calculatePay(PayCheck payCheck) {
		// TODO Auto-generated method stub
		return 0;
	}
}
