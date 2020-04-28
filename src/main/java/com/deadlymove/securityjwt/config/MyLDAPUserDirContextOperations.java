package com.deadlymove.securityjwt.config;

import java.util.Hashtable;
import java.util.Optional;
import java.util.SortedSet;
import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.ModificationItem;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.springframework.ldap.core.DirContextOperations;

import com.deadlymove.securityjwt.model.UserModel;

public class MyLDAPUserDirContextOperations implements DirContextOperations{
	
	private Name dn;

	private String username;
	
	private String firstName;
		
	private String lastName;
	
	
	
	public MyLDAPUserDirContextOperations(UserModel userModel) {
		this.dn = userModel.getDn();
		this.username = userModel.getUsername();
		this.firstName = userModel.getFirstName();
		this.lastName = userModel.getLastName();
	}

	public MyLDAPUserDirContextOperations() {
		
	}
	
	@Override
	public Attributes getAttributes(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attributes getAttributes(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attributes getAttributes(Name name, String[] attrIds) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attributes getAttributes(String name, String[] attrIds) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyAttributes(Name name, int mod_op, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAttributes(String name, int mod_op, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAttributes(Name name, ModificationItem[] mods) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAttributes(String name, ModificationItem[] mods) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bind(Name name, Object obj, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bind(String name, Object obj, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rebind(Name name, Object obj, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rebind(String name, Object obj, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DirContext createSubcontext(Name name, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DirContext createSubcontext(String name, Attributes attrs) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DirContext getSchema(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DirContext getSchema(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DirContext getSchemaClassDefinition(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DirContext getSchemaClassDefinition(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(Name name, Attributes matchingAttributes, String[] attributesToReturn)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(String name, Attributes matchingAttributes,
			String[] attributesToReturn) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(Name name, Attributes matchingAttributes) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(String name, Attributes matchingAttributes) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(Name name, String filter, SearchControls cons)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(String name, String filter, SearchControls cons)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(Name name, String filterExpr, Object[] filterArgs,
			SearchControls cons) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<SearchResult> search(String name, String filterExpr, Object[] filterArgs,
			SearchControls cons) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object lookup(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object lookup(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bind(Name name, Object obj) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bind(String name, Object obj) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rebind(Name name, Object obj) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rebind(String name, Object obj) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbind(Name name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbind(String name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rename(Name oldName, Name newName) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rename(String oldName, String newName) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NamingEnumeration<NameClassPair> list(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<NameClassPair> list(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<Binding> listBindings(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamingEnumeration<Binding> listBindings(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroySubcontext(Name name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroySubcontext(String name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Context createSubcontext(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Context createSubcontext(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object lookupLink(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object lookupLink(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NameParser getNameParser(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NameParser getNameParser(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Name composeName(Name name, Name prefix) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String composeName(String name, String prefix) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object addToEnvironment(String propName, Object propVal) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeFromEnvironment(String propName) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hashtable<?, ?> getEnvironment() throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() throws NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStringAttribute(String name) {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public Object getObjectAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean attributeExists(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAttributeValue(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttributeValues(String name, Object[] values) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttributeValues(String name, Object[] values, boolean orderMatters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAttributeValue(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAttributeValue(String name, Object value, boolean addIfDuplicateExists) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttributeValue(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getStringAttributes(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getObjectAttributes(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<String> getAttributeSortedStringSet(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Name getDn() {
		// TODO Auto-generated method stub
		return dn;
	}

	@Override
	public Attributes getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModificationItem[] getModificationItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUpdateMode() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getNamesOfModifiedAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDn(Name dn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNameInNamespace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReferralUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReferral() {
		// TODO Auto-generated method stub
		return true;
	}
	
	  

}




