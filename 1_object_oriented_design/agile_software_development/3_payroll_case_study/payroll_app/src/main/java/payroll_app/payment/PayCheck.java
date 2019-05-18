package payroll_app.payment;

import java.time.LocalDateTime;

public class PayCheck {

	private LocalDateTime date;
	private double grossPay;
	private double deductions;
	private double netpay;
	
	public PayCheck(LocalDateTime date) {
		this.date = date;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public void setNetPay(double netPay) {
		this.netpay = netPay;
	}

	public LocalDateTime getPayDate() {
		return date;
	}

	public double getNetPay() {
		return netpay;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getDeductions() {
		return deductions;
	}

	public String getField(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
