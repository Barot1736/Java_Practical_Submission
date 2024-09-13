class part2_9 {
    int i;
    String double_char(String s)
    {
        String f="";
        for( i=0 ; i< s.length(); i++){
            f += s.charAt(i);      
            f += s.charAt(i);      
        }
        return f;

    }    
    public static void main(String[] args) {
        part2_9 obj = new part2_9();
        System.out.println(obj.double_char("Chocolate"));

	}
    
}
