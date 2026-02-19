import java.util.Arrays;

public class Strfun{

    public static String sortString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static boolean anagram(String s, String j){
        char[] k = s.toCharArray();
        char[] k1 = j.toCharArray();
        Arrays.sort(k);
        Arrays.sort(k1);
        return new String(k).equals(new String(k1));
    }

    public static String Expoded(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j <= i; j++){
                result += s.charAt(j);
            }
        }
        return result;
    }

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String swapFirstLastWords(String sentence){
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++){
            String w = words[i];
            if (w.length() > 1){
                w = w.charAt(w.length() - 1) + w.substring(1, w.length() - 1) + w.charAt(0);
            }
            result += w;
            if (i != words.length - 1){
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args){

    }
}
