package com.mkyong.common.model;

public class Credit
{
  private String creditID;
  private int payType;
  private int priority;
  private String creditType;
  private int quantity;
  private String currency;
  private int expiry;
  
  public String getCreditID()
  {
    return this.creditID;
  }
  
  public void setCreditID(String creditID)
  {
    this.creditID = creditID;
  }
  
  public int getPayType()
  {
    return this.payType;
  }
  
  public void setPayType(int payType)
  {
    this.payType = payType;
  }
  
  public int getPriority()
  {
    return this.priority;
  }
  
  public void setPriority(int priority)
  {
    this.priority = priority;
  }
  
  public String getCreditType()
  {
    return this.creditType;
  }
  
  public void setCreditType(String creditType)
  {
    this.creditType = creditType;
  }
  
  public int getQuantity()
  {
    return this.quantity;
  }
  
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }
  
  public String getCurrency()
  {
    return this.currency;
  }
  
  public void setCurrency(String currency)
  {
    this.currency = currency;
  }
  
  public int getExpiry()
  {
    return this.expiry;
  }
  
  public void setExpiry(int expiry)
  {
    this.expiry = expiry;
  }
}
