package project1;

public class Course implements Comparable <Course> {
   private  boolean isGraduateCourse;
   private int courseNum;
   private String courseDept;
   private int numCredits;
   
   public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
	   this.isGraduateCourse = isGraduateCourse;
	   this.courseNum = courseNum;
	   this.courseDept = courseDept;
	   this.numCredits = numCredits;
	   }
   public boolean isGraduateCourse() {
	  return this.isGraduateCourse;                                     
   }
   public int getCourseNum() {
	   return this.courseNum;
   }
   public String getCourseDept() {                 
	   return this.courseDept;
   }
   public int getNumCredits() {
	  return this.numCredits;
  }
   public String getCourseName() {     
	   if(this.isGraduateCourse)                                       //PROBLEM FIX IT
	   return "G".concat(courseDept + courseNum);  
	   else
		return "U".concat( courseDept + courseNum);
   }
   public boolean equals(Object o) {
	   if( o instanceof Course)
	   {
		   Course c = (Course)o;
		    if(this.isGraduateCourse == c.isGraduateCourse && this.courseNum == c.courseNum)
		    	{
		    	    if(this.numCredits==c.numCredits && this.courseDept.equals(c.courseDept))
		    	    {
		    	    	return true;
		    	    }
		    }
		   
	   }
	   
	   return false;
   }
   
   public String toString() { 
	   String s="";                                      //F
	   if(this.isGraduateCourse)
		   s = "Graduate";
	   else
		   s = "Undergraduate";
	   return String.format("Course: %3s-%3d | Number of Credits: %02d | %s", courseDept, courseNum, numCredits,s);
   }
@Override
  public int compareTo(Course c) {
	
	if(this.courseNum > c.courseNum)
		return 1;
	else if(this.courseNum < c.courseNum)
		return -1;
	else
		return 0;
	
	
}
   
   
   
   
   
   
   
   
   
   
   
   
}
