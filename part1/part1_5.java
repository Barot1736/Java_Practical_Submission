import java.util.*;

class part1_5 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		// int code[] = {1,2,3,4,5};
		int price[] = { 8, 12, 5, 7, 3 };
		char continueChoice;
		System.out.println(
						"1.motor" +
						"2.fan" +
						"3.tube" +
						"4.wires" +
						"5.All others Inems");
		int option = obj.nextInt();
		int n = 0, s = 0, x = 0;
		do {
			switch (option) {
				case 1:
					System.out.println("Enter Price for motor");
					n = obj.nextInt();
					x = price[0];
					s = (n * x) / 100;
					break;
				case 2:
					System.out.println("Enter Price for fan");
					n = obj.nextInt();
					x = price[1];
					s = (n * x) / 100;
					break;
				case 3:
					System.out.println("Enter Price for tube");
					n = obj.nextInt();
					x = price[2];
					s = (n * x) / 100;
					break;
				case 4:
					System.out.println("Enter Price for wires");
					n = obj.nextInt();
					x = price[3];
					s = (n * x) / 100;
					break;
				case 5:
					System.out.println("All others Inems");
					n = obj.nextInt();
					x = price[3];
					s = (n * x) / 100;
					break;
				default:
					break;
			}
				
			System.out.println("Do you want to continue? (y for yes and n for no)");
			continueChoice = obj.next().charAt(0);
		}
		 while (continueChoice == 'y' || continueChoice == 'Y');
		double sum=0; 
		sum=sum+s;
		System.out.println("Total Tax Will be added="+sum);
		System.out.println("D24DCS166 Parth Barot");
	}
}
