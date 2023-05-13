package Inheritance;

public class Car extends transport {
    private int noofdoors;
	
    Car(int x){
    	
    this.noofdoors=x;
   	 System.out.println("Car constructer");
   	 print();
    }
    public int getNoofdoors() {
		return noofdoors;
	}





	public void setNoofdoors(int noofdoors) {
		this.noofdoors = noofdoors;
	}





	void print() {
		
    		System.out.println("Color:- "+ color+" maxspeed:- "+maxspeed+" maxdoors:- "+noofdoors);
    		super.print();//will call the parent class functionalities
    	} 
}
