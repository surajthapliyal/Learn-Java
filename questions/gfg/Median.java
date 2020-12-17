package questions.gfg;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class Median
{
 public static void main(String[] args) throws IOException
 {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int T = Integer.parseInt(br.readLine().trim());
     while(T-->0)
     {
         int n = Integer.parseInt(br.readLine().trim());
         String s = br.readLine();
         String[] S = s.split(" ");
         int[] v  = new int[n];
         for(int  i = 0; i < n; i++)
             v[i] = Integer.parseInt(S[i]);
         Solution ob = new Solution();
         int ans = ob.find_fact(v);
         System.out.println(ans);
     }
 }
}
//} Driver Code Ends


//User function Template for Java

class Solution
{
 public int find_fact(int[] v)
 {
     Arrays.sort(v);
     int midIndex=0,midIndex2=0;
     if(v.length%2!=0){
         midIndex = (int) v.length/2;
         int oMedian = v[midIndex];
         return oMedian;
     }
     else{
         midIndex = (int)v.length/2;
         midIndex2 = v[midIndex+1];
         int eMedian =(int)(midIndex+midIndex2)/2;
         return eMedian;
     }
 }
}
