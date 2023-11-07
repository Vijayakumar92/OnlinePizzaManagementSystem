package com.onlinepizza.serviceimp;

import org.springframework.stereotype.Service;

import com.onlinepizza.dto.UserDTO;
import com.onlinepizza.service.IUserService;

@Service
public class IUserServiceImp implements IUserService {

	@Override
	public UserDTO registerUser(UserDTO user) {
		return null;
	}

	@Override
	public UserDTO signIn(String userName, String password) {
		return null;
	}

	@Override
	public String signOut() {
		return null;
	}
	

}
