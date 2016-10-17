package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID;
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;
	
	private Enrollment(){
	}
	
	public Enrollment(UUID stid, UUID seid){
		this.StudentID = stid;
		this.SectionID = seid;
		EnrollmentID = UUID.randomUUID();
}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void SetGrade(double grade) {
		Grade = grade;
	}
}