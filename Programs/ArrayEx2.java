import java.util.Scanner;
public class ArrayEx2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENter the size of array:");
	int n=sc.nextInt();
	int myArray[]=new int[n];
	
	for(int i=0;i<n;i++) {
		myArray[i]=sc.nextInt();
	}
	int min=myArray[0];
	int max=myArray[0];
	int sum=myArray[0];
	for(int i=1;i<n;i++) {
		if(myArray[i]<min) {
			min=myArray[i];
		}
		if(myArray[i]>max) {
			max=myArray[i];
		}
		sum+=myArray[i];
		
	}
	System.out.println(min);
	System.out.println(max);
	System.out.println(sum/n);
}
}
