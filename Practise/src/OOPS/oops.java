package OOPS;


class Fraction{
	int a,b;

	Fraction(int i, int j){
		this.a=i;
		this.b=j;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	void print(){
//		simplyfy();
	System.out.println(a+"/"+b);	
	}

	private void simplyfy() {
		int gcd=1;
		for(int i=2;i<=a;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		a=a/gcd;
		b=b/gcd;
		
	}
	void increment() {
		a=a+b;
		simplyfy();
	}
	
	void add(Fraction F1){
	this.a=this.a*F1.b+this.b*F1.a;
	this.b=this.b*F1.b;
	simplyfy();
	}
	
	
}
 class ComplexNumbers {
    int real1,imaginary1;
    
	// Complete this class
    ComplexNumbers(int real1,int  imaginary1){
        this.real1=real1;
        this.imaginary1=imaginary1;
        
    }
    void plus(ComplexNumbers c2){
        this.real1=this.real1+c2.real1;
        this.imaginary1=this.imaginary1+c2.imaginary1;
        }
    
    void multiply(ComplexNumbers c2) {
    	ComplexNumbers c3 =new ComplexNumbers(0,0) ;
        c3.real1=this.real1*c2.real1-this.imaginary1*c2.imaginary1;
    	c3.imaginary1=this.real1*c2.imaginary1+this.imaginary1*c2.real1;
		this.real1=c3.real1;
		this.imaginary1=c3.imaginary1;
    }
    void print(){
        System.out.println(this.real1+ "+ i" +this.imaginary1);
    
}}
class dynamicArray{
	private int data[];
	private int nextIndex;
	public dynamicArray() {
		data=new int[5];
		nextIndex=0;
	}
	public int size() {
		return nextIndex;
	}
	public boolean isEmpty() {
		return nextIndex==0;
	}
	public int get(int i) {
		if(i>=nextIndex) {
			return -1;
		}
		return data[i];
	}
	public void add(int i) {
		if(nextIndex==data.length) {
		
			doubleCapcity();
			
		}
		
		data[nextIndex]=i;
		nextIndex++;
	}
	private void doubleCapcity() {
		int temp[]=data;
		data= new int [2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}
	
	public void set(int i,int j) {
		if(i>=nextIndex) {
			System.out.println("Index dosn't exixt to set value");return;
		}
	data[i]=j;
		
	}
	public void removelast() {
		nextIndex--;
	}
	

	public void printA() {
		for(int i=0;i<nextIndex;i++) {System.out.print(data[i]+" ");}
	}
	
	
}
class polynomial{
	int data[];
	int nextIndex;
	int x,x1;
	
	polynomial(){
		data=new int [5];
		nextIndex=0;
	}
	
	void setcofficent(int x,int x1){
		if(x==nextIndex) {
			doubleCapcity();
		}
	  data[x]=x1;
	  nextIndex++;
		
		
		
	}
	private void doubleCapcity() {
		int temp[]=data;
		data= new int [2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}
	
	void print(){

		for(int i=0;i<data.length;i++) {
			if(this.data[i]!=0) {
				System.out.print(data[i]+"x^"+i+" +");
			}
		}
		
	}
}

public class oops {

	public static void main(String[] args) {
//		Fraction F=new Fraction(2,3);
//	    Fraction F1=new Fraction(8,2);
//	 
//	    F.add(F1);    
////	    F.print();
//		ComplexNumbers C=new ComplexNumbers(4,5);
//		ComplexNumbers C1=new ComplexNumbers(1,2);
////		C.plus(C1);
//		C.multiply(C1);
//		C.print();
//		
		
		dynamicArray d=new dynamicArray();
//		d.add(1);
//		d.add(2);
//		d.add(8);
//        d.add(12);
//        d.add(29);
//		d.add(21);
//    	d.add(23);
////    	for(int i=0;i<100;i++) {
////    		d.add(i);
////    	}
////    	
//		System.out.println(d.isEmpty());
//		System.out.println(d.size());
//		System.out.println(d.get(4));
////		d.removelast();
//		d.set(10, 102);
//	System.out.println("Final array :");d.printA();
////		
//		
		polynomial p=new polynomial();
    	p.setcofficent(0, 3);
		p.setcofficent(2, 9);
		p.print();
		
		polynomial p1=new polynomial();
		p1.setcofficent(1,4);
		p1.setcofficent(3, 4);
		p1.setcofficent(1, 23);
		p1.print();
	}

	

}