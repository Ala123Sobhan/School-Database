package project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Project.Player;

public class Construct_Obj_notdynamic {
	public void construct_object(String fName) throws IOException {
		String fileName = fName;
		BufferedReader filereader = null;
		
		
		int i=0;
		String l1 = "",l2 = "",l3 = "",l4 = "",l5 = "";
		String empty_l1 = "", empty_l2 = "", empty_l3 = "";
		String l6 = "", l7 = "",l8 = "", l9 = "";
		String l10="", l11="", l12="",l13="";
		String l14="", l15="", l16="",l17="", l18="";
		
		 try {
			 filereader = new BufferedReader(new FileReader(fileName));
			 
			 l1 = filereader.readLine();
			 l2 = filereader.readLine();
			 l3 = filereader.readLine();
			 l4 = filereader.readLine();
			 l5 = filereader.readLine();
			 empty_l1 = filereader.readLine();
			 l6 = filereader.readLine();
			 l7 = filereader.readLine();
			 l8 = filereader.readLine();
			 l9 = filereader.readLine();
			 empty_l2 = filereader.readLine();
			 l10 = filereader.readLine();
			 l11 = filereader.readLine();
			 l12 = filereader.readLine();
			 l13 = filereader.readLine();
			 empty_l3 = filereader.readLine();
			 l14 = filereader.readLine();
			 l15 = filereader.readLine();
			 l16 = filereader.readLine();
			 l17 = filereader.readLine();
			 l18 = filereader.readLine();
			
			 if(!l1.isEmpty()) {
	         String []val = l1.split(":");  //val[0] carries course part :
			 
			 String[] fval = val[1].split(","); //val[1] carries everything aftr :
		 
			 
			 //Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits)
			 if(val[0].equals("Course") && fval.length >1) {
			
			 fval[0] = fval[0].trim();          //fval[1] has true with space
			 Boolean val1 = Boolean.parseBoolean(fval[0]);
			 int val2 = Integer.parseInt(fval[1]);
			 String val3 = fval[2];
			 int val4 = Integer.parseInt(fval[3]);
			 
			 Course c = new Course(val1,val2,val3,val4);
			 System.out.println(c.toString());
			 
			 } 
			 
			 }
			 
			 
			   
			    if(!l2.isEmpty()) {
			    String [] line2 = l2.split(":");
			    
				if(line2[0].equals("Faculty") && line2.length <= 1 )
				{
					Faculty f1 = new Faculty();
					System.out.println(f1.toString());
				}
				
			    }
				
				
				if(!l3.isEmpty()) {
				 String [] line3 = l3.split(":");
			 
				 if(line3[0].equals("Faculty")  && line3.length > 1)
				 {
		             String f2val = line3[1].trim();
					 Boolean b = Boolean.parseBoolean(f2val);
					 Faculty f2 = new Faculty(b);
					 System.out.println(f2.toString());
					 
				 }
				 
				} 
			 
			 if(!l4.isEmpty())	{
			 String [] line4 = l4.split(":");
		
			if(line4[0].equals("Faculty") && line4.length > 1)
			 { 
				    String [] f4val = line4[1].split(",");
				    f4val[0]= f4val[0].trim();
				    String deptN = f4val[0];
				    Boolean bt  = Boolean.parseBoolean(f4val[1]);
				 	Faculty f3 = new Faculty(deptN, bt);
				 	System.out.println(f3.toString());
			 }
			 }
			 if(!l5.isEmpty()) {
			 String [] f5val = l5.split(":");
			 if(f5val[0].equals("Faculty") && f5val.length >1)
			 {
				 String [] fv5 = f5val[1].split(",");
				 String fvv5 = fv5[0].trim();
				 int yr = Integer.parseInt(fv5[1]);
				 String dpt = fv5[2];
				 Boolean v = Boolean.parseBoolean(fv5[3]);
				 Faculty f4 = new Faculty(fvv5,yr,dpt,v);
				 System.out.println(f4.toString());
				 
			 }
			 }
			 
			 if(!l6.isEmpty()) {
			 String [] sVal = l6.split(":");
			 
			 if(sVal[0].equals("Student") && sVal.length <= 1  )
			 {
				 Student s1 = new Student();
				 System.out.println(s1);

			 }
			 }
			 
			 if(!l7.isEmpty()) {
			 String [] s1Val = l7.split(":");
			 
			 if(s1Val[0].equals("Student"))
			 {
				
				 String Sval1 = s1Val[1].trim();
				 Boolean isG = Boolean.parseBoolean(Sval1);
				 Student s2 = new Student(isG);
				 System.out.println(s2.toString());
				}
			 }
			 if(!l8.isEmpty()) {
			 String [] s2Val = l8.split(":");
			 
			 if(s2Val[0].equals("Student"))
			 {
				 String [] sval2 = s2Val[1].split(",");
				 String dept_s = sval2[0].trim();
				 Boolean isg2 = Boolean.parseBoolean(sval2[1]);
				 Student s3 = new Student(dept_s, isg2);
				 System.out.println(s3.toString());
			 }
			 }
			 
			 if(!l9.isEmpty()) {
			 String [] sVal3 = l9.split(":");
			 if(sVal3[0].equals("Student"))
			 {
				 String [] sval3 = sVal3[1].split(",");
				 String name_s2 = sval3[0].trim();
				 int yr_s = Integer.parseInt(sval3[1]);
				 String dept_s2 = sval3[2];
				 Boolean isg3 = Boolean.parseBoolean(sval3[3]);
				 
				 Student s4 = new Student(name_s2,yr_s,dept_s2, isg3);
				 System.out.println(s4.toString());
			 }
			 }
			 
			 if(!l10.isEmpty()) {
			 String [] genStff1 = l10.split(":");
			 if(genStff1[0].equals("GeneralStaff") && genStff1.length <= 1 )
			 {
				 GeneralStaff gs1 = new GeneralStaff();
				 System.out.println(gs1.toString());
			 }
			 }
			 
			 if(!l11.isEmpty()) {
			 String [] genStff2 = l11.split(":");
			 if(genStff2[0].equals("GeneralStaff"))
			 {
				
				 String gst2 = genStff2[1].trim();         //duty
				 
				 GeneralStaff gs2 = new GeneralStaff(gst2);
				 System.out.println(gs2.toString());
				 }
			 }
			 if(!l12.isEmpty()) {
			 String [] genStff3 = l12.split(":");

			 if(genStff3[0].equals("GeneralStaff"))
			 {  
				 String [] genf3 = genStff3[1].split(",");
				 String gen_deptn = genf3[0].trim();
				 String gen_duty = genf3[1];
                 GeneralStaff gs3 = new GeneralStaff(gen_deptn, gen_duty);
				 System.out.println(gs3.toString());
				}
			 }
			 
			 if(!l13.isEmpty()) {
			 String [] genStff4 = l13.split(":");
			 if(genStff4[0].equals("GeneralStaff")) {
				 String [] genf4 = genStff4[1].split(",");
				 String gen_name = genf4[0].trim();
				 int gen_byr = Integer.parseInt(genf4[1]);
				 String gen4_deptn = genf4[2];
				 String gen4_duty = genf4[3];
				 GeneralStaff gs4 = new GeneralStaff( gen_name,gen_byr,gen4_deptn,gen4_duty);
				 System.out.println(gs4.toString());
				 }
			 }
			 
			 if(!l14.isEmpty()) {
			 String [] coInfo1 = l14.split(":");
			 if(coInfo1[0].equals("Course")) {
				 String [] coInfo11 = coInfo1[1].split(",");
				 coInfo11[0] = coInfo11[0].trim();
				 Boolean c_val1 = Boolean.parseBoolean(coInfo11[0]);
				 int c_val2 = Integer.parseInt(coInfo11[1]);
				 String c_val3 = coInfo11[2];
				 int c_val4 = Integer.parseInt(coInfo11[3]);
				 Course c2 = new Course(c_val1,c_val2,c_val3,c_val4);
				 System.out.println(c2.toString());
				  }
		        }
			 
			 if(!l15.isEmpty()) {
			 String [] coInfo2 = l15.split(":");
			 if(coInfo2[0].equals("Course")) {
				 String [] coInfo12 = coInfo2[1].split(",");
				 coInfo12[0] = coInfo12[0].trim();
				 Boolean c_val1 = Boolean.parseBoolean(coInfo12[0]);
				 int c_val2 = Integer.parseInt(coInfo12[1]);
				 String c_val3 = coInfo12[2];
				 int c_val4 = Integer.parseInt(coInfo12[3]);
				 
				 Course c3 = new Course(c_val1,c_val2,c_val3,c_val4);
				 System.out.println(c3.toString());
			  }
		    }
			 
			 if(!l16.isEmpty()) {
			 String [] coInfo3 = l16.split(":");
			 if(coInfo3[0].equals("Course")) {
				 String [] coInfo13 = coInfo3[1].split(",");
				 coInfo13[0] = coInfo13[0].trim();
				 Boolean c_val1 = Boolean.parseBoolean(coInfo13[0]);
				 int c_val2 = Integer.parseInt(coInfo13[1]);
				 String c_val3 = coInfo13[2];
				 int c_val4 = Integer.parseInt(coInfo13[3]);
				 
				 Course c4 = new Course(c_val1,c_val2,c_val3,c_val4);
				 System.out.println(c4.toString());
			 
			      }
			  }
			 
			 if(!l17.isEmpty()) {
			 String [] coInfo4 = l17.split(":");
			 if(coInfo4[0].equals("Course")) {
				 String [] coInfo14 = coInfo4[1].split(",");
				 coInfo14[0] = coInfo14[0].trim();
				 Boolean c_val1 = Boolean.parseBoolean(coInfo14[0]);
				 int c_val2 = Integer.parseInt(coInfo14[1]);
				 String c_val3 = coInfo14[2];
				 int c_val4 = Integer.parseInt(coInfo14[3]);
				 
				 Course c5 = new Course(c_val1,c_val2,c_val3,c_val4);
				 System.out.println(c5.toString());
			     }
			 }
			 
			 if(!l18.isEmpty()) {
			 String [] coInfo5 = l18.split(":");
			 if(coInfo5[0].equals("Course")) {
				 String [] coInfo15 = coInfo5[1].split(",");
				 coInfo15[0] = coInfo15[0].trim();
				 Boolean c_val1 = Boolean.parseBoolean(coInfo15[0]);
				 int c_val2 = Integer.parseInt(coInfo15[1]);
				 String c_val3 = coInfo15[2];
				 int c_val4 = Integer.parseInt(coInfo15[3]);
				 
				 Course c6 = new Course(c_val1,c_val2,c_val3,c_val4);
				 System.out.println(c6.toString());
			           }
			 }
			 
			 
			  }
		 catch(FileNotFoundException excpt) {
			 
			 System.out.println("File Not Found "+fileName);
			 
		 }
		
		}
		

}




