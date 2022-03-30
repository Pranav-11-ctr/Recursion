import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		printIncreasing(n);

	}

	public static void printIncreasing(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		printIncreasing(n-1);
		System.out.println(n);
		
	}

}
