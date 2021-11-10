package io.springcoreassignment1;



public class Customer
{
	 int customerId;
	 String customerName;
	 String customerContact;
     Address customerAddress;
	 
	 public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerContact = customerContact;
			this.customerAddress = customerAddress;
			System.out.println("This is of customer constructor");
		}

		/*
		 * @Override public String toString() { return "Customer [customerId=" +
		 * customerId + ", customerName=" + customerName + ", customerContact=" +
		 * customerContact + ", customerAddress=" + customerAddress + "]"; }
		 */
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		//System.out.println("Setting customer id");
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		//System.out.println("Setting customer name");
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		//System.out.println("Setting customer contact");
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		//System.out.println("Setting customer address");
		this.customerAddress = customerAddress;
	}

	//default constructor
	public Customer() {
		super();
		
	}
	
	void displayInfo() {
		System.out.println("customer id is :" +getCustomerId());
		System.out.println("customer name is :" +getCustomerName());
		System.out.println("customer contact is :" +getCustomerContact());
		
	}
	
	
	


	}

