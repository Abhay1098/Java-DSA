import java.util.Scanner;

public class InputByUserRemoveCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string-");
        String str=sc.nextLine();
        System.out.println("Enter the character to remove-");
        char c=sc.next().charAt(0);

        removecharacter(str,c);
    }

    public static void removecharacter(String str,char c)
    {
        int n=str.length();
        String final_str="";
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=c)
            {
                final_str=final_str+str.charAt(i);
            }
        }
        System.out.println(final_str);
    }
}
