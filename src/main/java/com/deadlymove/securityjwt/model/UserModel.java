package com.deadlymove.securityjwt.model;

import javax.naming.Name;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entry(base="ou=users", objectClasses = {
        "top",
        "inetOrgPerson", "person", "organizationalPerson"})
public class UserModel {
   
	@Id
	private Name dn;
	
	@Attribute(name = "uid")
	private String username;
	
	@Attribute(name = "cn")
	private String firstName;
	
	@Attribute(name = "sn")
	private String lastName;
	
	@Attribute(name = "userPassword")
	private String userPassword;
	
	

	public UserModel(Name dn, String username, String firstName, String lastName, String userPassword) {
		this.dn = dn;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userPassword = userPassword;
	}

    public UserModel() {

    }
	public Name getDn() {
		return dn;
	}

	public void setDn(Name dn) {
		this.dn = dn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserModel [dn=" + dn + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userPassword=" + userPassword + "]";
	}
	
	
	
	
}
