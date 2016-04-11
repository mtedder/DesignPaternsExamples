package com.gc.mvc;
/*
 * Ref: http://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
 */
public class StudentView {
	   public void printStudentDetails(String studentName, String studentRollNo){
	      System.out.println("Student: ");
	      System.out.println("Name: " + studentName);
	      System.out.println("Roll No: " + studentRollNo);
	   }
	}
