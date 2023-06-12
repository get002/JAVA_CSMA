public class switchEx{
	public static void main(String args[]){
		/*
		int value=1;
		if(value==1){
			System.out.println("Value is 1");
		}else if(value==2){
			System.out.println("Value is 2");
		}else{
			System.out.println("value is not 1 or 2");
		}
		*/
		/*
		int value=6;
		switch(value){
			case 1:System.out.println("Value: 1");
			break;
			case 2: case 3: case 4:
			System.out.println("Value: 2 or 3 or 4");
			System.out.println("Actual value is "+value);
			break;
			default:
			System.out.println("Value is not 1,2,3,4");
			break;
		}
		*/
		//Program to print grade of a student
		
		char grade='A';
		switch(grade){
			case 'O':System.out.println("Outstanding");
			break;
			case 'A':System.out.println("First");
			break;
			case 'B':System.out.println("Second");
			break;
			case 'F':System.out.println("Fail");
			break;
			default:System.out.println("Invalid grade");
			break;
			
		}
		
	
	}
}