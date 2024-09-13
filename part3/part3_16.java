import java.util.Scanner;

public class part3_16 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imag2 = scanner.nextDouble();

        complex c1=new complex(real1,imag1);     
        complex c2=new complex(real2,imag2);  
        c1.add(c2);   
        c1.sub(c2);   
        c1.div(c2);   

    }
}

class complex{
    double r,i;
    complex(double r,double i)
    {
        this.r=r;
        this.i=i;
    }
    void add(complex c){
        System.out.println(this.r+c.r);
        System.out.println(this.i+c.i);
    }
    void sub(complex c){
        System.out.println(this.r-c.r);
        System.out.println(this.i-c.i);
    }
    void div(complex c){
        System.out.println(this.r/c.r);
        System.out.println(this.i/c.i);
    }
}