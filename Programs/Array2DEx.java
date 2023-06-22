import java.util.Scanner;
public class Array2DEx {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//int myArray[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Enter no of rows:");
		int row=sc.nextInt();
		System.out.println("Enter no of columns");
		int col=sc.nextInt();
		int myArray[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				myArray[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(myArray[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
