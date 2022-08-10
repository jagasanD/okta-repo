package com.app.okta.oktaDemo.controller;


import java.security.Principal;
import java.util.Collections;

import javax.servlet.http.HttpSession;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class BasicAuthController {
	
	
	
/*	@GetMapping("/")
	public String getUser(@AuthenticationPrincipal OidcUser user) {
		return "helooooooooo   "+user.getFullName() + "   "+user.toString();
		
		
	}*/
	
	@GetMapping("/login-app")
	public String getUser(Principal  user) {
		return "helooooooooo   "+user.getName() + "   "+user.toString();
		
		
	}
	
	/*@GetMapping("/authorization-code/callback")
	public String getUserHi(@AuthenticationPrincipal OidcUser user) {
		return "looooooooo   "+user.getFullName() + "   "+user.toString();
		
		
	}*/
	
	 @GetMapping("/login1")
     public String userDetails(OAuth2AuthenticationToken authentication) {
     	System.out.println("----------profile-----------------"+authentication);
     	return Collections.singletonMap("details", authentication.getPrincipal().getAttributes()).toString();
        // return new ModelAndView("userProfile" , Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
     }
	 
	 
	 @GetMapping("/login")
	    public ModelAndView postLogin(@RequestParam("code") String username,
	                                  @RequestParam("state") String password
	                                 ) {
		 
		 // HttpSession session

		 System.out.println("----------username-------"+username);
		 System.out.println("----------username-------"+password);
	    /*    AuthenticationResponse authenticationResponse =
	                (AuthenticationResponse) session.getAttribute("authenticationResponse");

	        // render existing auth response if a successful one is already present in session
	        if (authenticationResponse != null &&
	            authenticationResponse.getAuthenticationStatus() == AuthenticationStatus.SUCCESS) {
	            ModelAndView mav = new ModelAndView("home");
	            mav.addObject("authenticationResponse", authenticationResponse);
	            return mav;
	        }

	        // trigger authentication
	        authenticationResponse = AuthenticationWrapper.authenticate(client, new AuthenticationOptions(username, password));

	        // populate login view with errors
	        if (authenticationResponse.getAuthenticationStatus() != AuthenticationStatus.SUCCESS) {
	            ModelAndView modelAndView = new ModelAndView("login");
	            modelAndView.addObject("messages", authenticationResponse.getErrors());
	            return modelAndView;
	        }

	        // success
	        ModelAndView mav = new ModelAndView("home");
	        mav.addObject("authenticationResponse", authenticationResponse);

	        // store attributes in session
	        session.setAttribute("user", username);
	        session.setAttribute("authenticationResponse", authenticationResponse);
	        return mav;*/
		 
		 return null;
	    }


}
