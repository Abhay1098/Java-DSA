public class Main {
    public static void main(String[] args) {

        String str="abhay!@#";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='!' || str.charAt(i)=='@' ||str.charAt(i)=='#' || str.charAt(i)=='$' || str.charAt(i)=='%' ||
                    str.charAt(i)=='^' || str.charAt(i)=='&' || str.charAt(i)=='*' || str.charAt(i)=='(' || str.charAt(i)==')')

//            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) &&
//                    !Character.isWhitespace(str.charAt(i)))
                count++;

        }

        if(count==0)
            System.out.println("There is no special character");
        else System.out.println("There are "+count+" special character");

        System.out.println(count);
    }
}