import java.util.*;
class Area{
    double h,w,b;

    Area(double h,double w,double b){
        this.h= h;
        this.w= w;
        this.b= b;
    }
    
    double display(){
        double a; 
        a=h*b*w;
        return a;
    }
   
}

public class part3_15 {
    public static void main(String [] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Hight");
        double h=obj.nextDouble();
        System.out.println("Enter Width:");
        double w=obj.nextDouble();
        System.out.println("Enter Breath");
        double b=obj.nextDouble();
        Area e1=new Area(h,w,b);
        System.out.println(" Area:"+e1.display());
    }
}
