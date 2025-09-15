package Interfaces;

public class Animal implements Info{
   public int id;
   
   public Animal(int id) {
	    this.id = id;
   }
   
   
   public void sleep() {
	   System.out.print("I am sleeping");
   }
   public void showInfo() {
	   System.out.println("id is " + this.id);
   }
}
