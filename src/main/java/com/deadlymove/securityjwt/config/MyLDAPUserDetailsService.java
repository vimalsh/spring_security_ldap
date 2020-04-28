package com.deadlymove.securityjwt.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.ldap.search.LdapUserSearch;
import org.springframework.stereotype.Service;

import com.deadlymove.securityjwt.ldapRepo.ApacheDSRepositary;
import com.deadlymove.securityjwt.model.UserModel;

@Service
public class MyLDAPUserDetailsService implements LdapUserSearch{
	
	@Autowired
	ApacheDSRepositary apacheDSRepositary;

	@Override
	public DirContextOperations searchForUser(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<UserModel> user= apacheDSRepositary.findByUsername(username);
		MyLDAPUserDirContextOperations contextOperations = new MyLDAPUserDirContextOperations(user.get(0));
		return contextOperations;
	}

}
