import java.util.Scanner;
import java.util.Arrays;
public class ArrayEx3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String frndName[]=new String[3];
	
	System.out.println("Enter your friend name:");
	for(int i=0;i<3;i++) {
		frndName[i]=sc.nextLine();
	}
System.out.println(Arrays.toString(frndName));
	
}
}
