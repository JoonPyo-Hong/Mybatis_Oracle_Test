package com.test.Mybatis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private IService service;

	@RequestMapping(value = "/home.action", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Controller");
		int seq = service.seq();

		request.setAttribute("seq", seq);
		return "home";
	}

}
