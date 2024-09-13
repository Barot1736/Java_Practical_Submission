import java.util.*;
class Date{
    int n1,ln1;
    int s1;
    
    void set_day(int  n){
         n1= n;
    }
    void set_month(int ln){
        ln1= ln;
    }
    void set_year(int s){
        if (s<0) {
            s1=0;
        } 
        else{
            s1=s;
        }
    }
    
    void display(){
        System.out.println(n1+"/"+ln1+"/"+s1);
    }
    int get_day(){
        return n1;
    }
    int get_last_month(){
        return ln1;
    }
    int get_year(){
        return s1;
    }

    Date(int n,int ln,int s){
        n1=n;
        ln1=ln;
        s1=s;
    }
}

public class part3_14 {
    public static void main(String [] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Day");
        int n=obj.nextInt();
        System.out.println("Enter Month:");
        int ln=obj.nextInt();
        System.out.println("Enter Year");
        int s=obj.nextInt();
        Date e1=new Date(n,ln,s);
        e1.set_day(n);
        e1.set_month(ln);
        e1.set_year(s);
        System.out.println("Date of employee:"+e1.get_day()+"/"+e1.get_last_month()+"/"+e1.get_year());
        e1.display();
       


    }
}
