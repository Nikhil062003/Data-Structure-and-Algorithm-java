package Inheritance;

public abstract class transport {
String color;
protected int maxspeed;// protected keyword is package friendly & only accesible outside the class in derived class

transport(){
	 System.out.println("Transport constructer");
}
public abstract boolean isMoterise();

  
void print() {
	
	System.out.println("Color:- "+ color+" maxspeed:- "+maxspeed);
} 
}
