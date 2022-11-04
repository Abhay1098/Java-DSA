public class Main {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        char c='g';

        removeCharacter(str,c);
    }

    public static void removeCharacter(String s, char c)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}