package com.mkyong.common.model;

import java.util.List;

public class Packages
{
  private int packageId;
  private List<Credit> credits;
  
  public int getPackageId()
  {
    return this.packageId;
  }
  
  public void setPackageId(int packageId)
  {
    this.packageId = packageId;
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
