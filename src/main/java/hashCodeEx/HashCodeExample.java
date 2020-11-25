package hashCodeEx;
class Student
{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
public boolean equals(Object obj)
	
	{
		if(obj == null)return false;
		if(!(obj instanceof Student))
			return false;
		if(obj==this)
			return true;
		return this.getId() == ((Student)obj).getId();
		
	}
	
}

public class HashCodeExample {
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"jini");
		Student s2 = new Student(1,"jini");
		System.out.println("Object s1 hashcode"+s1.hashCode());
		System.out.println("Object s2 hashcode"+s2.hashCode());
		System.out.println(s1.equals(s2));
		

	}

}
