import java.util.*;
class part1_6 {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int n=0,temp1=0,temp2=1;
		System.out.println("Enter number of days");
		n = obj.nextInt();
		for(int i=0;i<n;i++)
	{
		System.out.print(temp1 + " ");
		int s=temp1+temp2;
		temp1=temp2;
		temp2=s;
	}

		System.out.println("\nD24DCS166 Parth Barot");

    }
}