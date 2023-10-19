package com.voyager.enterprise.operation.entity.jobs;

import com.voyager.enterprise.operation.entity.jobs.tasks.TaskStatus;
import com.voyager.enterprise.people.entity.Employee;
import com.voyager.enterprise.util.Code;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Task {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Employee responsible;
    private List<TaskStatus> listStatus;
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
	public Employee getResponsible() {
		return responsible;
	}
	public void setResponsible(Employee responsible) {
		this.responsible = responsible;
	}
	public List<TaskStatus> getListStatus() {
		return listStatus;
	}
	public void setListStatus(List<TaskStatus> listStatus) {
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
