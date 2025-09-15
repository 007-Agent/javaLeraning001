package Javademo;



public class lrsson20java {
	public static void main(String[] args) {
		 Human human1 = new Human();
		   
	}
}

class Human{
	
	public String name;
	public int age;
	
	public Human() {
		System.out.print("привет из первого конструктора!");
	}
	public Human(String name) {
		this.name = name;
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.print("привет из второго конструктора!");
	}
	
	
	
	public void setName(String username) {
		this.name = username;
	}
	
	public void setAge(int myAge) {
		this.age = myAge;
	}
   
}