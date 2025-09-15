package lessonJava;

public class ClassAndObjects {
   public static void main(String[] args) {
	   Person person1 = new Person();
//	   person1.name = "David";
//	   person1.age = 21;
//	   System.out.println(person1.age);
	   person1.speak();
	   
	   person1.setName("David");
	   person1.setAge(12);
	   
	   String s1 = person1.getName();
	   System.out.print(s1);
	   
	   
	   
	  
   }
}


class Person{
	private String name;
	private int age;
	
	public void setName(String userName) {
		name = userName;
		
	}
	
	public void setAge(int userAge) {
		age = userAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	void speak() {
		System.out.println("weuiuiweuiwef");
	}
}