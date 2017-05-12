package com.mkyong.common.model;

import java.util.List;

public class Active
{
  private String phoneNumber;
  private int packageId;
  private boolean activate;
  private String DIDNumber;
  private List<Credit> credits;
  
  public String getPhoneNumber()
  {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }
  
  public int getPackageId()
  {
    return this.packageId;
  }
  
  public void setPackageId(int packageId)
  {
    this.packageId = packageId;
  }
  
  public boolean isActivate()
  {
    return this.activate;
  }
  
  public void setActivate(boolean activate)
  {
    this.activate = activate;
  }
  
  public String getDIDNumber()
  {
    return this.DIDNumber;
  }
  
  public void setDIDNumber(String dIDNumber)
  {
    this.DIDNumber = dIDNumber;
  }
  
  public List<Credit> getCredits()
  {
    return this.credits;
  }
  
  public void setCredits(List<Credit> credits)
  {
    this.credits = credits;
  }
}
