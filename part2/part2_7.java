class part2_7 {
    int i;
    String front_times(String s, int n)
    {
        String r="";
        for( i=0 ; i< n; i++){
          String x=  s.substring(0,3);
          r+=x;
        }
        return r;
    }    
    public static void main(String[] args) {
        part2_7 obj = new part2_7();
        System.out.println(obj.front_times("Chocolate", 3));
        System.out.println(obj.front_times("Abcd", 3));

	}
    
}
