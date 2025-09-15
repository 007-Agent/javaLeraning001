package lessonJava;

public class lesson24 {
	public static void main(String[] args) {
		 Humann h1 = new Humann("Bob", 12);
		
		 System.out.println( h1.toStr());
	}
}

class Humann{
	
	private String name;
	private int age;
	
	
	public Humann(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	public String toStr() {
		return name+" ,"+age;
	}
	
}