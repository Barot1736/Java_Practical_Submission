
import java.util.Scanner;
class part2_8 {

    int data[] = new int[5];
    int i;
    int array_count9()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();
        
        int[] arr = new int[s];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
                arr[i] = sc.nextInt();
        }
        int count=0;
        for( i=0 ; i< arr.length; i++){
            if (arr[i]==9) {
                count ++ ;
            }
        }
        return count;
    }    
    public static void main(String[] args) {
        part2_8 obj = new part2_8();
        System.out.println("No of 9s:"+obj.array_count9());


	}
    
}
