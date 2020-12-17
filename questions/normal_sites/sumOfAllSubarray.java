package questions.normal_sites;
public class sumOfAllSubarray {
    public static void main(String[] args) {
        int a[] = {-2 ,1 ,-3, 4 ,-1 ,2 ,1 ,-5, 4};
        int sum = 0;
        int max = -199999999;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                System.out.println("Sum = " + sum);
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println("Max sum = "+max);
    }
}
/*
[1,2,2] : 
 0 1 2

subarray for 0 index = [1]      sum = 1
                       ,[1,2]   sum = 3
                       ,[1,2,2] sum = 5
subarray for 1 index = [2]      sum = 2
                       ,[2,2]   sum = 4
subarray for 2 index = [2]      sum = 2

Output should be : 1 3 5 2 4 26

*/
