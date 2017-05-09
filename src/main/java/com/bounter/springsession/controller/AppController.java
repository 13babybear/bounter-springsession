package com.bounter.springsession.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/4/16.
 */
@Controller
public class AppController {

	@RequestMapping("/")
    public String home() {
        return "index";
    }
	
	@RequestMapping("/put")
    public String put(HttpSession session) {
        session.setAttribute("name", "simon");
        return "index";
    }
	
	@RequestMapping("/get")
	@ResponseBody
    public String get(HttpSession session) {
		return (String) session.getAttribute("name");
    }
}
