package com.cisc181.core;

import java.util.UUID;

public class Section {
	public UUID CourseID;
	public UUID SemesterID;
	public UUID SectionID;
	public int RoomID;
	
	public Section(){
			
	}
	
	public Section(UUID cid, UUID seid,UUID scid, int rid){
		CourseID = cid;
		SemesterID = seid;
		SectionID = scid;
		RoomID = rid;
		
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID section) {
		SectionID = section;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

}
