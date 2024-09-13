import java.util.*;

public class part1_3 {

      public static void main(String[] args) {
        System.out.println("Enter the Distace in meters");
        Scanner obj = new Scanner(System.in);
    
        float distance = obj.nextFloat();
        System.out.println("Enter the time in hour");
        float hour = obj.nextFloat();
    
        System.out.println("Enter the time in minutes");
        float minutes = obj.nextFloat();
    
        System.out.println("Enter the time in second");
        float seconds = obj.nextFloat();
    
        System.out.println("Speed in m/s " + distance / (hour * 3600 + minutes * 60 + seconds));
        System.out.println("speed in km/hr " + distance / (1000 * (hour + minutes / 60 + seconds / 3600)));
        System.out.println("speed in mile/hr " + distance / (1609 * (hour + minutes / 60 + seconds / 3600)));
	System.out.println("D24DCS166 Parth Barot");
      }
    }
    