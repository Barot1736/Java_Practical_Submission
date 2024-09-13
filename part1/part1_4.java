import java.util.*;

public class part1_4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no. of Days:");
        int ndays = obj.nextInt();

        float[] myArray = new float[ndays];

        float sum=0,m=0;
        System.out.println("Enter Your Daily Expence:");
        for (int i = 0; i < ndays; i++) {
            myArray[i] = obj.nextFloat();

        // m++; 
        }
        for (int i = 0; i < ndays; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
	System.out.println("D24DCS166 Parth Barot");
    }
}
