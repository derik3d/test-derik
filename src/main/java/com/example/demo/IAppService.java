package com.example.demo;

import java.util.List;

public interface IAppService {

	public UserEntity getUserById(Long id);
	public UserEntity createUser(UserEntity user);
	public UserEntity updateUser(UserEntity user);
	public boolean deleteUserById(Long id);
	
	public List<UserEntity> listUsers();

}
