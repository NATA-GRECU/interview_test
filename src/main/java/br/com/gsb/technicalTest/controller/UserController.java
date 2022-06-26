package br.com.gsb.technicalTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsb.technicalTest.dao.UserDao;
import br.com.gsb.technicalTest.model.User;
import br.com.gsb.technicalTest.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAll()
	{
		List<User> allUsers = dao.findAll();
		userService.formatBirthDate(allUsers); 
	
		
		return ResponseEntity.ok(allUsers);
	}
	
	@PostMapping
	public ResponseEntity<User> Post(@RequestBody User user)
	{	
		return ResponseEntity.ok(dao.save(user));
	}

}
