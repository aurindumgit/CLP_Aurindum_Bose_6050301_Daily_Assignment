package com.cg.securityApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.securityApp.entities.Myusers;
import com.cg.securityApp.repository.MyUsersRepo;

@Service
public class MyUserdetailService implements UserDetailsService {
	
	@Autowired
	MyUsersRepo myUserRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Myusers> op=myUserRepo.findById(username);
		if(op.isPresent())
		{
			Myusers user=op.get();
			return new MyUserDetail(user);
		}
		else
			throw new UsernameNotFoundException("User not fpond");
		
	}
	
}
