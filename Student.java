package project1;

import java.util.Arrays;

public class Student extends Person {
	private static int numStudents;
	private int studentID;
	private Course [] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	public Student() {
		super();
		numStudents++;
		studentID = numStudents;
		numCoursesTaken = 0;      
		coursesTaken = new Course[50];                           //F , nd default size arr, isTenured y
		
}
	public Student(boolean isGraduate) {
		super();
		numStudents++;
		studentID = numStudents;
		numCoursesTaken = 0; 
		coursesTaken = new Course[50];
		this.isGraduate= isGraduate;
		
	}
	public Student(String major, boolean isGraduate){
		super();
		numStudents++;
		studentID = numStudents;
		numCoursesTaken = 0; 
		coursesTaken = new Course[50]  ;
		this.major = major;
		this.isGraduate= isGraduate;
		
	}
	public Student(String name, int birthYear, String major, boolean isGraduate)
	{
		super(name,birthYear);
		numStudents++;
		studentID = numStudents;
		numCoursesTaken = 0; 
		coursesTaken = new Course[50];
		this.major = major;
		this.isGraduate= isGraduate;
		
	}
	public boolean isGraduate() {
		return this.isGraduate;
	}
	public int getNumCoursesTaken() {
		return this.numCoursesTaken;
	}
   public static int getNumStudents() {
	   return numStudents;
   }

   public int getStudentID() {
	   return this.studentID;
   }
   public String getMajor() {      
	  if(major == null)
		  return "undeclared";
	  else
		  return this.major;
	  
   }
   public void setIsGraduate(boolean isGraduate) {
	   this.isGraduate = isGraduate;
   }
   public void setMajor(String major) {
	   this.major = major;
   }
   public void addCourseTaken(Course course) {
		if(numCoursesTaken < 50)
		{
			coursesTaken[numCoursesTaken++] = course;                     ///limit update
		}
		
	}
	public void addCoursesTaken(Course [] course) {
		
	      if(numCoursesTaken < 50) {
			for(int i = 0 ; i<course.length; i++)
			{
				coursesTaken[numCoursesTaken++] = course[i];           //F
				if(numCoursesTaken >= 50) break;             //break if more thn 50
			}
		}
	}      
	      
   public Course getCourseTaken(int index) {
	  		
	  if(index >= 0 && index <numCoursesTaken)
	  {
	  			return coursesTaken[index];
	  }
	  	else
	  		return null;
	  		
	 }
	public String getCourseTakenAsString(int index) {
	  		String s;
	  		if(index >= 0 && index < numCoursesTaken)
	  		{
	  			s = coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
	  			return s;
	  		}
	  		else
	  			return "";
	  }
	public String getAllCoursesTakenAsString() {
	  		String result="";
	  		for(int i =0 ; i<numCoursesTaken ; i++)
	  		{
	  			if(i != numCoursesTaken -1)
	  			result += getCourseTakenAsString(i) +",";
	  			
	  			else
	  				result += getCourseTakenAsString(i);                 //last one
	  		}
	  		return result;
	  	}
   
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			if(super.equals(s))
			{
				if(this.studentID == s.studentID && this.numCoursesTaken == s.numCoursesTaken
						 && this.major.equals(s.major))
				{
					if(Arrays.equals(this.coursesTaken, s.coursesTaken))
				          return true;
				}
			}
		}
		return false;
	}
   
   public String toString() {
	   String s = "";
	   if(this.isGraduate)
		   s = "Graduate";
	   else
		   s = "Undergraduate";
	   return super.toString()+
			   String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, this.getMajor(),s, numCoursesTaken, getAllCoursesTakenAsString() );
   }
   
   public int compareTo(Person p) {  
	

      int res;                                //EXCEPTION---null pointer
	  if(p instanceof Student) {
	   Student s = (Student) p;  
	   int this_count = 0;
	   int new_count  = 0;
	   
	   for(int i = 0 ; i < this.getNumCoursesTaken(); i++)
	   {
		  
		   this_count += coursesTaken[i].getNumCredits();
		 
	   }
	  
	   for(int j = 0 ; j < s.getNumCoursesTaken(); j++)
	   {
		   
		    new_count += s.coursesTaken[j].getNumCredits();
		  
	   }
	   
	   
	   if(this_count > new_count)
			  return 1;                           //FIXIT
		  else if(this_count < new_count) 
			  return -1;
		  else 
			  return 0;
	   
	   
   }
	  else
		  res = super.compareTo(p);
	  return res;
   
	   
   
	
   
   }
   
   
   

}
