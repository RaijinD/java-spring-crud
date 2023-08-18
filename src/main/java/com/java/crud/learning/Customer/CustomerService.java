package com.java.crud.learning.Customer;

import java.util.List;

public class CustomerService {

  public List<Customer> getCustomers(){
        return List.of(
        new Customer(0, "Raijin", "Rua Tralalala", "123456578"),
        new Customer(1, "Fuujin", "Rua Blablablabla", "123456578"));
  }

}
