package com.tricon.User.serviceInterface;

import java.util.List;

import com.tricon.User.classModal.User;

public interface IUserService {
	public List<User>  getAllUsers();
	public User getUser(int id);
	public String addUser(User userObject);
	public String deleteUser(int id);
	public String updateUser(User userObject);
}
