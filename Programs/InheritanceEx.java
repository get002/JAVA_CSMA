
public class InheritanceEx {
public static void main(String[] args) {
	Animal a1=new Animal("HUge",400);
	System.out.println(a1);
	//a1.bark();
	
	dog d1=new dog("small",50,"bat ear","curly");
	System.out.println(d1);
	d1.bark();
	d1.move("fast");
}
}


class Animal{		//parent class, base class, super class
	public String size;
	public double weight;
	Animal(){
		
	}
	public Animal(String size,double weight) {
		this.size=size;
		this.weight=weight;
		
		
	}
	public void move(String speed) {
		System.out.println("Animal moves "+speed);
	}
	
	public void eat() {
		System.out.println("Animal eats something");
	}
	public String toString() {
		return "Animal Size:"+size+" weight: "+weight;
	}
}


class dog extends Animal{ //derived class , child class, sub class
	public String earShape;
	public String tailShape;
	
	public dog(String size,double weight,String earShape,String tailShape) {
		super(size,weight);
		this.earShape=earShape;
		this.tailShape=tailShape;
	}
	public void bark() {
		System.out.println("Dog is barking");
	}
	public void run() {
		System.out.println("Dog is running");
	}
	
	public String toString() {
		return super.toString()+" tail Shape:"+tailShape+" earShape: "+earShape;
	}
	
	public void move(String speed,int kmph) {
		System.out.println("Dog moves "+speed);
	}
	public void move(String speed) {
		System.out.println("Dog moves "+speed);
	}
	
	
}