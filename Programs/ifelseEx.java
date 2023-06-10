import java.util.Scanner;
public class ifelseEx{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int val1=sc.nextInt();
	int val2=sc.nextInt();
	
	if (val1<val2){
	System.out.println(val1+" is less than "+val2);
	}else if(val2<val1){
	System.out.println(val2+" is less than "+val1);
	}else{
	System.out.println(val1+" and "+val2 +" are equal");
	
	}
	
}}