import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="aaabbddddcccaa";
		int c = 1;
		int len = s.length();
		String res="";
		
		for (int i=0;i<s.length();i++ )
		{
		 
		 if ((i+1)<len && s.charAt(i)==s.charAt(i+1))
		 {
		  c++;   
		 }
		 else
		 {
		     res = res+s.charAt(i);
		     res = res +c;	
		     c = 1;
		 }
		 
		}
		System.out.println(res);
	}
}
