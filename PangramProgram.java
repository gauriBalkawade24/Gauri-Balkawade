
public class PangramProgram {

	  public static void main(String[] args) {  
		  String s="The quick brown fox jumps over the lazy dog";
		 //String s="Hello world";
		 System.out.println(isPangram(s.toLowerCase())); 
	  }

	private static boolean isPangram(String s) {
		
		if(s.length()<26) {
			
			return false;
				
	}else
		
	{
		for(char ch='a'; ch<='z'; ch++) {
			
			if(s.indexOf(ch)<0) {
				return false;
			}
			
		}
		
	}
		return true;
		
		
				
	    }
}


