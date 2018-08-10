package com.cg.sessionmanagement.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sessionmanagement.beans.ScheduleManagement;



public interface ScheduleManagementRepo extends JpaRepository<ScheduleManagement, Integer>
{

}
