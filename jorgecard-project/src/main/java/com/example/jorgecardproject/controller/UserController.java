package com.example.jorgecardproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jorgecardproject.dao.IUser;
import com.example.jorgecardproject.model.User;

@Controller
@RequestMapping(path="/user")
public class UserController {

	@Autowired
	private IUser dao;
	
	@GetMapping
	public List<User> listarUsuarios() {
		return (List<User>) dao.findAll();
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		User newUser = dao.save(user);
		return newUser;	
	}
	
	@PutMapping
	public User editUser(@RequestBody User user) {
		User newUser = dao.save(user);
		return newUser;	
	}
	
	@DeleteMapping("/{id}")
	public Optional<User> deleteUser (@PathVariable Integer id){
		Optional<User> user = dao.findById(id);
		dao.deleteById(id);
		return user;
	}
	
}