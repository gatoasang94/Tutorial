package com.mkyong.common.model;

import java.util.List;
import java.util.Map;

public class GetPackageCreditResponse
{
  private int returnCode;
  private String returnMsg;
  private String phoneNumber;
  private String DIDNumber;
  private List<Map<Object, Object>> packages;
  
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
  
  public List<Map<Object, Object>> getPackages()
  {
    return this.packages;
  }
  
  public void setPackages(List<Map<Object, Object>> packages)
  {
    this.packages = packages;
  }
}
