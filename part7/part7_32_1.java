public class part7_32_1 {
    public static void main(String[] args) {
       th o=new th();
       o.setPriority(10);
       o.start();
       run o1=new run();
       Thread t=new Thread(o1);
       t.start();
    }   
   }   
   class th extends Thread {
       public void run(){
        for (int i=0 ; i<=50 ; i++) {
            if (i%2==0) {
                System.out.println("even:"+i);
            }
        }
       }
       
   } 
   class run implements Runnable {
       @Override
       public void run() {
         for (int i=0 ; i<=50 ; i++) {
            if (i%2!=0) {
                System.out.println("odd:"+i);
        }
    }
       }
       
   } 