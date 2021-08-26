package com.ecommerce.ecart.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.ecart.entities.UserDao;

public interface UserRepository extends CrudRepository<UserDao, Integer> {

	UserDao findByUsername(String username);
}
