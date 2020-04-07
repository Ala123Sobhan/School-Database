package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Driver_SchoolDB1 {
	
	public static void main(String[] args) {
		String fileName = "Text_file/SchoolDB_Initial.txt";
		Scanner inStream = null;
		
		System.out.println("=======================Reading from the file and showing it on the console:====================\n");
		
		try{
			File file = new File( fileName );
			if(file.exists() && file.canRead()){
				inStream = new Scanner (file );

				while(inStream.hasNextLine()){
					String theLine = inStream.nextLine();
					System.out.println(theLine);
					
					
				}
			}
		}catch(FileNotFoundException e){
			System.err.println("Cannot read from file "+fileName);
			e.printStackTrace();
		}
		finally{
			if(inStream !=null){
				inStream.close();
			}
		}
		System.out.println("=======================================================================================");
		System.out.println("=====================Reading from the file and constructing object:====================\n");
		 Construct_Obj_FromFile co = new  Construct_Obj_FromFile();
		
		try {
		co.construct_object(fileName);
		}
		catch(FileNotFoundException ex)
		{
			System.err.println("Cannot read from file "+fileName);
			ex.printStackTrace();
		} catch (IOException e) {
			System.err.println("an Exception from "+fileName+"occured");
			e.printStackTrace();
		}
		
		System.out.println("==================================================================================================");
		System.out.println("===========================================USER MENU==============================================");
		;
		
		System.out.println("You want to interact with the menu or close it?\nPress 'q' to close it.\nPress 'c' to continue.");
		Scanner scn = new Scanner(System.in);
		User_Menu cm1 = new User_Menu();
		//cm1.create_user_menu(scn);
		
		

	}

}
