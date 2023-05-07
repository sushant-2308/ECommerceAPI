package com.geekster.ECommerceAPI.repository;

import com.geekster.ECommerceAPI.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
}
