package com.example.jorgecardproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.jorgecardproject.model.User;

public interface IUser extends CrudRepository<User, Integer>{

}