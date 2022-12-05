package com.francisco.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	 @GetMapping("/")
	 public String index(HttpSession session, Model model) {
		 if(session.getAttribute("count")== null) {
			    session.setAttribute("count",0);
			 }
			 Integer currentCount =(Integer) session.getAttribute("count");
			 currentCount ++;
			 session.setAttribute("count", currentCount);
	     return "index.jsp";
	 }
	 @GetMapping("/counter")
	 public String showCount() {
		 return "showCount.jsp";
	 }

}
