package String;

import java.util.Scanner;

public class ReverseWord {

	public static void ReverseWord(String str) 
	{
		for(int i = str.length()-1; i>=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
String str = scan.next();

ReverseWord(str);
	}

}


