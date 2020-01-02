package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	IAppService iAppService;
	
	@GetMapping("/")
	public List<UserEntity> greetingsGetAll() {
		
		return iAppService.listUsers();
		
	}
	
	@GetMapping("/{id}")
	public UserEntity greetingsGet(@PathVariable(name = "id")Long id) {
		
		return iAppService.getUserById(id);
		
	}
	
	@PutMapping("/")
	public UserEntity greetingsPut(@RequestBody UserEntity user) {
		
		return iAppService.updateUser(user);
		
	}
	
	@PostMapping("/")
	public UserEntity greetingsPost(@RequestBody UserEntity user) {
		
		return iAppService.createUser(user);
		
	}
	
	@DeleteMapping("/")
	public boolean greetingsDelete( @RequestParam(value="id")Long id) {
		
		return iAppService.deleteUserById(id);
		
	}
	

}
