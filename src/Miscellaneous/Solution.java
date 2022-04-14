package Miscellaneous;

public class Solution {
	
	    public static boolean validPalindrome(String s) {
	        
	            int len = s.length();
	        StringBuffer sb1 =new StringBuffer(s); 
	        StringBuffer sb2=new StringBuffer(s);
	            int p1 =0;
	            int p2=len-1;
	            int count=0;
	            while(p1<=p2){
	               
	                if(sb1.charAt(p1)!=sb1.charAt(p2)){
	                    if(count==1){
	                        break;
	                    }
	                    sb1.deleteCharAt(p2);
	                    System.out.println(sb1);
	                    
	                    sb2.deleteCharAt(p1);
	                    System.out.println(sb2);
	                    
	                    if(!isPalindrome(sb1.toString())){
	                    	System.out.println("p2 removed First false");
	                    	System.out.println(sb1.toString());
	                        if(!isPalindrome(sb2.toString())){
	                            return false;
	                        }
	                    }
	                    count++;
	                    
	                    
	                }
	                p1++;
	                p2--;
	            }
	        
	        return true;
	        
	    }
	    
	    public static boolean isPalindrome(String s){
	        int i=0;
	        int j=s.length()-1;
	        if(s.length()!=0){
	            
	            while(i<=j){
	            if(s.charAt(i)!=s.charAt(j)){
	                
	                return false;
	            }
	                i++;
	                j--;
	                }
	            return true;
	        }
	        return false;
	    }
	

	public static void main(String[] args) {
		String s = "ever";
		System.out.println(validPalindrome(s));

	}

}
