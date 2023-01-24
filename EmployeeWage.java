package com.blz.day8;

public class EmployeeWage {

    public static int isPartTime = 1;
    public static int isFullTime = 2;
    public static int empPerHour = 20;
    public static int EMP_RATE_PER_HOUR = 20;
    public static int empHrs = 0;
    public static int empWage = 0;

    private static double empCheck = (double) (Math.floor(Math.random() * 10) % 2);

    public static void employeeWage() {
        if (empCheck == isPartTime) {
            empHrs = 4;
        } else if (empCheck == isFullTime) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.printf("Employee Wage is" + empWage);
    }

    public static void main(String[] args) {
        employeeWage();
    }
}

