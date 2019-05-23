package payroll_app.domain;

import java.time.LocalDateTime;

import payroll_app.implementation.PayCheck;

public class Employee {

	private int itsEmpid;
	private String itsName;
	private String itsAddress;
	private PaymentClassification itsPaymentClassification;
	private PaymentSchedule itsPaymentSchedule;
	private PaymentMethod itsPaymentMethod;
	private Affiliation affiliation;
	
	public Employee(int empid, String name, String address) {
		this.itsEmpid = empid;
		this.itsName = name;
		this.itsAddress = address;
	}

	public void setClassification(PaymentClassification pc) {
		this.itsPaymentClassification = pc;
	}

	public void setSchedule(PaymentSchedule ps) {
		this.itsPaymentSchedule  = ps;
		
	}

	public void setMethod(PaymentMethod pm) {
		this.itsPaymentMethod = pm;
	}

	public int getEmpid() {
		return itsEmpid;
	}

	public String getName() {
		return itsName;
	}

	public void setName(String itsName) {
		this.itsName = itsName;
	}

	public String getAddress() {
		return itsAddress;
	}

	public void setAddress(String itsAddress) {
		this.itsAddress = itsAddress;
	}

	public PaymentClassification getClassification() {
		return itsPaymentClassification;
	}

	public PaymentMethod getMethod() {
		return itsPaymentMethod;
	}
	
	public PaymentSchedule getSchedule() {
		return itsPaymentSchedule;
	}

	public Affiliation getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(Affiliation affiliation) {
		this.affiliation = affiliation;
	}

	public boolean isPayDate(LocalDateTime date) {
		return itsPaymentSchedule.isPayDate(date);
	}

	public void payDay(PayCheck payCheck) {
		double grossPay = itsPaymentClassification.calculatePay(payCheck);
		double deductions = affiliation.calculateDeductions(payCheck);
		double netPay = grossPay - deductions;
		payCheck.setGrossPay(grossPay);
		payCheck.setDeductions(deductions);
		payCheck.setNetPay(netPay);
		itsPaymentMethod.pay(payCheck);
	}
}
