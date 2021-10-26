package AssociateExample2Assess;


public class MainStudentInfo {

	public static void main(String[] args) {
		UnderGraduate ug1=new UnderGraduate();
		ug1.setName("Neelakshi");

		ug1.setRollNo(1);
		ug1.setCity("Delhi");

		ug1.studentDetails();

		ug1.undergraduateStudentBranch();

		ug1.undergraduateStudentSociety();

		UnderGraduate ug2=new UnderGraduate();
		ug2.setName("Manidhar"); 
		ug2.setRollNo(2);
		ug2.setCity("Hyderabad");
		ug2.studentDetails();

		ug2.undergraduateStudentSociety();

	}

}
