package com.mkyong.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id", unique=true, nullable=false)
  private Integer id;
  @Column(name="phone_number", unique=true, length=45)
  private String phoneNumber;
  @Column(name="credit_id", unique=true, length=45)
  private String creditId;
  @Column(name="balance", length=45)
  private Integer balance;
  
  public Integer getId()
  {
    return this.id;
  }
  
  public void setId(Integer id)
  {
    this.id = id;
  }
  
  public String getPhoneNumber()
  {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }
  
  public String getCreditId()
  {
    return this.creditId;
  }
  
  public void setCreditId(String creditId)
  {
    this.creditId = creditId;
  }
  
  public Integer getBalance()
  {
    return this.balance;
  }
  
  public void setBalance(Integer balance)
  {
    this.balance = balance;
  }
}
