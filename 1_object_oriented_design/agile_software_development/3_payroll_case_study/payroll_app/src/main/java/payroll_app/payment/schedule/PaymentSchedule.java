package payroll_app.payment.schedule;

import java.time.LocalDateTime;

public interface PaymentSchedule {
	boolean isPayDate(LocalDateTime payDate);
}
