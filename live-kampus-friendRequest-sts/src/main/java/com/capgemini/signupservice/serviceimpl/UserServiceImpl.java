package com.capgemini.signupservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.signupservice.dao.UserDao;
import com.capgemini.signupservice.entity.User;

@Service
public class UserServiceImpl {

	@Autowired
	private UserDao userDao;

	public User createProfile(User user) {
		return userDao.save(user);
	}

	
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	public List<User> findByName(String name) {
		return userDao.findByName(name);
	}
	
	public User findUserByName(String name) {
		
		
		return userDao.findUserByName(name);
	}

	public User addRequest(String myEmail, String friendEmail) {

		User user = findByEmail(friendEmail);

		User user2 = findByEmail(myEmail);

		List<String> demo = new ArrayList<String>();
		demo.add(user2.getName());

		user.setRequests(demo);
		userDao.save(user);

		return user;
	}

	public List<User> findById(String mail) {
		List<User> user = userDao.findByName(mail);
		return user;
	}

	public User confirmRequest(String myEmail1, String friendEmail1) {

		User user = findByEmail(myEmail1);
		
		User user2= findUserByName(friendEmail1);

		List<String> newFriend = user.getFriends();

		newFriend.add(user2.getName());
		user.setFriends(newFriend);
		userDao.save(user);

		System.out.println("friend add done");

		List<String> newFriend1 = user.getRequests();
		newFriend1.remove(user2.getName());
		user.setRequests(newFriend1);
		userDao.save(user);
		System.out.println("request removed");

		

		List<String> newFriend2 = user2.getFriends();
		newFriend2.add(user.getName());
		user2.setFriends(newFriend2);
		userDao.save(user2);
		System.out.println("friend added .....");
		return user;
	}
	
public void deleteFriend(String myEmail1, String friendEmail1) {
		
		User user = findByEmail(myEmail1);
		User user2 = findUserByName(friendEmail1);
		List<String> newFriend= user.getFriends();
		newFriend.remove(user2.getName());
		user.setFriends(newFriend);
		userDao.save(user);
		System.out.println("friend removed");
		
		
		List<String> newFriend1= new ArrayList<>();
		newFriend1.remove(user.getName());
		user2.setFriends(newFriend1);
		userDao.save(user2);
		System.out.println("friend removed");
		
	}


public List<User> findAll() {
	
	return userDao.findAll();
}




	
	
	

}
