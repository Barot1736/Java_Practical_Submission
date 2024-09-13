import java.util.Arrays;
class part2_10 {
    public static void main(String[] args) {
	String s="Hello World";
        System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	char temp[] = s.toCharArray();
	Arrays.sort(temp);
	System.out.println(temp);
	
	String reversedStr = "";

	for (int i = s.length() - 1; i >= 0; i--) {
	  reversedStr += s.charAt(i) ;
	} 
	System.out.println( reversedStr);
	}
    
}
