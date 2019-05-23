package payroll_app.implementation;

import java.util.HashMap;
import java.util.Map;

import payroll_app.domain.Affiliation;

public class UnionAffiliation implements Affiliation {

	private double dues;
	private Map<Long, ServiceCharge> serviceCharges = new HashMap<>();
	
	public UnionAffiliation(double dues) {
		this.dues = dues;
	}

	public void addServiceCharge(long date, double amount) {
		serviceCharges.put(date, new ServiceCharge(date, amount));
	}

	public ServiceCharge getServiceCharge(long date) {
		return serviceCharges.get(date);
	}

	@Override
	public double calculateDeductions(PayCheck payCheck) {
		// TODO Auto-generated method stub
		return 0;
	}
}
