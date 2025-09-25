package in.as.main.beans;

public class Student {
	private String name;
	private String email;
	private long phoneno;
	
	public Student(String name, String email, long phoneno)
	{
		this.name=name;
		this.email=email;
		this.phoneno=phoneno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	public void displayStdDtls()
	{
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phone No. :"+phoneno);
	}
	

}
