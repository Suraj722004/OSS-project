package com.OSS.admin.user;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.OSS.common.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
	

}
