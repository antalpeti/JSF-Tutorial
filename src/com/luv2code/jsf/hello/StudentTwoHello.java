package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwoHello {

  private String firstName;
  private String lastName;
  private String country;

  // list of countries for the drop-down list
  List<String> countryOptions;

  // no-arg constructor
  public StudentTwoHello() {
    // populate the list countries
    countryOptions = new ArrayList<>();

    countryOptions.add("Brazil");
    countryOptions.add("France");
    countryOptions.add("Germany");
    countryOptions.add("India");
    countryOptions.add("Turkey");
    countryOptions.add("United Kingdom");
    countryOptions.add("United States");

  }

  // need to add a getter method for country options
  public List<String> getCountryOptions() {
    return countryOptions;
  }

  // getter/setter methods
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

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
