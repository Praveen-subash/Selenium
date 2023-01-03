package SamplePrograms;

public class CountNoOfWords {
	
	public static void main(String[] args) {    
        String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
        
        char[] ch = string.toCharArray();
        
        int flag=0;
        
        for(char c: ch) {
        	
        	if(c==' ') {
            	
            	
            }
                
            else {
            	
            	flag++;
            }
        	
        }
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);  
        System.out.println("Total number of characters in a string: " + flag);  
    }    

}
