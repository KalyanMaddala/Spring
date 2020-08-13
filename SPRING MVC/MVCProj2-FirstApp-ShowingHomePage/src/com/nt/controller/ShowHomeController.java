package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Date d=null;
		ModelAndView mav=null;
		// create Date class object
		d=new Date();
		//return MAV
		mav=new ModelAndView();
		mav.addObject("sysDate",d);
		mav.addObject("msg", "Good Morning");
		mav.setViewName("welcome");
		return mav;
		//return new ModelAndView("welcome", "sysDate",d);
	}

}
