package com.CustomerRelationshipManagement.controller;

import com.CustomerRelationshipManagement.Entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    @PostMapping("/insert")
    public String insertCustomer(@RequestBody Customer customer) {

        String msg = customerService.insertCustomer(customer);

        return  msg;
    }

    @GetMapping
    public List<Customer> getCustomersList(){
        List<Customer> list = customerService.getCustomersList();
        return list;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {

        return  customerService.getCustomerById(id);
    }

    @PutMapping
    public  String customerUpdate(@RequestBody Customer customer) {

        return customerService.customerUpdate(customer);
    }

    @DeleteMapping("/{id}")
    public String customerDeleteById(@PathVariable int id) {

        return customerService.customerdeleteById(id);
    }

    @PostMapping
    public String insertMultipleCustomers (@RequestBody List <Customer> customers){

        return  customerService.insertMultipleCustomer(customers);
    }

    @GetMapping("/byname/{firstName}")
    public  List<Customer> getCustomerByFirstName(@PathVariable String firstName) {

        return customerService.getCustomerByFirstName(firstName);
    }

    @GetMapping("/bylessthanage/{age}")
    public  List<Customer> getCustomersByLessThanAge(@PathVariable int age) {

        return customerService.getCustomersLessByLessThanAge(age);

    }

    @GetMapping("/byage/{age}")
    public List<Customer>getCustomerByAge(@PathVariable int age) {

        return  customerService.getCustomersByAge(age);
    }

    @GetMapping("/bylastname/{name}")
    public List<Customer>getCustomerByLastName(@PathVariable String name) {

        return  customerService.getCustomerByLastName(name);
    }

    @GetMapping("/byemail/{email}")
    public List<Customer>getCustomerByEmail(@PathVariable String email) {

        return customerService.getCustomerByEmail(email);

    }

    @PutMapping ("/{id}")
    public String updateFirstName(@PathVariable int id, Map<String, String> request) {

        String firstName = request.get("firstName");

        return  customerService.updateFirstName(id, firstName);
    }

    @PutMapping("/lname/{id}")
    public String updateLastName(@PathVariable int id, Map<String, String> request) {

       String lastName = request.get("lastName");

       return  customerService.updateLastName(id,lastName);
    }
    @PutMapping("/email/{id}")
    public String updateEmailId(@PathVariable int id, @RequestBody Map<String, String> request) {
        String emailId= request.get("EmailId");

        return  customerService.updateEmail(id,emailId);
    }

    @PutMapping("/mobilenumber/{id}")
    public  String updateMobileNumber(@PathVariable int id,@RequestBody Map<String, String> request) {

        String mobileNumber = request.get("MobileNumber");

        return customerService.updateMobilNumber(id,mobileNumber);
    }

    @PutMapping("/age/{id}")
    public  String updateAge(@PathVariable int id,@RequestBody Map<String, Integer> request) {

        int age = request.get("Age");

        return customerService.updateAge(id,age);
    }

    @GetMapping("/firstNames")
    public List<String>getFirstNames(){

        return  customerService.getCustomerFirstname();
    }
}
