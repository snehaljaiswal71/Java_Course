package com.example.demo;

public class Engine {

  private String companyName;

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void engineToyota() {
    System.out.println("Car engine " + companyName);
  }

}
