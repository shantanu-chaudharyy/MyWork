package String;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
//  01234567 
//	aaabbbca
//  12345678
	public static String Multiple(String str) 
	{

		Character element = str.charAt(0); //b
		String result = str.charAt(0) + "";//ab
		
		
		
		for(int i = 0; i < str.length(); i++) //b
		{
			
			if(element != str.charAt(i)) //a!=b
			{
				result+= str.charAt(i); // ab
				element = str.charAt(i);//b
			}
		}
		
		return result;
	}
		
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
      String output =  Multiple(str);
 System.out.println(output);       
}
}





