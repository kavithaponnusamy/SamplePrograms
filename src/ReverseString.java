import java.util.Arrays;

public class ReverseString {
	
	 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s= {'h','e','l','l','o'};
		char [] newarr=new char[s.length];
	     for(int i=0;i<s.length; i++){
	         newarr[i]=s[s.length-i-1];  
	         
	        }System.out.println(Arrays.toString(newarr));
	        
	    }
		
	}


