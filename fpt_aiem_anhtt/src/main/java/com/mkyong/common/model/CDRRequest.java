package com.mkyong.common.model;

import java.util.Date;

public class CDRRequest
{
  private String phoneNumber;
  private String didNumber;
  private Date startTime;
  private Date stopTime;
  
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
  
  public Date getStartTime()
  {
    return this.startTime;
  }
  
  public void setStartTime(Date startTime)
  {
    this.startTime = startTime;
  }
  
  public Date getStopTime()
  {
    return this.stopTime;
  }
  
  public void setStopTime(Date stopTime)
  {
    this.stopTime = stopTime;
  }
}
