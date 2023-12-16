package com.example.blackbuck.Customer;

import com.example.blackbuck.Customer.models.Customer;
import com.example.blackbuck.Customer.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void testCreateCustomer(){
		Customer customer=new Customer();
		customer.setName("Kyubi");
		customer.setEmail("kyubithakur@gmail.com");
		customerRepository.save(customer);

//		Customer customer=new Customer();
//		customer.setName("Sam");
//		customer.setEmail("samthakur@gmail.com");
//		customerRepository.save(customer);
	}

	@Test
	void testGetCustomerById(){
		Customer customer= customerRepository.findById(1).get();
		System.out.println(customer.getName());
		System.out.println(customer.getEmail());
	}

	@Test
	void testUpdateNameEmail(){
		Customer customer= customerRepository.findById(2).get();
		customer.setName("KyubiThakur");
		customerRepository.save(customer);
	}

	@Test
	void testDeleteCustomer(){
		customerRepository.deleteById(1);
	}

}
