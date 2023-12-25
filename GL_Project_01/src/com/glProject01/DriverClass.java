package com.glProject01;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass SuperClass = new SuperClass();
		AdminClass AdminClass = new AdminClass();
		
		System.out.println("Welcome to " + AdminClass.departmentName());
		System.out.println(AdminClass.getTodaysWork());
		System.out.println(AdminClass.getWorkDeadline());
		System.out.println(SuperClass.isTodayAHoliday());

	}

}
