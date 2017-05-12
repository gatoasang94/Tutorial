package com.mkyong.common.model;

import java.util.List;

public class CDRResponse
{
  private int returnCode;
  private String returnMsg;
  private String phoneNumber;
  private String DIDNumber;
  private List<CDR> cdr;
  
  public int getReturnCode()
  {
    return this.returnCode;
  }
  
  public void setReturnCode(int returnCode)
  {
    this.returnCode = returnCode;
  }
  
  public String getReturnMsg()
  {
    return this.returnMsg;
  }
  
  public void setReturnMsg(String returnMsg)
  {
    this.returnMsg = returnMsg;
  }
  
  public String getPhoneNumber()
  {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }
  
  public String getDIDNumber()
  {
    return this.DIDNumber;
  }
  
  public void setDIDNumber(String dIDNumber)
  {
    this.DIDNumber = dIDNumber;
  }
  
  public List<CDR> getCdr()
  {
    return this.cdr;
  }
  
  public void setCdr(List<CDR> cdr)
  {
    this.cdr = cdr;
  }
}
