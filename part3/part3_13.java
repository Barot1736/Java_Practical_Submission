import java.util.*;
class Employee{
    String n1,ln1;
    double s1;
    
    void set_name(String  n){
         n1= n;
    }
    void set_last_name(String ln){
        ln1= ln;
    }
    void set_salary(double s){
        if (s<0) {
            s1=0.0;
        } 
        else{
            s1=s;
        }
    }
    
    void display(){
        System.out.println("Name:\n"+n1+"Last Name:\n"+ln1+"salary\n"+s1);
    }
    String get_name(){
        return n1;
    }
    String get_last_name(){
        return ln1;
    }
    double get_salary(){
        return s1;
    }

    Employee(String n,String ln,int s){
        n1=n;
        ln1=ln;
        s1=s;
    }
}

public class part3_13 {
    public static void main(String [] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Name");
        String n=obj.nextLine();
        System.out.println("Enter LastName:");
        String ln=obj.nextLine();
        System.out.println("Enter Salary");
        int s=obj.nextInt();
        Employee e1=new Employee(n,ln,s);
        e1.set_name(n);
        e1.set_last_name(ln);
        e1.set_salary(s);
        System.out.println("Name of employee:"+e1.get_name());
        System.out.println("Last Name of employee:"+e1.get_last_name());
        System.out.println("Salary of employee:"+e1.get_salary());
        e1.display();
        double new_salary=s*1.1;
        e1.set_salary(new_salary);        
        System.out.println("New Salary of employee:"+e1.get_salary());


    }
}
