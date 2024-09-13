interface Advanced_Arithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements  Advanced_Arithmetic {
  public int divisor_sum(int n){
      int s=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                s=s+i;
            }
        }
        return s;
    }
}

    public class part4_22 {
        public static void main(String [] atgs){
            MyCalculator o=new MyCalculator();
            System.out.print("Dvisor of the sume is:"+o.divisor_sum(999));
        }
    }