package payroll_app.payment.schedule;

import java.time.LocalDateTime;

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
