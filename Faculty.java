package project1;

import java.util.Arrays;

public class Faculty extends Employee {
	private Course [] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	
	public Faculty() {	// coursesTaught = [], numCoursesTaught = 0, isTenured = false
      coursesTaught = new Course[100];
      numCoursesTaught = 0;
      isTenured = false;
	}
	public Faculty(boolean isTenured) {
		 coursesTaught = new Course[100];
	      numCoursesTaught = 0;
	      this.isTenured = isTenured;
		
	}
	
	public Faculty(String deptName, boolean isTenured) {
		super(deptName);
		coursesTaught = new Course[100];
	    numCoursesTaught = 0;
	    this.isTenured = isTenured;
		
	}
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name, birthYear, deptName);
		coursesTaught = new Course[100];
	    numCoursesTaught = 0;
	    this.isTenured = isTenured;
		
	}
	public boolean isTenured() {
		return this.isTenured;
	}
	public int getNumCoursesTaught() {
		return this.numCoursesTaught;
	}
	public void setIsTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	public void addCourseTaught(Course course) {
		if(numCoursesTaught < 100)
		{
			coursesTaught[numCoursesTaught++] = course;
		}
		
	}
	
	public void addCoursesTaught(Course[] course) {
		
	      if(numCoursesTaught < 100) {
			for(int i = 0 ; i<course.length; i++)
			{
				coursesTaught[numCoursesTaught++] = course[i];           //F
				if(numCoursesTaught >= 100) break;             //break if more thn 100
			}
		}
		
	}
	
	public Course getCourseTaught(int index) {

		if(index >= 0 && index < numCoursesTaught)
		{
			return coursesTaught[index];
			
		}
		else
			
	        return null;
		
	}
	
	public String getCourseTaughtAsString(int index) {
		String s;
		if(index >= 0 && index < numCoursesTaught)
		{
			s = coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
			return s;
		}
		else
			return "";
	}
	public String getAllCoursesTaughtAsString() {
		String result="";
		for(int i =0 ; i<numCoursesTaught ; i++)
		{
			if(i != numCoursesTaught -1)                      //nt the last index
			    result += getCourseTaughtAsString(i) +",";
			else
				result += getCourseTaughtAsString(i);           //last index
		}
		return result;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Faculty)
		{
			Faculty f = (Faculty) o;
			if(super.equals(f))
			{
				if(this.isTenured == f.isTenured && this.numCoursesTaught == f.numCoursesTaught)
				{
					if(Arrays.equals(this.coursesTaught, f.coursesTaught))         //array check
						return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		String s = "";
		if(this.isTenured) 
			s = "Is Tenured";
		else
			s = "Not Tenured";
		return super.toString()+
				String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", s , numCoursesTaught,
                        getAllCoursesTaughtAsString());
	}
	
	public int compareTo(Person p) {
	
		int res;
		if(p instanceof Faculty) {
		Faculty f = (Faculty) p;                  //down casting (parent cls -> child cls)
		if(this.numCoursesTaught > f.numCoursesTaught)
			return 1;
		else if(this.numCoursesTaught < f.numCoursesTaught)
			return -1;
		else
			return 0;
		}
		else
			res = super.compareTo(p);
		return res;
	
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
