package com.luv2code.jsf.validatedemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentThreeValidationDemo {

  private String firstName;
  private String lastName;
  private String phoneNumber;

  // create no-arg constructor
  public StudentThreeValidationDemo() {

  }

  // define getter/setter methods
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
