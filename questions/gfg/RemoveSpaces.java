/*package whatever //do not write package name here */
package questions.gfg;
import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveSpaces {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
			int test = sc.nextInt();
		    String[] strArr = new String[test];
		    sc.nextLine();
			for(int i=0;i<test;i++){
			    strArr[i] = sc.nextLine();
			}
			for(int i=0;i<test;i++){
			    strArr[i] = strArr[i].replace(" ","");
			    System.out.println(strArr[i]);
			}
		
	}
}