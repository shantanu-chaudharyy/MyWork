package String1;

public class Substring {
	public static void main(String[] args) {
		
//		   substing help us to read the given str. from decided index like index 1 to 5.
//		   substring last index can be the size of str
//	      String substr=str1.substring(from index ,last index );

		
		      char arr[]={'C','o','d','i','n','g'};
		      String str1="Coding";
		      String substr=str1.substring(0,6);
		      System.out.println(substr);
		      System.out.println(substr.length());
		      
		      String a="coding";
		      for(int i=2;i<4;i++)
		      {
		          System.out.print(a.substring(i));
		      }
		    }
	
	


}
