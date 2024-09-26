public class part7_35 {
    public static  int c  ;

    public static void main(String[] args) {
            random o=new random();
            o.start();
        }
    } 
    
   class random extends Thread {
       public void run(){ 
           int i;
        for( i =0;i<=5;i++)
        {  try {
            System.out.println( i);
            Thread.sleep(10000);
        }
        catch (Exception e) {
            
        }
       }
    } 
} 
  