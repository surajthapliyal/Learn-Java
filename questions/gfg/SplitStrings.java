package questions.gfg;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SplitStrings {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int tests = sc.nextInt();
	    sc.nextLine();
	    for(int j=0;j<tests;j++){
    	    String S = sc.nextLine();
    	    char[] alphabets = new char[S.length()];
    	    char[] digits = new char[S.length()];
    	    char[] specials = new char[S.length()];
    	    int a=0,b=0,c=0;
    	    for(int i=0;i<S.length();i++){
    	        if(S.charAt(i)>=65 && S.charAt(i)<=90 || S.charAt(i)>=97 && S.charAt(i)<=122){
    	            alphabets[a] = S.charAt(i);
    	            a++;
    	        }else if(S.charAt(i)>=48 && S.charAt(i)<=57){
    	            digits[b] = S.charAt(i);
    	            b++;
    	        }else{
    	            specials[c] = S.charAt(i);
    	            c++;
    	        }
    	    }
    	    String A = new String(alphabets);
    	    System.out.println(A);
    	    String D = new String(digits);
    	    System.out.println(D);
    	    String SC = new String(specials);
    	    System.out.println(SC);
    	}
	}
}
