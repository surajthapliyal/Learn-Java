package questions.hackerRank;

public class compareTriplets {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {3,2,1};
        int alice=0,bob=0;
        for(int i=0;i<a.length;i++){
            if(a[i] > b[i]){
                alice++;
            }else if(b[i] > a[i]){
                bob++;
            }
        }
        int ans[] = {alice,bob};
        for(int each : ans){
            System.out.print(each+" ");
        }
    }
}
