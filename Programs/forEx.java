public class forEx{
	public static void main(String args[]){
	
	/*
	for(int i=1;i<=10;i++){
			System.out.println(i);
	}
	*/
	for(double rate=8.0;rate<=12.0;rate++){
	System.out.println("10000 at"+rate+" %:"+calculateInt(10000.0,rate));

	}
	}	//end of main


	public static double calculateInt(double amount,double rate){
	return (amount*(rate/100));	
		
	}
}