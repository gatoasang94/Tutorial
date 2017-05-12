package com.mkyong.common.services;

import com.mkyong.common.entities.User;

public abstract interface UserInterface
{
  public abstract User getUserByPhoneNumber(String paramString);
  
  public abstract User saveUser(User paramUser);
}
