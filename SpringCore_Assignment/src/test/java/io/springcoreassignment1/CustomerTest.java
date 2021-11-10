package io.springcoreassignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomerTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("displayCustomerInfo.xml");
		Customer customer2 = (Customer)context.getBean("customer");
		
		 
		Customer obj = new Customer(1, "Anil", "8779930443",new Address
				("MS Dhoni street", "Thane", "maharashtra", 400604, "India"));
		
		
		if (customer2.getCustomerName().equals(obj.getCustomerName())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
	}

}
