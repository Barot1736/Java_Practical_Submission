public class part4_17 {
    public static void main(String[] args) {
        Sub o=new Sub();
        o.display1();
        o.display();

    }
}
/**
 * parent
 */
class parent{
    void display1(){
        System.out.println("This is parent class");
    }
    
}

class Sub extends parent {
   void display(){
       System.out.println("this is sub class");    
   }
}
