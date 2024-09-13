import java.util.*;

public class part3_12{
	public static void main(String [] args){
		if (args.length > 0) {
			int i = Integer.parseInt(args[0]);
			System.out.println(i*100);
		}
		 else {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter pound you want to convert:");
		int n= obj.nextInt();
		System.out.println(n*100);
		}		
	}
}