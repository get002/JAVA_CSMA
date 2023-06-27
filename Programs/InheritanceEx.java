
public class InheritanceEx {
public static void main(String[] args) {
	dog d=new dog();
	d.move("fast");
}
}


class Animal{		//parent class, base class, super class
	public String size;
	public double weight;
	
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
	
}


class dog extends Animal{ //derived class , child class, sub class
	
	dog(String size,double weight){
		super(size,weight);
	}
	
}