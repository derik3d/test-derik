package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService implements IAppService{
	
	@Autowired
	DAOUser daoUser;

	@Override
	public UserEntity getUserById(Long id) {
		return daoUser.findById(id).get();
	}

	@Override
	public UserEntity createUser(UserEntity user) {
		return daoUser.save(user);
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		//TODO
		return daoUser.save(user);
	}

	@Override
	public boolean deleteUserById(Long id) {
		daoUser.deleteById(id);
		return true;
	}

	@Override
	public List<UserEntity> listUsers() {
		return (List<UserEntity>) daoUser.findAll();
	}
	
	

}
