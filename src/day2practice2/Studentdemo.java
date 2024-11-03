package day2practice2;

public class Studentdemo {

	public static void main(String[] args) {
		StudentEntity s1=new StudentEntity();
		StudentEntity s2=new StudentEntity();
		StudentEntity s3=new StudentEntity();
		s1.setSid(44);
		s1.setSname("Sam");
		s1.setGraduationyear(2025);
		s1.setDept("ECE");
		s1.setStream("Bachelor Of Engineering");
		s1.setMobileno("9110332225");
		
		System.out.println(s1);
		
		

	}

}
