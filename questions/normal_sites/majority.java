package questions.normal_sites;

import java.util.Scanner;

public class majority {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Input elements of the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		maj(arr);
		sc.close();
	}
	static void maj(int arr[]) {
		int m = 0,count = 0,index = -1,res = arr.length/2; 
		for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr.length; j++) { 
                if (arr[i] == arr[j]) 
                    count++; 
            } 
            if (count > m) { 
                m = count; 
                index = i; 
            } 
        } 
		if (m > res)
            System.out.println(arr[index]); 
  
        else
            System.out.println("Not Found"); 
	}
}
