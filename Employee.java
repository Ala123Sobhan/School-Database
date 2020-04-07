package project1;

public class Employee extends Person{
   private String deptName;
   private static int numEmployees = 0;
   private int employeeID;
   
   public Employee() {
	   super();
	   deptName ="";
	   numEmployees ++;
	   employeeID = numEmployees;             //F
   }
   public Employee(String deptName) {
	   super();
	   this.deptName = deptName;
	   numEmployees ++;
	   employeeID = numEmployees; 
   }
   public Employee(String name, int birthYear, String deptName) {
	   super(name,birthYear);
	   this.deptName = deptName;
	   numEmployees ++;
	   employeeID = numEmployees;
	   
   }
   public String getDeptName() {
	   return this.deptName;
   }
   
   public static int getNumEmployees() {
	   return numEmployees;
   }
   public int getEmployeeID() {
	   return this.employeeID;
   }
   public void setDeptName(String d)
   {
	   this.deptName = d;
   }
   public boolean equals(Object o)
   {
	   if(o instanceof Employee)
	   {
		   Employee e = (Employee) o;
		   if(super.equals(e))
		   {
			   if(this.deptName.equals(e.deptName)  && this.employeeID == e.employeeID) 
			   {
				   return true;
			   }
		   }
	   }
	   
	   
	  return false; 
	   
   }
   public String toString() { 
	   return super.toString()+            
			   String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
   }
   
   
   public int compareTo(Person p) {                   // a parent object is 
	   int res;                                           // not an instance of Child    
	   if(p instanceof Employee) {                                              //F
	   Employee e = (Employee) p;
	  
	     if(this.employeeID> e.employeeID)
	    	 return 1;
	     else if(this.employeeID < e.employeeID)
	    	 return -1;
	     else
	    	 return 0;
	   }
	   else
		    res = super.compareTo(p);
	    return res;
	  
	   
   }
   

   
}
