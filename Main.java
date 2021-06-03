
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		String ip = sc.nextLine();
		 StringBuilder sb = new StringBuilder(ip);
		String temp = "";
        		for(int i = 0;i+1<ip.length();i++) {
        		    //what deos this first it checks if there is any '.' or ','is there if found yes then 
        		    //it will corresponding Character to toUpperCase
        			if(ip.charAt(i) == '.' | ip.charAt(i) == ',') {
        				temp = temp.valueOf(ip.charAt(i+1));
        				temp = temp.toUpperCase();
        			sb.deleteCharAt(i+1);
        				
        				  sb.replace(i+1, i+1, temp);
        				    
        			}
        		}
        		//this change starting Character of string to UpperCase
        	//	for eg 
        	///	input : abrar.shaha,ambernath
//              output : Abrar.Shaha,Ambernath
        		
        		
        		temp = temp.valueOf(ip.charAt(0));
				temp = temp.toUpperCase();
				 sb.replace(0, 0, temp);
			sb.deleteCharAt(1);
				
			
		System.out.println(sb);
	}
		
}
