package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {
	public UUID SemesterID;
	public Date StartDate;
	public Date EndDate;

	public Semester(){
		
	}
	
	public Semester(UUID ID, Date start, Date end) {
		this.SemesterID = ID;
		this.StartDate=start;
		this.EndDate=end;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID ID) {
		SemesterID = ID;
	}
	
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date start) {
		StartDate = start;
	}
	
	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date end) {
		EndDate = end;
	}
}
