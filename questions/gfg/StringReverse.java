package questions.gfg;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class StringReverse {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int tests = sc.nextInt();
	    String[] strArr = new String[tests];
	    for(int i=0;i<tests;i++){
	        strArr[i] = sc.next();
	        for(int j=strArr[i].length()-1;j>=0;j--){
	            System.out.print(strArr[i].charAt(j));
	        }
	        System.out.println();
	    }
	}
}