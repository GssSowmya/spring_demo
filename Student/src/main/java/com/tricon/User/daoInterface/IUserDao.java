package com.tricon.User.daoInterface;

import java.util.List;

import com.tricon.User.classModal.User;

public interface IUserDao {
	public List<User> getName();
	public User getName(int id);
	public String addUser(User userObject);
	public String deleteUser(int id);
	public String updateUser(User userObject);
}
