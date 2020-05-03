package com.deadlymove.securityjwt.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.ldap.search.LdapUserSearch;
import org.springframework.stereotype.Service;

import com.deadlymove.securityjwt.ldapRepo.ApacheDSRepositary;
import com.deadlymove.securityjwt.model.UserModel;

@Service
//public class MyLDAPUserDetailsService implements LdapUserSearch{
public class MyLDAPUserDetailsService {
	
	@Autowired
	ApacheDSRepositary apacheDSRepositary;

	
	public UserModel searchForUser(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<UserModel> users= apacheDSRepositary.findByUsername(username);
		return users.get(0);
//		MyLDAPUserDirContextOperations contextOperations = new MyLDAPUserDirContextOperations(user.get(0));
//		return contextOperations;
	}

}
