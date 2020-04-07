package project1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User_Menu {
	
	
	public void writeToFile(String New_fileName, String contents){
	       PrintWriter outputs=null;//use the PrintWriter to create our output stream
	       try {
	           outputs = new PrintWriter(New_fileName);//create & connect the output stream to the file using the String fileName
	           outputs.println(contents);//write the String to the file
	           System.out.println("Successfully wrote to the file "+New_fileName);      
	       } catch (FileNotFoundException e) {
	         
	           System.out.println("An Exception occured "+e.getMessage());
	       }
	       finally{
	           if(outputs != null){//if not closed
	               outputs.close(); //close it
	           }
	           
	       }
	   }
	
	
	
	
	
	
	
	
	
	public void create_user_menu(Scanner sc,Course []courses, Student []student, Faculty []faculty, GeneralStaff []generalstaff)
	{
		String content="";
		int Course_c = 0;
		int Faculty_c = 0;
		int Genstf_c = 0;
		int Student_c = 0;
		content += "User Menu Information:\n";
		content +=  "***********************************************************************************"+"\n";
		/*Course [] courses = new Course[3];
		Faculty [] faculty = new Faculty[3];
		GeneralStaff [] generalstaff = new GeneralStaff[3];
		Student [] student = new Student[3];*/
		
		int i_c = 6, f_c = 4, g_c = 4, st_c = 4;
		String scan = sc.nextLine(); //getting the input to continue

		while(!scan.equals("q") && (scan.equals("c"))){   
			try { 
				if(Course_c >= 3 && Faculty_c >= 3 && Genstf_c >= 3 && Student_c >= 3) {
					   content +=  "***********************************************************************************"+"\n";
					   System.out.println("\n\n========================================You have created all the objects=======================================");
					 	break;
					 	}
			  
			  System.out.println("Which class object you want to create: ");
		      Scanner obj = new Scanner(System.in);
		      String obj_c = obj.nextLine();
		      
		      if(obj_c.equals("Course") && Course_c >= 3)
		      {
		    	  System.out.println("You have already created 3 objects for Course class.");
		      }
		      if(obj_c.equals("Faculty") && Faculty_c >= 3)
		      {
		    	  System.out.println("You have already created 3 objects for Faculty class.");
		      }
		      if(obj_c.equals("GeneralStaff") && Genstf_c >= 3)
		      {
		    	  System.out.println("You have already created 3 objects for GeneralStaff class.");
		      }
		      if(obj_c.equals("Student") && Student_c >= 3)
		      {
		    	  System.out.println("You have already created 3 objects for Student class.");
		      }
		       
		       while(obj_c.equals("Course") && Course_c < 3) { //boolean isGraduateCourse, int courseNum, String courseDept, int numCredits)
		    	  System.out.println("Enter Course info "+(Course_c+1)+":");
		    	  System.out.println("Enter Course Graduate/Undergraduate(true/false), CourseNumber, CourseDept & NumCredits: ");
		    	  String val1 = obj.nextLine();
		    	  String val2 = obj.nextLine();
		    	  String val3 = obj.nextLine();
		    	  String val4 = obj.nextLine();
		    	  Boolean isG = Boolean.parseBoolean(val1);
		    	  int cNum = Integer.parseInt(val2);
		    	  int numCr = Integer.parseInt(val4);
		    	  
		    	  Course c = new Course(isG,cNum,val3,numCr);
		    	  System.out.println(c.toString());
		    	  courses[i_c++] = c;
		    	  Course_c++;
		    	  content += c.toString() +"\n";
		      }
		       
		       //System.out.println("\n"+Arrays.toString(courses)) ;   
		       while(obj_c.equals("Faculty") && Faculty_c < 3 ) {
		    	   System.out.println("Faculty info "+(Faculty_c+1)+":");
		    	   System.out.println("How many inputs for Faculty class: ");
		    	   int count = obj.nextInt();
		    	   Scanner fobj = new Scanner(System.in);
		    	   if(count == 0) {
			    	   Faculty f = new Faculty();
			    	   System.out.println(f.toString());
			    	   Faculty_c++;
			    	   faculty[f_c++] = f;
			    	   content += f.toString() + "\n";
			    	   }
		    	   if(count == 1) {
		           System.out.println("Enter Faculty isTenure/Tenure (true/false): ");
		    	   String f_val1 = fobj.nextLine();
		    	   Boolean isT = Boolean.parseBoolean(f_val1);
		    	   Faculty f1 = new Faculty(isT);
		    	   System.out.println(f1.toString());
		    	   Faculty_c++;
		    	   faculty[f_c++] = f1;
		    	   content += f1.toString() +"\n";
		    	   }
		    	   if(count == 2) { //String deptName, boolean isTenured
		    		   System.out.println("Enter Faculty Dept.Name & isTenure/Tenure (true/false) :"); 
		    		  String deptN = fobj.nextLine();
		    		  String f_val2 = fobj.nextLine();
			    	  Boolean isT1 = Boolean.parseBoolean(f_val2);
			    	  Faculty f2 = new Faculty(deptN,isT1);
			    	  System.out.println(f2.toString());
			    	   Faculty_c++;
			    	   faculty[f_c++] = f2;
			    	   content += f2.toString()+"\n";
		    	   }
		    	   if(count == 4) { //(String name, int birthYear, String deptName, boolean isTenured)
		    		      System.out.println("Enter Faculty Name, Birthyear, Dept.Name & isTenure/Tenure (true/false) :"); 
		    		      String f_name = fobj.nextLine();
		    		      String b_yr = fobj.nextLine();
		    		      int f_byr = Integer.parseInt(b_yr);
		    		      String deptN1 = fobj.nextLine();
			    		  String f_val3 = fobj.nextLine();
				    	  Boolean isT2 = Boolean.parseBoolean(f_val3);
				    	  Faculty f3 = new Faculty(f_name,f_byr, deptN1,isT2);
				    	  System.out.println(f3.toString());
				    	   Faculty_c++;
				    	   faculty[f_c++] = f3;
				    	   content += f3.toString() +"\n";
			    	   }
		    	   
		    	   }
		           //System.out.println("\n"+Arrays.toString(faculty)) ; 
		           
		       while(obj_c.equals("GeneralStaff") && Genstf_c < 3 ) {
		    	   int g_Count;
		    	   System.out.println("GeneralStaff info "+(Genstf_c+1)+":");
		    	   System.out.println("How many inputs for GeneralStaff class: ");
		    	   Scanner gobj = new Scanner(System.in);
		    	   g_Count = gobj.nextInt();
		    	   Scanner gsc = new Scanner(System.in);
		    	   if(g_Count == 0) {
		    		   GeneralStaff gs1 = new GeneralStaff();
		    		   System.out.println(gs1.toString());
		    		   Genstf_c++;
		    		   generalstaff[g_c++] = gs1;
		    		   content += gs1.toString() +"\n";
		    	   }
		    	   
		    	   if(g_Count == 1) {  //String d) 
		    		   System.out.println("Enter GeneralStaff duty:"); 
		    		   String d = gsc.nextLine();
		    		   GeneralStaff gs2 = new GeneralStaff(d);
		    		   System.out.println(gs2.toString());
		    		   Genstf_c++;
		    		   generalstaff[g_c++] = gs2;
		    		   content += gs2.toString()+"\n";
		    	   }
		    	   if(g_Count == 2) { //String deptName, String duty)
		    		   System.out.println("Enter GeneralStaff DeptName & Duty:"); 
		    		   String gdept = gsc.nextLine();
		    		   String duty = gsc.nextLine();
		    		   GeneralStaff gs3 = new GeneralStaff(gdept, duty);
		    		   System.out.println(gs3.toString());
		    		   Genstf_c++;
		    		   generalstaff[g_c++] = gs3;
		    		   content += gs3.toString() +"\n";
		    	   }
		           if(g_Count == 4) { //String name, int birthYear, String deptName, String duty
		        	   System.out.println("Enter GeneralStaff Name, BirthYear, DeptName & Duty:"); 
		        	   String g_name = gsc.nextLine();
		        	   String byr = gsc.nextLine();
		        	   int g_byr = Integer.parseInt(byr);
		        	   String g_dpt = gsc.nextLine();
		        	   String g_duty = gsc.nextLine();
		        	   GeneralStaff gs4 = new GeneralStaff(g_name,g_byr,g_dpt,g_duty);
		        	   System.out.println(gs4.toString());
		        	   Genstf_c++;
		        	   generalstaff[g_c++] = gs4;
		        	   content += gs4.toString() +"\n";
		        }
		       }
		              //System.out.println("\n"+Arrays.toString(generalstaff));
		           while(obj_c.equals("Student") &&  Student_c < 3 ) {
		        	   
		        	   int s_Count;
		        	   System.out.println("Student info "+(Student_c+1)+":");
			    	   System.out.println("How many inputs for Student class: ");
		        	   Scanner std_c = new Scanner(System.in);
		        	   s_Count = std_c.nextInt();
		        	   Scanner std_obj = new Scanner(System.in);
		        	   if(s_Count == 0)
		        	   {
		        		   Student s1 = new Student();
		        		   System.out.println(s1.toString());
		        		   Student_c++;
		        		   student[st_c++]= s1;
		        		   content += s1.toString() +"\n";
		        	   }
		        	   if(s_Count == 1) //(boolean isGraduate)
		        	   {
		        		   System.out.println("Enter Student Graduate/UnderGraduate (true/false):"); 
		        		   String sG = std_obj.nextLine();
		        		   Boolean s_isG = Boolean.parseBoolean(sG);
		        		   Student s2 = new Student(s_isG);
		        		   System.out.println(s2.toString());
		        		   Student_c++;
		        		   student[st_c++]= s2;
		        		   content += s2.toString() +"\n";
		        	   }
		        	   if(s_Count == 2)   //(String major, boolean isGraduate)
		        	   {
		        		   System.out.println("Enter Student Major & Graduate/UnderGraduate (true/false):");
		        		   String s_majr = std_obj.nextLine();
		        		   String s_isG = std_obj.nextLine();
		        		   Boolean s_isG1 = Boolean.parseBoolean(s_isG);
		        		   Student s3 = new Student(s_majr, s_isG1);
		        		   System.out.println(s3.toString());
		        		   Student_c++;
		        		   student[st_c++]= s3;
		        		   content += s3.toString() +"\n";
		        	   }
		        	   
		        	   if(s_Count == 4) { //String name, int birthYear, String major, boolean isGraduate)
		        		   System.out.println("Enter Student Name, BirthYear, Major & Graduate/UnderGraduate (true/false):");
		        		   String s_name = std_obj.nextLine();
		        		   String s_byr = std_obj.nextLine();
		        		   int std_byr = Integer.parseInt(s_byr);
		        		   String s_majr2 = std_obj.nextLine();
		        		   String s_isG2 = std_obj.nextLine();
		        		   Boolean std_isG2 = Boolean.parseBoolean(s_isG2);
		        		   Student s4 = new Student(s_name,std_byr,s_majr2,std_isG2);
		        		   System.out.println(s4.toString());
		        		   Student_c++;
		        		   student[st_c++]= s4;
		        		   content += s4.toString() +"\n";
		        	             }
		        	   }
		           
		                  // System.out.println("\n"+Arrays.toString(student));
		           }  
		       
		    catch(InputMismatchException e)
			{
				System.out.println("You got input wrong "+e.getMessage());
			}
			catch(Exception ex)
			{
				System.out.println("An exceoption occured "+ex.getMessage());
			}
		}                //NEXT STEP
		    
		   
		try {
			System.out.println("=================================================Next Step==================================================");
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("All (7) Faculty info: ");
			for(int k = 0 ; k <faculty.length ;k++)
			{
				System.out.println("Faculty"+(k+1)+":\n"+faculty[k].toString());
			}
			
			System.out.println("Choose a faculty to add courses to? ");
			Scanner whf = new Scanner(System.in);
			int i = whf.nextInt();
		    Faculty faculty1;
		    faculty1 = faculty[i-1];
		    
		    Course c1,c2;
		    int j,k;
		    Scanner whc = new Scanner(System.in);
		    System.out.println("----------------------------------------------------------------------------------------------------------");
		    System.out.println("All (9) Course info: ");
		    for(int k1 =0 ; k1 <courses.length; k1++)
		    {
		    	System.out.println("Course"+(k1+1)+":\n"+courses[k1].toString());
		    }
		    System.out.println("Which  two courses to add to faculty("+i+")?");
		    j = whc.nextInt();
		    k= whc.nextInt();
		    c1 = courses[j-1];
		    c2 = courses [k-1];
		    faculty1.addCourseTaught(c1);
		    faculty1.addCourseTaught(c2);
		    
            System.out.println("The faculty "+faculty1.getName()+" teaches "+faculty1.getAllCoursesTaughtAsString());
            content+= "The faculty "+faculty1.getName()+" teaches "+faculty1.getAllCoursesTaughtAsString() +"\n";
            content +=  "***********************************************************************************"+"\n";
			  
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Student (7) info: ");
            for(int s1=0; s1<student.length; s1++)
            {
            	System.out.println("Student"+(s1+1)+":\n"+student[s1].toString());
            }
            
            System.out.println("Choose a Student to add courses?");
            Scanner whs = new Scanner(System.in);
            int student_i = whs.nextInt();
            Student s1;
            s1 = student[student_i-1];
            
            System.out.println("All (9) course info: ");
		    for(int k1 =0 ; k1 <courses.length; k1++)
		    {
		    	System.out.println("Course"+(k1+1)+":\n"+courses[k1].toString());
		    }
		    System.out.println("Which two courses to add to student("+student_i+")?");
            Scanner whs_c = new Scanner(System.in);
            int wh_c1 = whs_c.nextInt();
            int wh_c2 = whs_c.nextInt();
            Course s_c1, s_c2;
            s_c1 = courses[wh_c1-1];
            s_c2 = courses[wh_c2-1];
            s1.addCourseTaken(s_c1);
            s1.addCourseTaken(s_c2);
            System.out.println("The student "+s1.getName()+" has taken "+s1.getAllCoursesTakenAsString());
            content += "The student "+s1.getName()+" has taken "+s1.getAllCoursesTakenAsString() +"\n";
            content +=  "***********************************************************************************"+"\n";
			  
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("All (7) faculty info: ");
            for(int k1 = 0 ; k1 <faculty.length ;k1++)
         	{
         	 System.out.println("Faculty"+(k1+1)+":\n"+faculty[k1].toString());
         	}
            System.out.println("Choose a faculty to add an array of 2 courses?");
            Scanner srr = new Scanner(System.in);
            int fsrr = srr.nextInt();
            Faculty fs1;
            fs1 = faculty[fsrr-1];
           
            Course fac_co1 = new Course(true,545,"HIS",3);
            Course fac_co2 = new Course(false,455,"MAT",3);
            Course [] fcourses = {fac_co1, fac_co2}; 
            fs1.addCoursesTaught(fcourses);
            System.out.println("The faculty "+fs1.getName()+" is teaching "+fs1.getAllCoursesTaughtAsString());
            content += "The faculty "+fs1.getName()+" is teaching "+fs1.getAllCoursesTaughtAsString() +"\n";
            content +=  "***********************************************************************************"+"\n";
			  
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Student(7) info: ");
            for(int s11=0; s11<student.length; s11++)
            {
            	System.out.println("Student"+(s11+1)+":\n"+student[s11].toString());
            }
            
            
            System.out.println("Choose a student to add an array of 2 courses?");
            int s_arr = srr.nextInt();
            Student sr1;
            sr1 = student[s_arr-1];
            sr1.addCoursesTaken(fcourses);
            System.out.println("The student "+sr1.getName()+" is taking "+sr1.getAllCoursesTakenAsString());
            content += "The student "+sr1.getName()+" is taking "+sr1.getAllCoursesTakenAsString() +"\n";
            content +=  "***********************************************************************************"+"\n";
			  
            System.out.println("Check if faculty "+fs1.getName()+ " takes the course at the index?"+"\n"+"Enter index:");
            int ind = srr.nextInt();
            System.out.println("Course at index "+ind+" taken by the faculty "+fs1.getName()+" : "+fs1.getCourseTaught(ind));
            content += "Course at index "+ind+" taken by faculty "+fs1.getName()+" : "+fs1.getCourseTaught(ind) +"\n";
            content +=  "***********************************************************************************"+"\n";
			  
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Check from student "+sr1.getName()+ " takes the course at the index?"+"\n"+"Enter index:");
            int s_ind = srr.nextInt();
            System.out.println("Course at index "+s_ind+" taken by the student "+sr1.getName()+" : "+sr1.getCourseTaken(s_ind));
            content += "Course at index "+s_ind+" taken by the student "+sr1.getName()+" : "+sr1.getCourseTaken(s_ind) +"\n";
            content +=  "***********************************************************************************"+"\n";
			  
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("All the Faculty & Course info: ");
            for(int i1=0 ; i1<faculty.length; i1++)
            {
            	System.out.println("Faculty"+(i1+1)+":");
            	System.out.println(faculty[i1].toString());
            }
            for(int i2=0 ; i2<courses.length; i2++)
            {
            	System.out.println("Course"+(i2+1)+":");
            	System.out.println(courses[i2].toString());
            }
            System.out.println("Choose a Faculty from the Menu :");
            Scanner ch_f = new Scanner(System.in);
            int user_fac = ch_f.nextInt();
            System.out.println("Choose a Course from the Menu :");
            Scanner ch_c = new Scanner(System.in);
            int user_co = ch_f.nextInt();
            Boolean teach = false;
            System.out.println("Checking if the faculty " +faculty[user_fac-1].getName()+" takes the user chosen course "+courses[user_co-1].getCourseName()+ " from the menu or not :");
            for(int j1=0 ; j1<faculty[user_fac-1].getNumCoursesTaught();  j1++ ) {
            	if(faculty[user_fac-1].getCourseTaught(j1).equals(courses[ user_co-1 ]))
            	{    teach = true;
            		System.out.println("The faculty "+faculty[user_fac-1].getName()+" teaches this course "+courses[user_co-1].getCourseName());
            	    content += "The faculty "+faculty[user_fac-1].getName()+" teaches this course "+courses[user_co-1].getCourseName() +"\n";
            	    content += "***********************************************************************************"+"\n";
					  
            	}
            	
            }
           if(!teach) {
           System.out.println("The faculty "+faculty[user_fac-1].getName()+" does not teach this course "+courses[user_co-1].getCourseName());
           content += "The faculty "+faculty[user_fac-1].getName()+" does not teach this course "+courses[user_co-1].getCourseName() +"\n";
           content += "***********************************************************************************"+"\n";
			  
           }
           System.out.println("----------------------------------------------------------------------------------------------------------");
           Faculty f_most = new Faculty();
           Faculty f_least = new Faculty();
           int max= 0;
           int min = 0;
           for(int f=0 ; f<faculty.length; f++)
           {
        	   if(max < faculty[f].getNumCoursesTaught())
        	   {    
        		   max = faculty[f].getNumCoursesTaught();
        		   f_most = faculty[f];
        		  
        	   }
            }
           for(int f=0 ; f<faculty.length; f++)
           {
           if(min >= faculty[f].getNumCoursesTaught() )
    	   {
    		   min = faculty[f].getNumCoursesTaught();
    		   f_least = faculty[f];
    	   }
           }
         
           System.out.println(f_most.getName()+" teaches the most courses - "+max);
           content += f_most.getName()+" teaches the most courses - "+max +"\n";
           System.out.println("----------------------------------------------------------------------------------------------------------");
         //  System.out.println("The faculty who teaches the least courses:");
           System.out.println(f_least.getName()+" teaches the least courses - "+min);
           content += f_least.getName()+" teaches the least courses - "+min +"\n";
           content +=  "***********************************************************************************"+"\n";
			  
           System.out.println("----------------------------------------------------------------------------------------------------------");
           int s1_sum=0;
           int s2_sum=0;
           int s3_sum=0;
           int s4_sum=0, s5_sum=0, s6_sum=0,s7_sum=0;
           ArrayList <Integer> student_sum = new ArrayList<>();
           for(int si = 0; si < student.length; si++)
           {
        	   if(si == 0)          //std 1
        	   {
        		   for(int si1 = 0; si1< student[si].getNumCoursesTaken(); si1++)
        		   {
        			   s1_sum += student[si].getCourseTaken(si1).getNumCredits();
        			  
        		   }
        		 student_sum.add(s1_sum);
        	   }
        	   if(si == 1)        //std2
        	   {
        		   for(int si2 = 0; si2< student[si].getNumCoursesTaken(); si2++)
        		   {
        			   s2_sum += student[si].getCourseTaken(si2).getNumCredits();
        		   }
        		   student_sum.add(s2_sum);
        	   }
        	   if(si == 2)        //std3
        	   {
        		   for(int si3 = 0; si3< student[si].getNumCoursesTaken(); si3++)
        		   {
        			   s3_sum += student[si].getCourseTaken(si3).getNumCredits();
        		   }
        		   student_sum.add(s3_sum);
        		  
        	   }
        	   if(si == 3)        //std4
        	   {
        		   for(int si4 = 0; si4< student[si].getNumCoursesTaken(); si4++)
        		   {
        			   s4_sum += student[si].getCourseTaken(si4).getNumCredits();
        		   }
        		   student_sum.add(s4_sum);
        	   }
        	   if(si == 4)        //std5
        	   {
        		   for(int si5 = 0; si5< student[si].getNumCoursesTaken(); si5++)
        		   {
        			   s5_sum += student[si].getCourseTaken(si5).getNumCredits();
        		   }
        		   student_sum.add(s5_sum);
        	   }
        	   if(si == 5)        //std6
        	   {
        		   for(int si6 = 0; si6< student[si].getNumCoursesTaken(); si6++)
        		   {
        			   s6_sum += student[si].getCourseTaken(si6).getNumCredits();
        		   }
        		   student_sum.add(s6_sum);
        	   }
        	   if(si == 6)        //std7
        	   {
        		   for(int si7 = 0; si7< student[si].getNumCoursesTaken(); si7++)
        		   {
        			   s7_sum += student[si].getCourseTaken(si7).getNumCredits();
        		   }
        		   student_sum.add(s7_sum);
        	   }
        	   
           }
           int Max_credit = 0;
           int max_index =0;
           int Min_credit = 0;
           int min_index =0;
           System.out.println("----------------------------------------------------------------------------------------------------------");
           System.out.println("The student who has most credits: ");
           Max_credit = Collections.max(student_sum);
           max_index = student_sum.indexOf(Collections.max(student_sum));
           System.out.println("Student id "+student[max_index].getStudentID()+" has maximum credit of " +Max_credit);
		   content += "Student id "+student[max_index].getStudentID()+" has maximum credit of " +Max_credit +"\n";
		   content += "***********************************************************************************"+"\n";
			  
		   System.out.println("----------------------------------------------------------------------------------------------------------");
	       System.out.println("The student who has least credits: ");
		   Min_credit = Collections.min(student_sum);
           min_index = student_sum.indexOf(Collections.min(student_sum));
           System.out.println("Student id "+student[min_index].getStudentID()+" has minimum credit of " +Min_credit);
		   content += "Student id "+student[min_index].getStudentID()+" has minimum credit of " +Min_credit +"\n";
		   content +=  "***********************************************************************************"+"\n";
			  
           
           
           
           
           
           
           /*
           for(int k1 = 0; k1<student.length; k1++)
           {
        	   if()
        	   {
        		   Max_credit = s1_sum;
        		   System.out.println(student[k1].getName()+" has maximum credit of " +Max_credit);
        		   content += student[k1].getName()+" has maximum credit of " +Max_credit +"\n";
        		   break; //no need for 2nd max
        	   }
        	   if(k1 == 1 && s2_sum >= s1_sum && s2_sum >= s3_sum)
        	   {
        		   Max_credit = s2_sum;
        		   System.out.println(student[k1].getName()+" has maximum credit of " +Max_credit);
        		   content += student[k1].getName()+" has maximum credit of " +Max_credit +"\n";
        		   break;
        	   }
        	   if(k1 == 2 && s3_sum >= s1_sum && s3_sum >= s2_sum)
        	   {
        		   Max_credit = s3_sum;
        		   System.out.println(student[k1].getName()+" has maximum credit of " +Max_credit);
        		   content += student[k1].getName()+" has maximum credit of " +Max_credit+"\n";
        		   break;
        	   }
        	   
           
           System.out.println("---------------------------------------------------------------------------");
           System.out.println("The student who has least credits: ");
           for(int k1 = 0; k1<student.length; k1++)
           {
        	   if(k1 == 0 && s1_sum <= s2_sum && s1_sum <= s3_sum)
        	   {
        		   Min_credit = s1_sum;
        		   System.out.println(student[k1].getName()+" has minimum credit of " +Min_credit);
        		   content += student[k1].getName()+" has minimum credit of " +Min_credit +"\n";
        		   break; //no need for 2nd min
        		   
        	   }
        	   if(k1 == 1 && s2_sum <= s1_sum && s2_sum <= s3_sum)
        	   {
        		   Min_credit = s2_sum;
        		   System.out.println(student[k1].getName()+" has minimum credit of " +Min_credit);
        		   content += student[k1].getName()+" has minimum credit of " +Min_credit +"\n";
        		   break;
        	   }
        	   if(k1 == 2 && s3_sum <= s1_sum && s3_sum <= s2_sum)
        	   {
        		   Max_credit = s3_sum;
        		   System.out.println(student[k1].getName()+" has minimum credit of " +Min_credit);
        		   content += student[k1].getName()+" has minimum credit of " +Min_credit +"\n";
        		   break;
        	   }
        	   
           }
          */
           System.out.println("----------------------------------------------------------------------------------------------------------");
           System.out.println("Maximum of Course (determined by course number): ");
           int max_course = 0;
           int min_course = courses[0].getCourseNum();
           Course max_co = null, min_co = null;
           for(int i1=0; i1<courses.length; i1++)
           {
        	   if(max_course < courses[i1].getCourseNum())
        	   {
        		   max_course = courses[i1].getCourseNum();
        		   max_co = courses[i1];
        	   }
        	   if(min_course >= courses[i1].getCourseNum())
        	   {
        		   min_course = courses[i1].getCourseNum();
        		   min_co = courses[i1];
        	   }
           }
           System.out.println(max_co.getCourseName()+" is the maximum course with course number "+max_course);
           content += max_co.getCourseName()+" is the maximum course with course number "+max_course +"\n";
           System.out.println("Minimum of Course (determined by course number): ");
           System.out.println(min_co.getCourseName()+" is the minimum course with course number "+min_course);
           content += min_co.getCourseName()+" is the minimum course with course number "+min_course + "\n";
           content +=  "***********************************************************************************"+"\n";
			  
           System.out.println("----------------------------------------------------------------------------------------------------------");
           }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		 System.out.println("===================================Writing to a file:======================================= ");
		  writeToFile("InfoLog.txt", content); 
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

