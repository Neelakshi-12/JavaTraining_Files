package AssociateExample2Assess;

public class Student {
	private String name;
	private int rollno;
	private String city;
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void studentDetails() {
		System.out.println(" The Student Roll Number is " + rollno + "\n The Name of the Student is "+name + "\n The City of the Student is " + city);
	}

}
