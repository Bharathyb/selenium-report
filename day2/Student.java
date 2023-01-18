package week3.day2;

public class Student extends Department {
public void studentName() {
	System.out.println("Name:Bharathy");
	
}public void studentDept() {
	System.out.println("studying in computer science department");
	
}public void studentId() {
	System.out.println("Student Id:123");
}
public static void main(String[] args) {
	Student getdetails=new Student();
	getdetails.collegeName();
	getdetails.collegeCode();
	getdetails.collegeRank();
	getdetails.deptName();
	getdetails.studentName();
	getdetails.studentDept();
	getdetails.studentId();
}
}
