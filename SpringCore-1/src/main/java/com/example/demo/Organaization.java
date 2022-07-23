package com.example.demo;

public class Organaization implements Registration {

  private String organaizationName;
  
  
  
  
  public Organaization(String organaizationName) {
    this.organaizationName = organaizationName;
  }




  public void register() {
    // TODO Auto-generated method stub
    System.out.println("Organaization Registration" + organaizationName);
  }

}
