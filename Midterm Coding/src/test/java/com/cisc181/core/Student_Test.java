package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.core.Student;
import com.cisc181.core.Course;
import com.cisc181.core.Section;
import com.cisc181.core.PersonException;

import com.cisc181.eNums.eMajor;
import  org.junit.Assert;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		Course account = new Course(UUID.randomUUID(), "ACC101", 100, eMajor.BUSINESS);
		Course phys = new Course(UUID.randomUUID(), "PHYS207", 150, eMajor.PHYSICS);
		Course compsci = new Course(UUID.randomUUID(), "CISC181", 200, eMajor.COMPSI);
		
		ArrayList<Course> spCourses = new ArrayList<Course>();
		spCourses.add(account);
		spCourses.add(compsci);
		spCourses.add(phys);

		Date fStart = new Date(26, 8, 27); 
		Date fEnd = new Date(26, 12, 19); 
		Date spStart = new Date(27, 2, 7); 
		Date spEnd = new Date(27, 5, 29); 

		Semester fall = new Semester(UUID.randomUUID(), fStart, fEnd);
		Semester spring = new Semester(UUID.randomUUID(), spStart, spEnd);

		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(fall);
		semesters.add(spring);
		
		Section faccount = new Section(fall.getSemesterID(), account.getCourseID(), UUID.randomUUID(), 101);
		Section saccount = new Section(spring.getSemesterID(), account.getCourseID(), UUID.randomUUID(), 102);
		Section fphys = new Section(fall.getSemesterID(), compsci.getCourseID(), UUID.randomUUID(), 201);
		Section sphys = new Section(spring.getSemesterID(), compsci.getCourseID(), UUID.randomUUID(), 202);
		Section fcisc = new Section(fall.getSemesterID(), phys.getCourseID(), UUID.randomUUID(), 301);
		Section scisc = new Section(spring.getSemesterID(), phys.getCourseID(), UUID.randomUUID(), 302);

		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(faccount);
		sections.add(saccount);
		sections.add(fphys);
		sections.add(sphys);
		sections.add(fcisc);
		sections.add(scisc);

		Student s1 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.BUSINESS, "000 Nowhere Street",
				"1111111111", "email@gmail.com");
		Student s2 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.CHEM, "000 Nowhere Street",
				"2222222222", "email@gmail.com");
		Student s3 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.NURSING, "000 Nowhere Street",
				"3333333333", "email@gmail.com");
		Student s4 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.PHYSICS, "000 Nowhere Street",
				"4444444444", "email@gmail.com");
		Student s5 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.BUSINESS, "000 Nowhere Street",
				"5555555555", "email@gmail.com");
		Student s6 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.CHEM, "000 Nowhere Street",
				"6666666666", "email@gmail.com");
		Student s7 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.NURSING, "000 Nowhere Street",
				"7777777777", "email@gmail.com");
		Student s8 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.PHYSICS, "000 Nowhere Street",
				"8888888888", "email@gmail.com");
		Student s9 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.COMPSI, "000 Nowhere Street",
				"9999999999", "email@gmail.com");
		Student s10 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.COMPSI, "000 Nowhere Street",
				"0000000000", "email@gmail.com");

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);

		Enrollment s1account = new Enrollment(s1.getStudentID(), saccount.getSectionID());
		s1account.SetGrade(80);
		Enrollment s1phys = new Enrollment(s1.getStudentID(), sphys.getSectionID());
		s1phys.SetGrade(90);
		Enrollment s1compsci = new Enrollment(s1.getStudentID(), fphys.getSectionID());
		s1compsci.SetGrade(100);

		Enrollment s2account = new Enrollment(s2.getStudentID(), saccount.getSectionID());
		s2account.SetGrade(80);
		Enrollment s2phys = new Enrollment(s2.getStudentID(), sphys.getSectionID());
		s2phys.SetGrade(90);
		Enrollment s2compsci = new Enrollment(s2.getStudentID(), fphys.getSectionID());
		s2compsci.SetGrade(100);

		Enrollment s3account = new Enrollment(s3.getStudentID(), saccount.getSectionID());
		s3account.SetGrade(80);
		Enrollment s3phys = new Enrollment(s3.getStudentID(), sphys.getSectionID());
		s3phys.SetGrade(90);
		Enrollment s3compsci = new Enrollment(s3.getStudentID(), fphys.getSectionID());
		s3compsci.SetGrade(100);

		Enrollment s4account = new Enrollment(s4.getStudentID(), saccount.getSectionID());
		s4account.SetGrade(80);
		Enrollment s4phys = new Enrollment(s4.getStudentID(), sphys.getSectionID());
		s4phys.SetGrade(90);
		Enrollment s4compsci = new Enrollment(s4.getStudentID(), fphys.getSectionID());
		s4compsci.SetGrade(100);

		Enrollment s5account = new Enrollment(s5.getStudentID(), saccount.getSectionID());
		s5account.SetGrade(80);
		Enrollment s5phys = new Enrollment(s5.getStudentID(), sphys.getSectionID());
		s5phys.SetGrade(90);
		Enrollment s5compsci = new Enrollment(s5.getStudentID(), fphys.getSectionID());
		s5compsci.SetGrade(100);

		Enrollment s6account = new Enrollment(s6.getStudentID(), saccount.getSectionID());
		s6account.SetGrade(80);
		Enrollment s6phys = new Enrollment(s6.getStudentID(), sphys.getSectionID());
		s6phys.SetGrade(90);
		Enrollment s6compsci = new Enrollment(s6.getStudentID(), fphys.getSectionID());
		s6compsci.SetGrade(100);

		Enrollment s7account = new Enrollment(s7.getStudentID(), saccount.getSectionID());
		s7account.SetGrade(80);
		Enrollment s7phys = new Enrollment(s7.getStudentID(), sphys.getSectionID());
		s7phys.SetGrade(90);
		Enrollment s7compsci = new Enrollment(s7.getStudentID(), fphys.getSectionID());
		s7compsci.SetGrade(100);

		Enrollment s8account = new Enrollment(s8.getStudentID(), saccount.getSectionID());
		s8account.SetGrade(80);
		Enrollment s8phys = new Enrollment(s8.getStudentID(), sphys.getSectionID());
		s8phys.SetGrade(90);
		Enrollment s8compsci = new Enrollment(s8.getStudentID(), fphys.getSectionID());
		s8compsci.SetGrade(100);

		Enrollment s9account = new Enrollment(s9.getStudentID(), saccount.getSectionID());
		s9account.SetGrade(80);
		Enrollment s9phys = new Enrollment(s9.getStudentID(), sphys.getSectionID());
		s9phys.SetGrade(90);
		Enrollment s9compsci = new Enrollment(s9.getStudentID(), fphys.getSectionID());
		s9compsci.SetGrade(100);

		Enrollment s10account = new Enrollment(s10.getStudentID(), saccount.getSectionID());
		s10account.SetGrade(80);
		Enrollment s10phys = new Enrollment(s10.getStudentID(), sphys.getSectionID());
		s10phys.SetGrade(90);
		Enrollment s10compsci = new Enrollment(s10.getStudentID(), fphys.getSectionID());
		s10compsci.SetGrade(100);
	}

	@Test
	public void test() throws PersonException {
		
		Course account = new Course(UUID.randomUUID(), "ACC101", 100, eMajor.BUSINESS);
		Course phys = new Course(UUID.randomUUID(), "PHYS207", 150, eMajor.PHYSICS);
		Course compsci = new Course(UUID.randomUUID(), "CISC181", 200, eMajor.COMPSI);
		
		ArrayList<Course> spCourses = new ArrayList<Course>();
		spCourses.add(account);
		spCourses.add(compsci);
		spCourses.add(phys);

		Date fStart = new Date(26, 8, 27); 
		Date fEnd = new Date(26, 12, 19); 
		Date spStart = new Date(27, 2, 7); 
		Date spEnd = new Date(27, 5, 29); 

		Semester fall = new Semester(UUID.randomUUID(), fStart, fEnd);
		Semester spring = new Semester(UUID.randomUUID(), spStart, spEnd);

		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(fall);
		semesters.add(spring);
		
		Section faccount = new Section(fall.getSemesterID(), account.getCourseID(), UUID.randomUUID(), 101);
		Section saccount = new Section(spring.getSemesterID(), account.getCourseID(), UUID.randomUUID(), 102);
		Section fphys = new Section(fall.getSemesterID(), compsci.getCourseID(), UUID.randomUUID(), 201);
		Section sphys = new Section(spring.getSemesterID(), compsci.getCourseID(), UUID.randomUUID(), 202);
		Section fcisc = new Section(fall.getSemesterID(), phys.getCourseID(), UUID.randomUUID(), 301);
		Section scisc = new Section(spring.getSemesterID(), phys.getCourseID(), UUID.randomUUID(), 302);

		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(faccount);
		sections.add(saccount);
		sections.add(fphys);
		sections.add(sphys);
		sections.add(fcisc);
		sections.add(scisc);

		Student s1 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.BUSINESS, "000 Nowhere Street",
				"1111111111", "email@gmail.com");
		Student s2 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.CHEM, "000 Nowhere Street",
				"2222222222", "email@gmail.com");
		Student s3 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.NURSING, "000 Nowhere Street",
				"3333333333", "email@gmail.com");
		Student s4 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.PHYSICS, "000 Nowhere Street",
				"4444444444", "email@gmail.com");
		Student s5 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.BUSINESS, "000 Nowhere Street",
				"5555555555", "email@gmail.com");
		Student s6 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.CHEM, "000 Nowhere Street",
				"6666666666", "email@gmail.com");
		Student s7 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.NURSING, "000 Nowhere Street",
				"7777777777", "email@gmail.com");
		Student s8 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.PHYSICS, "000 Nowhere Street",
				"8888888888", "email@gmail.com");
		Student s9 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.COMPSI, "000 Nowhere Street",
				"9999999999", "email@gmail.com");
		Student s10 = new Student("Sample", "null", "N.A", new Date(0, 0, 0), eMajor.COMPSI, "000 Nowhere Street",
				"0000000000", "email@gmail.com");

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);

		Enrollment s1account = new Enrollment(s1.getStudentID(), saccount.getSectionID());
		s1account.SetGrade(80);
		Enrollment s1phys = new Enrollment(s1.getStudentID(), sphys.getSectionID());
		s1phys.SetGrade(90);
		Enrollment s1compsci = new Enrollment(s1.getStudentID(), fphys.getSectionID());
		s1compsci.SetGrade(100);

		Enrollment s2account = new Enrollment(s2.getStudentID(), saccount.getSectionID());
		s2account.SetGrade(80);
		Enrollment s2phys = new Enrollment(s2.getStudentID(), sphys.getSectionID());
		s2phys.SetGrade(90);
		Enrollment s2compsci = new Enrollment(s2.getStudentID(), fphys.getSectionID());
		s2compsci.SetGrade(100);

		Enrollment s3account = new Enrollment(s3.getStudentID(), saccount.getSectionID());
		s3account.SetGrade(80);
		Enrollment s3phys = new Enrollment(s3.getStudentID(), sphys.getSectionID());
		s3phys.SetGrade(90);
		Enrollment s3compsci = new Enrollment(s3.getStudentID(), fphys.getSectionID());
		s3compsci.SetGrade(100);

		Enrollment s4account = new Enrollment(s4.getStudentID(), saccount.getSectionID());
		s4account.SetGrade(80);
		Enrollment s4phys = new Enrollment(s4.getStudentID(), sphys.getSectionID());
		s4phys.SetGrade(90);
		Enrollment s4compsci = new Enrollment(s4.getStudentID(), fphys.getSectionID());
		s4compsci.SetGrade(100);

		Enrollment s5account = new Enrollment(s5.getStudentID(), saccount.getSectionID());
		s5account.SetGrade(80);
		Enrollment s5phys = new Enrollment(s5.getStudentID(), sphys.getSectionID());
		s5phys.SetGrade(90);
		Enrollment s5compsci = new Enrollment(s5.getStudentID(), fphys.getSectionID());
		s5compsci.SetGrade(100);

		Enrollment s6account = new Enrollment(s6.getStudentID(), saccount.getSectionID());
		s6account.SetGrade(80);
		Enrollment s6phys = new Enrollment(s6.getStudentID(), sphys.getSectionID());
		s6phys.SetGrade(90);
		Enrollment s6compsci = new Enrollment(s6.getStudentID(), fphys.getSectionID());
		s6compsci.SetGrade(100);

		Enrollment s7account = new Enrollment(s7.getStudentID(), saccount.getSectionID());
		s7account.SetGrade(80);
		Enrollment s7phys = new Enrollment(s7.getStudentID(), sphys.getSectionID());
		s7phys.SetGrade(90);
		Enrollment s7compsci = new Enrollment(s7.getStudentID(), fphys.getSectionID());
		s7compsci.SetGrade(100);

		Enrollment s8account = new Enrollment(s8.getStudentID(), saccount.getSectionID());
		s8account.SetGrade(80);
		Enrollment s8phys = new Enrollment(s8.getStudentID(), sphys.getSectionID());
		s8phys.SetGrade(90);
		Enrollment s8compsci = new Enrollment(s8.getStudentID(), fphys.getSectionID());
		s8compsci.SetGrade(100);

		Enrollment s9account = new Enrollment(s9.getStudentID(), saccount.getSectionID());
		s9account.SetGrade(80);
		Enrollment s9phys = new Enrollment(s9.getStudentID(), sphys.getSectionID());
		s9phys.SetGrade(90);
		Enrollment s9compsci = new Enrollment(s9.getStudentID(), fphys.getSectionID());
		s9compsci.SetGrade(100);

		Enrollment s10account = new Enrollment(s10.getStudentID(), saccount.getSectionID());
		s10account.SetGrade(80);
		Enrollment s10phys = new Enrollment(s10.getStudentID(), sphys.getSectionID());
		s10phys.SetGrade(90);
		Enrollment s10compsci = new Enrollment(s10.getStudentID(), fphys.getSectionID());
		s10compsci.SetGrade(100);
		
		double s1GPA = (((s1account.getGrade() + s1phys.getGrade() + s1compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s1GPA==((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s2GPA = (((s2account.getGrade() + s2phys.getGrade() + s2compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s2GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s3GPA = (((s3account.getGrade() + s3phys.getGrade() + s3compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s3GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s4GPA = (((s4account.getGrade() + s4phys.getGrade() + s4compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s4GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s5GPA = (((s5account.getGrade() + s5phys.getGrade() + s5compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s5GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s6GPA = (((s6account.getGrade() + s6phys.getGrade() + s6compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s6GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s7GPA = (((s7account.getGrade() + s7phys.getGrade() + s7compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s7GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s8GPA = (((s8account.getGrade() + s8phys.getGrade() + s8compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s8GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s9GPA = (((s9account.getGrade() + s9phys.getGrade() + s9compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s9GPA == ((((80 + 90 + 100) / 3) / 20) - 1));
		
		double s10GPA = (((s10account.getGrade() + s10phys.getGrade() + s10compsci.getGrade()) / 3) / 20)
				- 1;
		assertTrue(s10GPA == ((((80 + 90 + 100) / 3) / 20) - 1));

		double accountaverage = (s1account.getGrade() + s2account.getGrade() + s3account.getGrade()
				+ s4account.getGrade() + s5account.getGrade() + s6account.getGrade()
				+ s7account.getGrade() + s8account.getGrade() + s9account.getGrade()
				+ s10account.getGrade()) / 10;
		assert (accountaverage == (80 + 80 + 80 + 80 + 80 + 80 + 80 + 80 + 80 + 80) / 10);

		double physicsaverage = (s1phys.getGrade() + s2phys.getGrade() + s3phys.getGrade()
		+ s4phys.getGrade() + s5phys.getGrade() + s6phys.getGrade()
		+ s7phys.getGrade() + s8phys.getGrade() + s9phys.getGrade()
		+ s10phys.getGrade()) / 10;
		assert (physicsaverage == (90 + 90 + 90 + 90 + 90 + 90 + 90 + 90 + 80 + 90) / 10);

		double compsciaverage = (s1compsci.getGrade() + s2compsci.getGrade() + s3compsci.getGrade()
		+ s4compsci.getGrade() + s5compsci.getGrade() + s6compsci.getGrade()
		+ s7compsci.getGrade() + s8compsci.getGrade() + s9compsci.getGrade()
		+ s10compsci.getGrade()) / 10;
		assert (compsciaverage == (100 + 100 + 100 + 100 + 100 + 100 + 100 + 100 + 100 + 100) / 10);

		eMajor olds7 = s7.getMajor();
		s7.setMajor(eMajor.CHEM);
		assert (olds7 != s7.getMajor());
	}
}