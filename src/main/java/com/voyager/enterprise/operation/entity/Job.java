package com.voyager.enterprise.operation.entity;

import com.voyager.enterprise.commercial.entity.Order;
import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.operation.entity.jobs.JobStatus;
import com.voyager.enterprise.operation.entity.jobs.Task;
import com.voyager.enterprise.util.Code;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Job extends Order{
	
	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    private List<Merchandise> feedstocks;
    private List<Task> tasks;
    private List<JobStatus> listStatus;
    private LocalDate start;
    private LocalDate end;

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Code<String> getCode() {
		return code;
	}
	public void setCode(Code<String> code) {
		this.code = code;
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<Merchandise> getFeedstocks() {
		return feedstocks;
	}
	public void setFeedstocks(List<Merchandise> feedstocks) {
		this.feedstocks = feedstocks;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public List<JobStatus> getListStatus() {
		return listStatus;
	}
	public void setListStatus(List<JobStatus> listStatus) {
		this.listStatus = listStatus;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}

}
