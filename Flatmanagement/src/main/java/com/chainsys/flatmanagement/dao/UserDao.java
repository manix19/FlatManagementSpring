package com.chainsys.flatmanagement.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chainsys.flatmanagement.model.Tenant;
import com.chainsys.flatmanagement.model.User;

@Repository
public interface UserDao {
	public User loginDetails(String email); 
    public int registerDao(User user) throws SQLException  ;
    public List<User> findAllUsers() ;
}
