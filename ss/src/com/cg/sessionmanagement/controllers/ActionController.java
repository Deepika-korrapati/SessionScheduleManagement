package com.cg.sessionmanagement.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sessionmanagement.beans.ScheduleManagement;
import com.cg.sessionmanagement.services.ScheduleManagementService;

@Controller
public class ActionController {
	
	@Autowired
	ScheduleManagementService scheduleManagementService;
	
	@RequestMapping(value="/")
	public ModelAndView ViewScheduledSessions() {
			ArrayList<ScheduleManagement> list = scheduleManagementService.getAllSessions();
		return new ModelAndView("ScheduledSessions", "list",list);
	}
	
	@RequestMapping(value="/Success/{name}/{duration}", method = RequestMethod.GET)
	public ModelAndView ViewSuccess(@PathVariable String name, @PathVariable int duration) {

		ScheduleManagement ScheduledSessions = new ScheduleManagement();
		ScheduledSessions.setName(name);
		ScheduledSessions.setDuration(duration);
		return new ModelAndView("Success","ScheduledSessions",ScheduledSessions);

	}
	
}



