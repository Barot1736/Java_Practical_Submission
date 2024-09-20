import java.util.Random;

public class part7_34 {
    public static  int c  ;

    public static void main(String[] args) {

        try {
            for(int i =0;i<=5;i++)
            {
            random o=new random();
            o.start();
            o.join(); 
            if (part7_34.c %2 == 0) {
                // for(int i=0;i<=5;i++)
                // {
                    even o1=new even();
                    o1.start();
                // }
            }
            else{
                // for(int i=0;i<=5;i++)
                // {
                    odd o2=new odd();
                    o2.start();
                // }
            }
            Thread.sleep(1000);
        }
    } 
    catch (Exception e) {
        // TODO: handle exception
    }
    
    }   
   }  
   class random extends Thread {
       public void run(){
           for(int i=0;i<=5;i++){ 
            Random r=new Random();
            int random = r.nextInt(100);
            part7_34.c = random;;
       }}
       
   } 
   class even extends Thread {
    @Override
    public void run() {
        System.out.println("square:"+(part7_34.c * part7_34.c));
    } 
}    class odd extends Thread {
    @Override
    public void run() {
        System.out.println("cube:"+(part7_34.c * part7_34.c*part7_34.c));
    } 
} 