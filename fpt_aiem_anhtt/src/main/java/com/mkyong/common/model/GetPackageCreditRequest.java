package com.mkyong.common.model;

public class GetPackageCreditRequest
{
  private String phoneNumber;
  private String didNumber;
  
  public String getPhoneNumber()
  {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }
  
  public String getDidNumber()
  {
    return this.didNumber;
  }
  
  public void setDidNumber(String didNumber)
  {
    this.didNumber = didNumber;
  }
}
