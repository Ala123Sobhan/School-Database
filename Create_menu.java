package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Create_menu {

	public void create_user_menu(Scanner sc)
	{
		int Course_c = 0;
		int Faculty_c = 0;
		int Genstf_c = 0;
		int Student_c = 0;
		
		String scan = sc.nextLine();
		//while(!sc.nextLine().equals("q") )
		//while(!scan.equals("q") && (scan.equals("c")))
		if(!scan.equals("q") && (scan.equals("c")))
		{   
			try {
				   if(Course_c >= 3 && Faculty_c >= 3 && Genstf_c >= 3 && Student_c >= 3) {
					   System.out.println("\n\nNext Step: ");
					   
					   }
		   else	 {  
		      System.out.println("\nWhich class object you want to create: ");
		      Scanner obj = new Scanner(System.in);
		      String obj_c = obj.nextLine();
		      
		      //Checking already 3 objects are created
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
		    	  Course_c++;
		      }
		             
		       while(obj_c.equals("Faculty") && Faculty_c < 3 ) {
		    	   System.out.println("Faculty info "+(Faculty_c+1)+":");
		    	   System.out.println("How many inputs for Faculty class: ");
		    	   int count = obj.nextInt();
		    	   Scanner fobj = new Scanner(System.in);
		    	   if(count == 0) {
			    	   Faculty f = new Faculty();
			    	   System.out.println(f.toString());
			    	   Faculty_c++;
			    	   }
		    	   if(count == 1) {
		           System.out.println("Enter Faculty isTenure/Tenure (true/false): ");
		    	   String f_val1 = fobj.nextLine();
		    	   Boolean isT = Boolean.parseBoolean(f_val1);
		    	   Faculty f1 = new Faculty(isT);
		    	   System.out.println(f1.toString());
		    	   Faculty_c++;
		    	   }
		    	   if(count == 2) { //String deptName, boolean isTenured
		    		   System.out.println("Enter Faculty Dept.Name & isTenure/Tenure (true/false) :"); 
		    		  String deptN = fobj.nextLine();
		    		  String f_val2 = fobj.nextLine();
			    	  Boolean isT1 = Boolean.parseBoolean(f_val2);
			    	  Faculty f2 = new Faculty(deptN,isT1);
			    	  System.out.println(f2.toString());
			    	   Faculty_c++;
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
			    	   }
		    	   
		    	   }
		           
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
		    	   }
		    	   
		    	   if(g_Count == 1) {  //String d) 
		    		   System.out.println("Enter GeneralStaff duty:"); 
		    		   String d = gsc.nextLine();
		    		   GeneralStaff gs2 = new GeneralStaff(d);
		    		   System.out.println(gs2.toString());
		    		   Genstf_c++;
		    	   }
		    	   if(g_Count == 2) { //String deptName, String duty)
		    		   System.out.println("Enter GeneralStaff DeptName & Duty:"); 
		    		   String gdept = gsc.nextLine();
		    		   String duty = gsc.nextLine();
		    		   GeneralStaff gs3 = new GeneralStaff(gdept, duty);
		    		   System.out.println(gs3.toString());
		    		   Genstf_c++;
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
		        	   
		        }
		       }
		           while(obj_c.equals("Student") &&  Student_c < 3 ) {
		        	   
		        	   int s_Count;
		        	   System.out.println("Student info "+(Genstf_c+1)+":");
			    	   System.out.println("How many inputs for Student class: ");
		        	   Scanner std_c = new Scanner(System.in);
		        	   s_Count = std_c.nextInt();
		        	   Scanner std_obj = new Scanner(System.in);
		        	   if(s_Count == 0)
		        	   {
		        		   Student s1 = new Student();
		        		   System.out.println(s1.toString());
		        		   Student_c++;
		        	   }
		        	   if(s_Count == 1) //(boolean isGraduate)
		        	   {
		        		   System.out.println("Enter Student Graduate/UnderGraduate (true/false):"); 
		        		   String sG = std_obj.nextLine();
		        		   Boolean s_isG = Boolean.parseBoolean(sG);
		        		   Student s2 = new Student(s_isG);
		        		   System.out.println(s2.toString());
		        		   Student_c++;
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
		        		   
		        	             }
		        	   
		        	   
		        	   
		        	   
		        	   
		        	   
		        	   
		                  }
		          }  
		       
		       
		   }
		       
		       
		       
		       
		       
		       
		       
	         catch(InputMismatchException e)
			{
				System.out.println(e.getMessage());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
	
	
	
	
}
