import java.util.Scanner;

public class PrintDecreaing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		printDecreasing(n);

	}

	public static void printDecreasing(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		System.out.println(n);
		printDecreasing(n-1);
		
	}

}
