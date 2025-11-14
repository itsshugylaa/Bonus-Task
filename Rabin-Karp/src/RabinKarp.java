public class RabinKarp {

    private static final int d = 256;
    private static final int q = 101;

    public static int hash(String s, int m) {
        int hashValue = 0;
        for (int i = 0; i < m; i++) {
            hashValue = (d * hashValue + s.charAt(i)) % q;
        }
        return hashValue;
    }

    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int patternHash = hash(pattern, m);
        int textHash = hash(text, m);

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash) {
                if (text.substring(i, i + m).equals(pattern)) {
                    System.out.println("Pattern found at index: " + i);
                }
            }
            if (i < n - m) {
                textHash = (d * (textHash - text.charAt(i) * (int)Math.pow(d, m - 1)) + text.charAt(i + m)) % q;
                if (textHash < 0) {
                    textHash = textHash + q;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        search(text, pattern);

        String shortText = "abc";
        String shortPattern = "a";
        search(shortText, shortPattern);

        String longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String longPattern = "ipsum";
        search(longText, longPattern);
    }
}