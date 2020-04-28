package com.deadlymove.securityjwt.ldapRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.stereotype.Repository;

import com.deadlymove.securityjwt.model.UserModel;

@Repository
public interface ApacheDSRepositary extends LdapRepository<UserModel>{

	List<UserModel> findByUsername(String username);
}
  
