package com.tongsh6.quartz.jobmanager.dao;

import java.util.List;

import com.tongsh6.quartz.jobmanager.entity.JobAndTrigger;

public interface JobAndTriggerMapper {
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
