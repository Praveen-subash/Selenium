package SamplePrograms;

import java.util.HashMap;

public class SeperateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test12%&$ shld be split accordingly
		
		String str = "Test12%&$";
		
		
		
	    String number = "";
	    String letter = "";
	    String symbol = "";
	    
	    
	    for(int i=0;i<str.length();i++) {
	    	
	    	char ch = str.charAt(i);
	    	
	    	if(Character.isAlphabetic(ch)) {
	    		
	    		letter = letter + ch;
	    	
	    	}
	    	
	    	else if(Character.isDigit(ch)) {
	    		
	    		number = number + ch;
	    	}

	    	else {
	    		
	    		symbol = symbol+ch;
	    		
	    	}	
	    	
	    }
	    
	    System.out.println(letter);
    	System.out.println(number);
    	System.out.println(symbol);
        
       
	}

}
