public class part4_18 {
    public static void main(String [] args){
        manager o= new manager();
        manager o1= new manager();
        o.managaer("Parth","add","12","3422144323","1200000000000","edsfdsc");
        o1.managaer("Parth","add","12","3422144323","1200000000000","edsfdsc");
        o.print();
        o1.print();
    }
}

class Member{
    String name,address,age,phone,salary;
}
class manager extends Member{
    
    String department;
    void managaer(String name,String address,String age,String phone,String salary,String department){
        this.name=name;
        this.address=address;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.department = department;
    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("address:"+address);
        System.out.println("age:"+age);
        System.out.println("phone:"+phone);
        System.out.println("slary:"+salary);
        System.out.println("departmanet:"+department);
    }

}
class employee extends Member{
    
    String specialization;
    void managaer(String name,String address,String age,String phone,String salary,String specialization){
        this.name=name;
        this.address=address;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.specialization = specialization;
    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("address:"+address);
        System.out.println("age:"+age);
        System.out.println("phone:"+phone);
        System.out.println("slary:"+salary);
        System.out.println("departmanet:"+specialization);
    }

}