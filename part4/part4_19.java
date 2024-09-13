

public class part4_19 {
        public static void main(String[] args) {
            // Rectangle[] o=new Rectangle[2];
            // o[0]= new Rectangle(20, 30);
            // o[1]= new square(10);
            // for (Rectangle r : o) {
            Rectangle o= new Rectangle(0,0);
            square r = new square(0);
                
                r.area();
                r.perimeter();
            // }
    
            
        }
}

/**
 * Rectangle
 */
 class Rectangle{
    double l,b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println(l*b);

    }
    void perimeter (){
        System.out.println(2*(l+b));
    }
}
/**
 * square
 */
class square extends Rectangle{
    square(double s){
        super(s, s);
    }
    void area1(int a){
        System.out.println(a*a);

    }
    void perimeter1 (int a){
        System.out.println(4*(a));
    }
}