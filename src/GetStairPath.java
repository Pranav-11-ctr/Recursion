import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
		ArrayList<String> path=gsp(n);
		System.out.println(path);

	}

	private static ArrayList<String> gsp(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		else if(n<0)
		{
			ArrayList<String> bres=new ArrayList<>();
			
			return bres;
		}
		
		ArrayList<String> paths1=gsp(n-1);
		ArrayList<String> paths2=gsp(n-2);
		ArrayList<String> paths3=gsp(n-3);
		
		ArrayList<String> res=new ArrayList<>();
		for(String path:paths1)
		{
			res.add(1+path);
		}
		for(String path:paths2)
		{
			res.add(2+path);
		}
		for(String path:paths3)
		{
			res.add(3+path);
		}
		return res;
	}

}
