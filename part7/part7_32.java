public class part7_32 {
 public static void main(String[] args) {
    th o=new th();
    o.start();
    run o1=new run();
    Thread t=new Thread(o1);
    t.start();
 }   
}   
/**
 * th 
 */
class th extends Thread {
    public void run(){
      System.out.println("Hello world");  
    }
    
} 
class run implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
    
} 