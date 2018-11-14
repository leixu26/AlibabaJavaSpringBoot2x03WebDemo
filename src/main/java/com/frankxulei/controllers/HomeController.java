package com.frankxulei.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frankxulei.models.User;
import com.frankxulei.repository.UserRepository;

@RequestMapping("/Home")
@Controller
public class HomeController {
	@Autowired
	private UserRepository usersRepository;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "Hello！ 阿里巴巴Java Spring Boot2.0实战开发课程");
		List<User> listUsers = (List<User>) usersRepository.findAll();
		System.out.println(listUsers.size());
		return mv;
	}
}
