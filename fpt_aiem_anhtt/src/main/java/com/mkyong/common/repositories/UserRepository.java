package com.mkyong.common.repositories;

import com.mkyong.common.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface UserRepository
  extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User>
{
  public abstract User findByPhoneNumber(String paramString);
}
