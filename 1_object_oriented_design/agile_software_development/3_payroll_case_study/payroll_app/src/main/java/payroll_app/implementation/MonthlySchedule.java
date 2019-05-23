package payroll_app.implementation;

import java.time.LocalDateTime;

import payroll_app.domain.PaymentSchedule;

public class MonthlySchedule implements PaymentSchedule {
	
	public boolean isPayDate(LocalDateTime payDate) {
		return IsLastDayOfMonth(payDate);
	}
	
	private boolean IsLastDayOfMonth(LocalDateTime date)
	{
		int m1 = date.getMonthValue();
		int m2 = (date.plusDays(1)).getMonthValue();
		return (m1 != m2);
	}
}
