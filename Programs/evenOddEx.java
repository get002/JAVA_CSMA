import java.util.Scanner;
public class evenOddEx{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		if(val%2==0)
		{
			System.out.println(val+"is an even number");
		}
		else
		{
			System.out.println(val+"is odd Number");
		}
	}
}
