package io.springcoreassignment1;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test {
  public static void main(String args[])
  {
	  
	 ApplicationContext context= new ClassPathXmlApplicationContext("displayCustomerInfo.xml");
	 Address address=(Address) context.getBean("address");
	 Customer customer=(Customer) context.getBean("customer");
	 customer.displayInfo();
	 address.displayAddress();
	 //System.out.println(address);
	 //System.out.println(customer);
	  
  }
  
}
