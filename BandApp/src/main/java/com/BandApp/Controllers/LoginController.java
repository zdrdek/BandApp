package com.BandApp.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String showLoginForm() {
		return "login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String loginUser(@RequestParam String username, HttpSession userSession) {
		//Do Something
		userSession.setAttribute("username", username);
		
		return "redirect:/";
	}
	
	@RequestMapping(path="/logout", method=RequestMethod.GET)
	public String logoutUser(HttpSession userSession, RedirectAttributes flashScope) {
		userSession.removeAttribute("username");
		flashScope.addFlashAttribute("message", "You have been logged out.");
		
		return "redirect:/login";
	}
	
}
