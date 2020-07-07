package vn.com.oriexace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.com.oriexace.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = {"/", "/index"})
	public String homePage() {
		return "index";
	}
	@GetMapping(value = "/login")
    public String loginPage(Model model) {
 
        return "login";
    }
}
