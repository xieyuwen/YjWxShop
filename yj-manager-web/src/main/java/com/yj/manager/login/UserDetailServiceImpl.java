package com.yj.manager.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yj.db.entity.TblManUser;
import com.yj.manager.service.UserService;

public class UserDetailServiceImpl implements UserDetailsService{
	
	
	UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}



	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
		System.out.println(username);
		grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
		TblManUser tblManUser = userService.userLogin(username);
		System.out.println(tblManUser.getPassWord());
		return new User(username,tblManUser.getPassWord(), grantedAuths);
	}

}
