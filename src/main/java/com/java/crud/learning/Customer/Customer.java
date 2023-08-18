package com.java.crud.learning.Customer;

public class Customer {

  private long id;

  private String name;

  private String address;

  private String phone;

  // Empty constructor for setting up later with the setters
  public Customer() {
  }

  // constructor without id, database create it later
  public Customer(String name, String address, String phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
  }

  // Constructor with id
  /**
   * @param id
   * @param name
   * @param address
   * @param phone
   */
  public Customer(long id, String name, String address, String phone) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.phone = phone;
  }

  // GETTERS and SETTERS because this language it's too powerful and i need to
  // write it one by one :D

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  // toString method for debuging purpose i think...
  @Override
  public String toString() {
    return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
  }
}
