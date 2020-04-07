package project1;

public class Driver_test {

	public static void main(String[] args) {
	      //boolean isGraduateCourse, int courseNum, String courseDept, int numCredits
		/*Course c1 = new Course(true, 168, "CS", 4);
		Course c2 = new Course(true, 334, "CS", 4);
		Course c3 = new Course(true, 121, "ENG", 4);
		String s11= c1.getcourseDept();
		System.out.println(s11);
		
		//System.out.println(c3.getCourseName());
		//System.out.println(c1.isGraduateCourse());
		//System.out.println(c2.isGraduateCourse());
		
		//System.out.println(c3.toString());         //prb
		//System.out.println(c1.equals(c2));
		//System.out.println(c1.compareTo(c3));
		
		
		//--------------------------------------------
		//public Faculty(String name, int birthYear, String deptName, boolean isTenured) 
		Faculty f1 = new Faculty("Sofianos",1986,"CS",true);
		Faculty f2 = new Faculty("Alpern",1970,"CS",true);
		Faculty f3 = new Faculty("Bailey",1960,"ENG",true);
		
		//public GeneralStaff(String name, int birthYear, String deptName, String duty)
		GeneralStaff gs1 = new GeneralStaff("Wiku", 1970,"CS", "instructor");
		GeneralStaff gs2 = new GeneralStaff("Mike", 1970,"CS", "instructor");
		GeneralStaff gs3 = new GeneralStaff("Shanon", 1986,"CS", "advisor");
		
		//public Student(String name, int birthYear, String major, boolean isGraduate)*/
		Course c1 = new Course(true, 168, "CS", 4);
		Course c2 = new Course(true, 334, "CS", 4);
		Course c3 = new Course(true, 121, "ENG",4);
		Student s = new Student();
		Student s1 = new Student("Ala",1996,"CS",false);
		Student s2 = new Student("Shanta",1996,"CS",false);
		Student s3 = new Student("Sabbo",1996,"CS",true);
		s1.addCourseTaken(c1);
		//s1.addCourseTaken(c2);
		//System.out.println(s1.getNumCoursesTaken());
		
		
		s2.addCourseTaken(c2);
		s2.addCourseTaken(c1);
		
		//System.out.println(s2.getNumCoursesTaken());
		
		System.out.println(s1.compareTo(s2));
		/*Course []courseTaught = {c1,c2};
		Course []courseTaken = {c1,c2};
		f1.addCoursesTaught(courseTaught);
		s1.addCoursesTaken(courseTaken);
		
		System.out.println(f1.getCourseTaught(0));
		System.out.println(f1.getAllCoursesTaughtAsString());
		System.out.println(s1.getCourseTaken(0));
		System.out.println(s1.getCourseTakenAsString(0));
		System.out.println(s1.getAllCoursesTakenAsString());
		//System.out.println(s1.getCourseTaken(4));
		//-------------------------
		System.out.println(f1.compareTo(f2));*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
