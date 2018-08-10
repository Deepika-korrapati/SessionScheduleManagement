package com.cg.sessionmanagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.sessionmanagement.beans.ScheduleManagement;
import com.cg.sessionmanagement.daoservices.ScheduleManagementRepo;


@Component
public class ScheduleManagementImpl implements ScheduleManagementService {
	
	@Autowired
	private ScheduleManagementRepo repo;

	@Override
	public ArrayList<ScheduleManagement> getAllSessions() {
		List<ScheduleManagement> schedule = repo.findAll();
		return (ArrayList<ScheduleManagement>) schedule;
		
	}
	
	
}
