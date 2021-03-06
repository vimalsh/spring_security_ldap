package com.deadlymove.securityjwt.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.ldap.search.LdapUserSearch;
import org.springframework.security.ldap.userdetails.LdapUserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.deadlymove.securityjwt.config.MyLDAPUserDetailsService;
import com.deadlymove.securityjwt.utils.JWTUtils;

@Component
public class JWTRequestFilter extends OncePerRequestFilter{
	
	@Autowired
	private JWTUtils jwtUtils;
	
	@Autowired
	MyLDAPUserDetailsService LDAPUserDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	//Used to validate and store in securityContext
		String username = null;
		String jwt =null ;
		try { 
			String authorizationHeader = request.getHeader("Authorization");
			if(authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
				jwt=authorizationHeader.substring(7);
				username = jwtUtils.extractUsername(jwt);
			}  
			
			System.out.println("username"+username);
			System.out.println(SecurityContextHolder.getContext().getAuthentication());
			if(username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				System.out.println("username"+username);
				LdapUserSearch userSearch = (LdapUserSearch) LDAPUserDetailsService.searchForUser(username);
				System.out.println(userSearch);
				LdapUserDetailsService detailsService = new LdapUserDetailsService(userSearch);
				UserDetails userDetails = detailsService.loadUserByUsername(username);
				System.out.println("userDetails"+userDetails.getUsername()+userDetails.getPassword());
//				if(jwtUtils.validateToken(jwt, userDetails)) {
//					UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null ,userDetails.getAuthorities());
//					usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//					SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//				}
			}
			filterChain.doFilter(request,response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

