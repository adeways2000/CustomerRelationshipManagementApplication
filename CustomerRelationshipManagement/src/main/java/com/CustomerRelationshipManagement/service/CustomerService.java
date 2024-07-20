package com.CustomerRelationshipManagement.service;

import com.CustomerRelationshipManagement.Entity.Customer;

import java.util.List;

public interface CustomerService {

    String insertCustomer(Customer customer);


    List<Customer> getCustomersList();

    Customer getCustomerById(int id);

    String customerUpdate(Customer customer);

    String customerdeleteById(int id);

    String insertMultipleCustomer (List <Customer> customers);

    List<Customer> getCustomerByFirstName(String firstName);

    List<Customer> getCustomersLessByLessThanAge(int age);

    List <Customer> getCustomersByAge(int age);

     List <Customer> getCustomerByLastName(String lastname);

     List <Customer> getCustomerByEmail(String email);
     String updateFirstName (int id, String firstName);
     String updateLastName(int id, String lastName);

     String updateEmail(int id, String emailId);
     String updateMobilNumber(int id,String mobileNumber);

     String updateAge(int id, int age);

     List<String>getCustomerFirstname();


}
