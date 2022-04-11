package com.myShop.Admin.User;

import org.springframework.data.repository.CrudRepository;

import com.myShop.common.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
