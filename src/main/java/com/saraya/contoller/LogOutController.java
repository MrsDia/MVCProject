package com.saraya.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LogOutController {
	@RequestMapping(value="/logout-car", method=RequestMethod.GET)
	public String logout(HttpServletRequest request, 
			HttpServletResponse response) { 
 				
 			Authentication auth = SecurityContextHolder.getContext()
 					.getAuthentication();
 			if(auth != null) {
 				new SecurityContextLogoutHandler().logout(request, response, auth);
 				request.getSession().invalidate();
 			}
 			
		return "redirect:/";
	}
	


}