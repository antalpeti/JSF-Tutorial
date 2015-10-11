package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentHello {

  private String firstName;
  private String lastName;

  // create no-arg constructor
  public StudentHello() {

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

}
