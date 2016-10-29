package model;

public class Doctor {

	private int ID;
	private String Name;
	private int Age;
	private String Sex;
	private String Contact;
	private String Password;
		
	public Doctor() {
		
	}
	
	public void setID(int id ){
		this.ID = id;
	}
	public void setName(String n){
		this.Name = n;
	}
	public void setAge(int age){
		this.Age=age;
	}
	public void setSex(String x){
		this.Sex=x;
	}
	public void setContact(String x){
		this.Contact = x;
	}

	public int getID(){
		return this.ID;
	}
	public String getName(){
		return this.Name;
	}
	public int getAge(){
		return this.Age;
	}
	public String getSex(){
		return this.Sex;
	}
	public String getContact(){
		return this.Contact;
	}
}
