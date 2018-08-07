package com.tricon.User.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.User.classModal.User;
import com.tricon.User.daoInterface.IUserDao;
import com.tricon.User.serviceInterface.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao studentDao; 
	

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return studentDao.getName();
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return studentDao.getName(id);
	}

	@Override
	public String addUser(User userObject) {
		// TODO Auto-generated method stub
		return studentDao.addUser(userObject);
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return studentDao.deleteUser(id);
	}

	@Override
	public String updateUser(User userObject) {
		// TODO Auto-generated method stub
		return studentDao.updateUser(userObject);
	}

}
