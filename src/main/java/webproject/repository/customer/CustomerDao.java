package webproject.repository.customer;

import java.util.List;

import webproject.entity.customer.Customer;

public interface CustomerDao {
	List<Customer> list();
}
