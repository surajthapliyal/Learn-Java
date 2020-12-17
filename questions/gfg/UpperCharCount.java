package questions.gfg;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class UpperCharCount {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<tests;i++){
		    String str = sc.nextLine();
		    char[] arr = str.toCharArray();
		    int num=0;
		    for(int j=0;j<arr.length;j++){
		    	int ch=(int)arr[j];
		        if(ch>=65 && ch<=90){
		            num+=1;
		        }
		        
		    }
		    System.out.println(num);
	}
}
}
