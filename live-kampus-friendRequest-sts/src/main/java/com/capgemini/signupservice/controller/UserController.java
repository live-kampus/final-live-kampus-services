package com.capgemini.signupservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.signupservice.entity.Profile;
import com.capgemini.signupservice.entity.User;
import com.capgemini.signupservice.serviceimpl.UserServiceImpl;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RestController
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
	@Autowired
	private RestTemplate restTemplate ;


	@PostMapping("/signUp")
	public ResponseEntity<User> registerNewAccount(@RequestBody User user) {
		
		Profile profile = new Profile();
		
		profile.setEmail(user.getEmail());
		profile.setCity(user.getCity());
		profile.setUserName(user.getName());
		profile.setState(user.getState());
		restTemplate.postForEntity("http://localhost:8087/profile/" , profile, null);
		User user1 = service.createProfile(user);
		user1.setProfile(profile);
		
		return new ResponseEntity<User>(user1,HttpStatus.CREATED);

	}

	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<User> logInDetailsForUser(@PathVariable String email, @PathVariable String password)
			throws NullPointerException {

		 User user = service.findByEmail(email);
	
		 Profile profile = restTemplate.getForEntity("http://localhost:8087/profile/" + user.getEmail(), Profile.class)
					.getBody();
		 user.setProfile(profile);
					
		if((user.getEmail().equals(email) && (user.getPassword().equals(password)))) {
			//System.out.println(user);
			return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);

	}
	
	@GetMapping("/search/{name}")
    public ResponseEntity<List<User>> search(Model model,@PathVariable String name) {
		
		System.out.println(name);
		List<User> user = service.findByName(name);
		
        return new ResponseEntity<List<User>>(user, HttpStatus.ACCEPTED);
    }
	
	@GetMapping("/update/{myEmail}/{friendEmail}")
	public ResponseEntity<User> request(@PathVariable String myEmail, @PathVariable String friendEmail){
		//System.out.println(myEmail);
		
		User user=service.addRequest(myEmail,friendEmail);
	
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@GetMapping("/details/{mail}")
	public ResponseEntity<User> getDetails(@PathVariable String mail){
		System.out.println(mail);
		User user= service.findByEmail(mail);
		System.out.println(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/confirm/{myEmail1}/{friendEmail1}")
	public ResponseEntity<User> confirmRequest(@PathVariable String myEmail1, @PathVariable String friendEmail1){
		/*
		 * System.out.println("confirm"); System.out.println(myEmail1);
		 * System.out.println(friendEmail1);
		 */
		service.confirmRequest(myEmail1,friendEmail1);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	
	@GetMapping("/delete/{myEmail1}/{friendEmail1}")
	public ResponseEntity<User> deleteFriend(@PathVariable String myEmail1, @PathVariable String friendEmail1){
		
		service.deleteFriend(myEmail1,friendEmail1);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
		
		System.out.println();
		List<User> user = service.findAll();
		
        return new ResponseEntity<List<User>>(user, HttpStatus.ACCEPTED);
    }

	

}
