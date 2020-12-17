package Strings;
public class anagram_self_logic {
    public static void main(String[] args) {
        String a="aat";
        String b="cat";
        boolean isAnagram = false;
        boolean[] visited = new boolean[b.length()];
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                isAnagram = false;
                char ca=a.charAt(i);
                for(int j=0;j<b.length();j++)
                {
                    char cb = b.charAt(j);
                    // int k=0;
                    if(ca==cb && !visited[j])
                    {
                        visited[j]=true;
                        isAnagram = true;
                        // k++;
                        break;
                    }
                }
                if(!isAnagram)
                    break;
            }
            if(isAnagram) System.out.println("Anagram");
            else System.out.println("Not an Anagram");
        }
        else
        System.out.println("Not an Anagram");
    }
}