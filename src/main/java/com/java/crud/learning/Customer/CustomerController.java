package com.java.crud.learning.Customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService){
    this.customerService = customerService;
  }

  @GetMapping
  public List<Customer> getCustomers() {
    return this.customerService.getCustomers();
  }

}
