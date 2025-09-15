package lessonJava;

public class lesson19 {
   public static void main(String[] args) {
	   Human human1 = new Human();
	   human1.setName("IVAN");
	   human1.setAge(12);
	   int pars = human1.getAge();
	   System.out.print(pars);;
   }
}
class Human{
	String name;
	int age;
	
	public void setName(String username) {
		name = username;
	}
	public String getName() {
		return name;
	}
	public void setAge(int myAge) {
		age = myAge;
	}
    public int getAge() {
		return age;
	}
}