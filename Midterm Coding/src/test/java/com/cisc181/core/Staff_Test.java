package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import java.util.GregorianCalendar;
import com.cisc181.core.PersonException;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException{
		Staff smem1 = new Staff("Nonso", "Christopher", "Iwu", new Date(0, 0, 0), "222 Somewhere Street", "3029812706",
				"nonsoiwu@udel.edu", "Monday 12pm", 5, 37000, new Date(0, 0, 0), eTitle.MR);
		Staff smem2 = new Staff("No", "bo", "dy", new Date(0, 0, 0), "19 Flinthill Street", "7777777777",
				"empty@gmail.com", "Tuesday 1am", 5, 45000, new Date(0, 0, 0), eTitle.MRS);
		Staff smem3 = new Staff("The", "Other", "Me", new Date(0, 0, 0), "19 Flinthill Street", "1111111111",
				"nonsoiwu@yahoo.com", "Wednesday 2pm", 5, 98000, new Date(0, 0, 0), eTitle.MR);
		Staff smem4 = new Staff("Ugochukwu", "Samuel", "Okonkwo", new Date(0, 0, 0), "19 Flinthill Street", "1234567890",
				"afrikan@gmail.com", "Thursday 3am", 5, 250, new Date(0, 0, 0), eTitle.MR);
		Staff smem5 = new Staff("Cant", "Think", "Anymore", new Date(0, 0, 0), "19 Flinthill Street", "0987654321",
				"stopthemadness@gmail.com", "Friday 4pm", 5, 77700, new Date(0, 0, 0), eTitle.MS);
		
		   ArrayList<Staff> staffmembers = new ArrayList<Staff>();
		     staffmembers.add(smem1);
		     staffmembers.add(smem2);
		     staffmembers.add(smem3);
		     staffmembers.add(smem4);
		     staffmembers.add(smem5);
		     
	double expect=51590;
	double average = (smem1.getSalary() + smem2.getSalary() + smem3.getSalary() + smem4.getSalary()
				+ smem5.getSalary()) / 5;
	
	assert (expect == average);
	}
	
	@Test
	public void testPhoneNumber() {
		try {
			Class<?> c = Class.forName("com.cisc181.core.Staff");
			Object use = c.newInstance();
			Method methodforPhone = c.getDeclaredMethod("Phone", null);

			Object Phone = methodforPhone.invoke(use, null);

			String suppose = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
			Pattern pattern = Pattern.compile(suppose);
			Boolean answer = Pattern.matches(suppose, (CharSequence) Phone);

			assert (answer);
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDOB(){
		try {
			Class<?> c = Class.forName("com.cisc181.core.Staff");
			Object use = c.newInstance();
			Method methodforDOB = c.getDeclaredMethod("DOB", null);

			Object objectforDOB = methodforDOB.invoke(use, null);

			Date currentDate = new Date(0);
			assert(((Date) objectforDOB).getDate() != currentDate.getDate()+100);
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}

	

