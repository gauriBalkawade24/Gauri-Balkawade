import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void convertRomanToIntvalue(String s)  
    {  
		int number = 0;
        Map<Character, Integer> map=new HashMap<Character, Integer>();  
        
        //adding elements to the Map   
        map.put('I',1);  
        map.put('V',5);  
        map.put('X',10);  
        map.put('L',50);  
        map.put('C',100);  
        map.put('D',500);  
        map.put('M',1000);    
        
        s = s.replace("IV","IIII");  
        s = s.replace("IX","VIIII");  
        s = s.replace("XL","XXXX");  
        s = s.replace("XC","LXXXX");  
        s = s.replace("CD","CCCC");  
        s = s.replace("CM","DCCCC");  
        
         
    //loop iterates over the Roman numeral   
        for (int i = 0; i < s.length(); i++)  
        {  
    //getting each character of Roman numeral and adding it to the variable number  
            number = number + (map.get(s.charAt(i)));  
        }  
        //print the converted integer value  
        System.out.println("The converted Integer value is: "+number);  
}  
      
    public static void main (String args[])  
    {  
        //function calling  
        convertRomanToIntvalue("D");  
    }  

}  
	

