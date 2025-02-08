public class CaesarCipher {
    public static boolean isAlpha(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
            return true;
        else
            return false;
    }

    public static String encrypt(String S, int n) {
        String s = "";
        for (int i = 0; i < S.length(); i++) {
            int j = (int) S.charAt(i);
            if (isAlpha(S.charAt(i))) {
                for (int k = 1; k <= n; k++) {
                    j++;
                    if (j == (int) 'Z' + 1)
                        j = (int) 'A';
                    else if (j == (int) 'z' + 1)
                        j = (int) 'a';
                }
            }
            s = s + (char) j;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
        System.out.println(encrypt("First Legion", 23));
        System.out.println(encrypt("First Legion", 17));
    }

}
