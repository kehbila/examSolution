package examSolution.co.za;
import java.util.Scanner;

public class Student extends Person {
	private static int studentNumber;
	public void setStudentNumber(int studentNumber) {
		Student.studentNumber = studentNumber;}
		
		public int getStudentNumber() {
			return Student.studentNumber;}
	
	
	public static void main(String[] args) {
		
		
			
		
		Person p = new Person();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Full Names");
		p.setName(sc.toString());
				
		System.out.println("Enter your age");
		p.setAge(sc.nextInt());
		
		System.out.println("Enter idNumber");
		p.setIdNumber(sc.nextInt());
		
		System.out.println("Enter student number");
		studentNumber = sc.nextInt();
		sc.close();
		
				
				
				
				
		
		

	}

}
