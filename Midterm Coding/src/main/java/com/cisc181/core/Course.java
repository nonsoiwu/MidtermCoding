package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	public UUID CourseID;
	public String CourseName;
	public int GradePoints;
	public eMajor Major;
	
	public Course(){
		
	}
	
	public Course(UUID id,String name ,int gp,eMajor major){
		CourseID = id;
		CourseName = name;
		GradePoints = gp;
		Major = major;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
	}
	
	
}
