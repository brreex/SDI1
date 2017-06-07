package mum.edu;

public class HelloWorld {
	   private String message;

	   public HelloWorld(){
		   System.out.println("message during constructor "+message);
	   }
	   
	   public HelloWorld(String message){
		   System.out.println("message during constructor "+message);
		   this.message = message;
	   }
	   
	   public void setMessage(String message){
		   System.out.println("setter method called ");
		   this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }
	}