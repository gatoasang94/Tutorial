package com.mkyong.common.model;

import java.util.ArrayList;
import java.util.List;

public class ActiveList
{
  private List<Active> activateList;
  
  public List<Active> getActivateList()
  {
    return this.activateList;
  }
  
  public void setActivateList(List<Active> activateList)
  {
    this.activateList = activateList;
  }
  
  public ActiveList()
  {
    this.activateList = new ArrayList();
  }
}
