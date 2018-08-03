package com.tongsh6.quartz.jobmanager.service;


import com.github.pagehelper.PageInfo;
import com.tongsh6.quartz.jobmanager.entity.JobAndTrigger;

public interface IJobAndTriggerService {
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
