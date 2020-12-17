package Strings;
public class Anagram {
    public static void main(String[] args) {
        String str1="koaask";
        String str2="koacsk";
        boolean[] visited = new boolean[str2.length()];
        boolean isAnagram=false;
        char ch;
        if(str1.length()==str2.length())
        {
            for(int i=0;i<str1.length();i++)
            {
                ch=str1.charAt(i);
                isAnagram = false;
                for(int j=0;j<str2.length();j++)
                {
                    if(ch==str2.charAt(j) && !visited[j])
                    {
                        visited[j]=true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram)
                break;
            }
            if(isAnagram) System.out.println("Anagram.");
            else System.out.println("Not anagram");
    }
    else
    System.out.println("String are not anagram of each other.");
    }
}