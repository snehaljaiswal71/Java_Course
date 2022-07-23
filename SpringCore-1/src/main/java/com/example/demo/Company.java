package com.example.demo;


public class Company implements Registration {

  private String companyName;

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void register() {
    // TODO Auto-generated method stub
    System.out.println("Company Registration ." + companyName);
  }

  // main // create object of class company

}
