package com.mkyong.common.model;

import java.util.Date;

public class CDR
{
  private String caller;
  private String callee;
  private String callid;
  private Date start;
  private Date answer;
  private Date end;
  private long duration;
  private double used_credit;
  private String currency;
  private String hangupcause;
  
  public String getCaller()
  {
    return this.caller;
  }
  
  public void setCaller(String caller)
  {
    this.caller = caller;
  }
  
  public String getCallee()
  {
    return this.callee;
  }
  
  public void setCallee(String callee)
  {
    this.callee = callee;
  }
  
  public String getCallid()
  {
    return this.callid;
  }
  
  public void setCallid(String callid)
  {
    this.callid = callid;
  }
  
  public Date getStart()
  {
    return this.start;
  }
  
  public void setStart(Date start)
  {
    this.start = start;
  }
  
  public Date getAnswer()
  {
    return this.answer;
  }
  
  public void setAnswer(Date answer)
  {
    this.answer = answer;
  }
  
  public Date getEnd()
  {
    return this.end;
  }
  
  public void setEnd(Date end)
  {
    this.end = end;
  }
  
  public long getDuration()
  {
    return this.duration;
  }
  
  public void setDuration(long duration)
  {
    this.duration = duration;
  }
  
  public double getUsed_credit()
  {
    return this.used_credit;
  }
  
  public void setUsed_credit(double d)
  {
    this.used_credit = d;
  }
  
  public String getCurrency()
  {
    return this.currency;
  }
  
  public void setCurrency(String currency)
  {
    this.currency = currency;
  }
  
  public String getHangupcause()
  {
    return this.hangupcause;
  }
  
  public void setHangupcause(String hangupcause)
  {
    this.hangupcause = hangupcause;
  }
}
