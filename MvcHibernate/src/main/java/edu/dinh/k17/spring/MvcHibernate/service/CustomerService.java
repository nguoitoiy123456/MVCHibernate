package edu.dinh.k17.spring.MvcHibernate.service;

import java.util.List;

import edu.dinh.k17.spring.MvcHibernate.entity.Customer;



public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
