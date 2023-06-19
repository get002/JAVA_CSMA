import java.util.Scanner;
public class binsSearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	
	int myArray[]=new int[n];
	System.out.println("Enter elements in sorted order:");
	for(int i=0;i<n;i++) {
		myArray[i]=sc.nextInt();
	}
	System.out.println("ENter key element to search");
	int key=sc.nextInt();
	int res=bsearch(myArray,0,n-1,key);
	System.out.println("Element "+((res==-1)?"NOT ":"at index "+res)+" Found");
	
	
	
}
//iterative version
/*
public static int bsearch(int myArray[],int low,int high,int key)
{
	while(low<=high) {
		int mid=(low+high)/2;
		if(key==myArray[mid]) {
			return mid;
		}else if(key<myArray[mid]) {
			high=mid-1;
		}else if(key>myArray[mid]) {
			low=mid+1;
		}
		
	}
	return -1;
}
*/
//Recursive version
public static int bsearch(int myArray[],int low,int high,int key){
	int mid=(low+high)/2;
	
	if(key==myArray[mid]) {
		return mid;
	}else if (key<myArray[mid]) {
		return bsearch(myArray,low,mid-1,key);
	}else {
		return bsearch(myArray,mid+1,high,key);
	}
}



}
