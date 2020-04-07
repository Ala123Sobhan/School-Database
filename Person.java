package project1;

public class Person implements Comparable<Person> {
	private String name;
	private int birthYear;
	
	public Person() {
		name = "";
		birthYear = 0;
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
    
	public boolean equals(Object o) {           
		if(o instanceof Person)
		{
			Person p = (Person)o;
			if(this.name.equals(p.name) && this.birthYear == p.birthYear)
			{
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
	}
	@Override
	public int compareTo(Person p) {
		if(this.birthYear > p.birthYear)
			return 1;
		else if(this.birthYear < p.birthYear)
			return -1;
		else
		   return 0;
	}
	
	
	
	
	
	
	
	
}
