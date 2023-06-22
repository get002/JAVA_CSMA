
public class CarEx {
	public static void main(String args[]) {
	
		car car1=new car();
		car1.setMake("mahindra");
		car1.model="SCorpio";
		car1.color="SIlver";		
		car1.carinfo();
		
		car car2=new car();
		car2.setMake("Innova");
		car2.model="crysta";
		car2.color="silver";
		car2.carinfo();
		
		car car3=new car();
		car3.setMake("skoda");
		car3.model="kushaq";
		car3.color="red";
		car3.carinfo();
}
}

class car{
	public String make;
	public String model;
	public String color;
	
	public void setMake(String m) {
		switch(m) {
		case "skoda","Innova" -> make=m;
		default -> make="Unsupported";
		}
	}
	public void carinfo() {
		System.out.println("make:"+make+";model:"+model+";color:"+color);
	}
}