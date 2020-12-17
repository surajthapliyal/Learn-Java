/* package codechef; // don't place package name! */
package questions.CodeChef;
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class lapindrome {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int tests = sc.nextInt();
            sc.nextLine();
            for (int t = 0; t < tests; t++) {
                String str = sc.nextLine();
                int start = 0;
                int end = str.length() - 1;
                int ascii[] = new int[256];
                boolean result = true;
                while (start < end) {
                    int index1 = str.charAt(start);
                    int index2 = str.charAt(end);
                    ascii[index1]++;
                    ascii[index2]--;
                    start++;
                    end--;
                }

                for (int i = 0; i < 256; i++) {
                    if (ascii[i] != 0) {
                        result = false;
                        break;
                    }
                }

                if (result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                sc.close();
            }
        } catch (Exception e) {
            return;
        }
    }
}
