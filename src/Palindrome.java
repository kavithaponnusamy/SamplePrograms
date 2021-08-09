import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2="", str3;
		Scanner scnr=new Scanner(System.in);
		do {
		System.out.println("Enter the string: ");
		str1=scnr.next();
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=str1.charAt(i);	
			System.out.println(str2);
			
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Given string is Palindrome");
		}else
		{
			System.out.println("Given string is not a Palindrome");
		}
		str2="";
		System.out.println("Do you want to play again(y/n)?: ");
		str3=scnr.next();
		}
		while(str3.equalsIgnoreCase("y"));		

	}

}
