package app.services;

import java.time.LocalDate;

import app.interfaces.OnlineInterfacePayment;
import app.model.Contract;
import app.model.Installment;

public class ContractService {

	private OnlineInterfacePayment onlineInterfacePayment;

	public ContractService(OnlineInterfacePayment onlineInterfacePayment) {
		
		this.onlineInterfacePayment = onlineInterfacePayment;
	}
	
	public void processContract(Contract contract, int mounths) {
		
		double basicQuota = contract.getTotalValue() / mounths;
		
		for(int i= 1 ; i <= mounths ; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlineInterfacePayment.interest(basicQuota, i);
			double fee = onlineInterfacePayment.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getList().add(new Installment(dueDate,quota));
			
		}
	}
	
	
}
