// Hannah McBeth
public class StudentReport {

	public static void main(String[] args) {
		
		// Variable Declarations
		String reportName = "STUDENT REPORT";
		String studentName = "Bob Smith";
		int studentAge = 20;
		double GPA = 3.52;
		String studentMajor = "Biology";
		String studentClass = "Sophomore";
		
		//Output
		System.out.println("===============================");
		System.out.println(reportName);
		System.out.println("===============================");
		System.out.println("Student Name:   " + studentName);
		System.out.print("Age: " + studentAge);
		System.out.printf("\t\tGPA: %5.2f\n", GPA);
		System.out.println("Major: " + studentMajor);
		System.out.println("Class: " + studentClass);		
		System.out.println("===============================");
	}

}
