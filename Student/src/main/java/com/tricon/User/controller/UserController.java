package com.tricon.User.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.User.classModal.User;
import com.tricon.User.serviceInterface.IUserService;

@RestController
public class UserController {

	@Autowired
	private IUserService  student;
	
	@RequestMapping("/user")
	public List<User> getAllUsers() {
		System.out.println("Inside: Controller dsdfds sdad  adsad  zssd");
		return student.getAllUsers();
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User getUser(@PathVariable int id) {
		System.out.println("Inside: Controller");
		return student.getUser(id);
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String addUser(@RequestBody User userObject) {
		System.out.println("Inside: fff Controller");
		return student.addUser(userObject);
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	public String User(@PathVariable int id) {
		System.out.println("Inside: fff Controller");
		return student.deleteUser(id);
	}
	
	@RequestMapping(value="/user",method=RequestMethod.PUT)
	public String User(@RequestBody User userObject) {
		System.out.println("Inside: uuu Controller");
		return student.updateUser(userObject);
	}
}
