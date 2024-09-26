public class part7_36 {
    public static  int c  ;

    public static void main(String[] args) {
            t1 o=new t1();
            t2 o1=new t2();
            t3 o2=new t3();
            t4 o3=new t4();
            o.setPriority(1);
            o1.setPriority(5);
            o2.setPriority(3);
            o3.setPriority(10);
            
            o.start();
            o1.start();
            o2.start();
            o3.start();
        }
    } 
    
   class t1 extends Thread {
       public void run(){ 
        System.out.println("Thread 1");
    } 
} 
class t2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}
class t3 extends Thread{
    public void run(){
        System.out.println("Thread 3");
    }
}
class t4 extends Thread{
    public void run(){
        System.out.println("Thread 4");
    }
}
  