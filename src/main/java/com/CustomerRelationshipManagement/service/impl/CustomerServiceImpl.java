package com.CustomerRelationshipManagement.service.impl;

import com.CustomerRelationshipManagement.Entity.Customer;
import com.CustomerRelationshipManagement.dao.CustomerDao;
import com.CustomerRelationshipManagement.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public String insertCustomer(Customer customer) {

       String msg = customerDao.insertCustomer(customer);

        return msg;
    }

    @Override
    public List<Customer> getCustomersList() {
        List<Customer> list = customerDao.getCustomersList();
        return list;

    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer = customerDao.getcustomerById(id);

        return customer;
    }

    public String customerUpdate (Customer customer) {

        return customerDao.updateCustomer(customer);

    }

    @Override
    public String customerdeleteById(int id) {
        return customerDao.deleteCustomerById(id);
    }

    @Override
    public String insertMultipleCustomer(List<Customer> customers) {
        return customerDao.insertMultipleCustomers(customers);
    }

    public List<Customer> getCustomerByFirstName(String firstName) {

        return customerDao.getCustomersByFirstName(firstName);

    }

    @Override
    public List<Customer> getCustomersLessByLessThanAge(int age) {
        return customerDao.getCustomersByLessThanAge(age);
    }

    @Override
    public List<Customer> getCustomersByAge(int age) {
        return customerDao.getCustomersByAge(age);
    }

    @Override
    public List<Customer> getCustomerByLastName(String lastname) {
        return customerDao.getCustomersByLastName(lastname);
    }

    @Override
    public List<Customer> getCustomerByEmail(String email) {
        return customerDao.getCustomersByEmail(email);
    }

    @Override
    public String updateFirstName(int id, String firstName) {
        return customerDao.updateFirstName(id, firstName);
    }

    @Override
    public String updateLastName(int id, String lastName) {
        return customerDao.updateLastName(id,lastName);
    }

    @Override
    public String updateEmail(int id, String emailId) {
        return customerDao.updateEmailId(id,emailId);
    }

    @Override
    public String updateMobilNumber(int id, String mobileNumber) {
        return  customerDao.updateEmailId(id,mobileNumber);
    }

    @Override
    public String updateAge(int id, int age) {
        return customerDao.updateAge(id,age);
    }

    @Override
    public List<String> getCustomerFirstname() {
        return customerDao.getCustomersFirstNames();
    }



}
