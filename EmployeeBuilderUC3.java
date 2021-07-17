package com.employeebuilderuc1;

public class EmployeeBuilderUC3 {

	public static void main(String[] args) {
		System.out.println("Welcome Employee Daily Wage");
		//constants
		int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
       //VARAIBLE
       int empHrs = 0;
       int empWage = 0;
        //COMPUTATION
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME)
        	empHrs = 8;
        	else if (empCheck == IS_PART_TIME)
            empHrs = 4;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empWage);
	}
	

}
