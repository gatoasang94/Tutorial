package com.mkyong.common.services;

import com.mkyong.common.entities.User;
import com.mkyong.common.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl
  implements UserInterface
{
  @Autowired
  private UserRepository userRepository;
  
  public User getUserByPhoneNumber(String phoneNumber)
  {
    return this.userRepository.findByPhoneNumber(phoneNumber);
  }
  
  public User saveUser(User user)
  {
    return (User)this.userRepository.save(user);
  }
}
