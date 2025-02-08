public class WordPlay{
    public static boolean isVowel(char character)
    {
        boolean vowel =false;
        if(character=='A' || character=='a' || character=='E' || character=='e' || character=='I' || character=='i' || character=='O' || character=='o' || character=='U' || character=='u' )
        vowel =true;
        return vowel;
    }

    public static String replaceVowels(String S,char c)
    {
        String newString="";
        for(int i=0;i<S.length();i++)
        {
            if(isVowel(S.charAt(i)))
            newString=newString+c;
            else
            newString=newString+S.charAt(i);
        }
        return newString;
    }


    public static String emphasize(String S,char c)
    {
        String s="";
        for(int i=0;i<S.length();i++)
        {
            if(i%2==0 && S.charAt(i)==c)
            s=s+"*";
            else if(i%2!=0 && S.charAt(i)==c)
            s=s+"+";
            else
            s=s+S.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(replaceVowels("Revanth",'*'));
        System.out.println(emphasize("Mary Bella Abracadabra",'a'));
    }
}