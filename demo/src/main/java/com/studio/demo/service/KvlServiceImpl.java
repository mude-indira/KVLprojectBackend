package com.studio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studio.demo.dto.KvlDto;
import com.studio.demo.model.KvlModel;
import com.studio.demo.repository.KvlRepository;

@Service
public class KvlServiceImpl implements KvlService {
	
	@Autowired
	 private KvlRepository kvlRepository;
	
	
	
	public String register(KvlDto request) {
		if(kvlRepository.existsByEmail(request.getEmail())) {
			//System.out.println("Trying to register email: " + request.getEmail());

			return "email alreday exist";
		}
		if(!request.getPassword().equals(request.getConfirmPassword())) {
			return "password not matching";
		}
		
		KvlModel obj = new KvlModel();
		obj.setUsername(request.getUsername());
		obj.setEmail(request.getEmail());
		
		obj.setPassword(request.getPassword());
		kvlRepository.save(obj);
		//System.out.println("Trying to register email: " + obj.getEmail());

		
		
		return "signup successful";
		
	}
	public String login(KvlDto request) {
		KvlModel emailid=kvlRepository.findByEmail(request.getEmail());
		if( emailid != null && emailid.getPassword().equals(request.getPassword())) {
			
			return "Login Successful";
		}
		return "Invalid Credential";
		
		
	}
	public String forgotpassword(KvlDto request) {
		KvlModel user=kvlRepository.findByEmail(request.getEmail());
		if( user== null) {
			return "email not registerd";
		}
		if(!request.getNewPassword().equals(request.getConfirmPassword())) {
			return "password and confirmpassword not matching";
		}
		user.setPassword(request.getNewPassword());
		kvlRepository.save(user);
		
		return "password reset successfully";
	}
	
	
		
	

}
