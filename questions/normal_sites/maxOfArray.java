public class maxOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,52,35,57,786,21};
        int max = -1999999999;
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
                System.out.println("Max till i = "+ max);
            }
        }
        System.out.println("Max = "+ max);
    }
}
