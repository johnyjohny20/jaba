public class Main
{
	public static void main(String[] args) {
	    String text = "john";
	    char [] not_reverse = text.toCharArray();
	    char[] n = new char[not_reverse.length];
	    
	    for(int i=0;i<not_reverse.length;i++){
	        n[not_reverse.length - i - 1] = text.charAt(i);
	        
	    }
	    System.out.println(String.copyValueOf(n));
	}
}
