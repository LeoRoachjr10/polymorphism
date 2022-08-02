
package com.Methodoverloading.demo;

public class Student_Details {

	public void student_Data(String first_name, String last_name) {
		System.out.println("student name=" + first_name);
		System.out.println("student name=" + last_name);
	}

	public void student_Data(int age) {
		System.out.println("student age:" + age);

	}

	public void student_Data(String gender) {
		System.out.println("student gender=" + gender);

	}

	public void student_Data(String address,int pincode) {
		System.out.println("student address="+address);
		System.out.println("student pincode="+pincode);
		

	}

	public void student_Data(int fees,int pendingfees) {
		System.out.println("student fees="+ fees);
		System.out.println("studentpending fees="+ pendingfees);

	}
	

	public void student_Data(String fathername,char initial) {
		System.out.println("father name="+ fathername);
		System.out.println("initial="+ initial);
		

	}

	public void student_Data(long accnumber) {
		System.out.println("accnumber="+ accnumber);

	}
	public static void main(String[] args) {
		
		Student_Details details = new Student_Details();
		
		details.student_Data("LEO", "roach");
		details.student_Data(27);
		details.student_Data("male");
		details.student_Data("fathima nagar", 613001);
		details.student_Data(20000, 10000);
		details.student_Data("john peter", 'j');
		details.student_Data(123344455566l);
		
		
	}
	
	
	
	
	
}
