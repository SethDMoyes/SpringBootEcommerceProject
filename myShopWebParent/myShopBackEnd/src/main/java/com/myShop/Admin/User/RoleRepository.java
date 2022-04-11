package com.myShop.Admin.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myShop.common.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
