package project1;

public class GeneralStaff extends Employee {
	private String duty;
	
	public GeneralStaff() {
		super();
		duty="";
	}
	public GeneralStaff(String d) {
		super();
		duty=d;
	}
	public GeneralStaff(String deptName, String duty){
		super(deptName);
		this.duty = duty;
	}
	public GeneralStaff(String name, int birthYear, String deptName, String duty)
	{
		super(name,birthYear,deptName);
		this.duty = duty;
	}
	public String getDuty() {
		return this.duty;
		
	}
	
	public boolean equals(Object obj) {         
		if(obj instanceof GeneralStaff)
		{
			GeneralStaff g = (GeneralStaff) obj;
			if(super.equals(g))
			{
				if(this.duty.equals(g.duty))
					return true;
			}
		}
			
			
			return false;
	}
	public String toString() {                    
		return super.toString()+
				String.format(" GeneralStaff: Duty: %10s", duty);            //fixit
	}

	/* public int compareTo(Person p) {                   // a parent object is 
         // not an instance of Child    
         //F
          Employee e = (Employee) p;

      if(super.getEmployeeID()> e.getEmployeeID())
      return 1;
      else if(super.getEmployeeID() < e.getEmployeeID())
      return -1;
      else
      return 0;
      }

*/



}
