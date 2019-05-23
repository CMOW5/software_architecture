package payroll_app.domain;

import java.time.LocalDateTime;

public interface PaymentSchedule {
	boolean isPayDate(LocalDateTime payDate);
}
