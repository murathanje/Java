package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal _customerDal) {
		this.customerDal = _customerDal;
	}
	public void add() {
		
		customerDal.add();
	}

}
