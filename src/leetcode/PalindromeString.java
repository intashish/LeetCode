package leetcode;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        StringBuilder str = new StringBuilder();
//        for(int i=0;i< s.length();i++){
//            char c = s.charAt(i);
//
//            if(Character.isLetterOrDigit(c)){
//                c = Character.isAlphabetic(c) ? Character.toLowerCase(c) : c;
//                str.append(c);
//            }
//        }
//        if(str.isEmpty()) {
//            System.out.println("not a palindrome");
//        }
//        int i = 0;
//        int j = str.length()-1;
//
//        while (i != j){
//            if(str.charAt(i) != str.charAt(j)){
//                System.out.println("not a palindrome");
//                break;
//            }
//            i++;j--;
//        }
//        System.out.println("is palindrome");

        int n = 0;
        int m = s.length()-1;

        while(n < m){
            while (n < m && !Character.isLetterOrDigit(s.charAt(n))) n++;
            while (n < m && !Character.isLetterOrDigit(s.charAt(m))) m--;

            if(n < m){
                char a = Character.toLowerCase(s.charAt(n));
                char b = Character.toLowerCase(s.charAt(m));
                if(a != b){
                    System.out.println("nott palindrome");
                }
                n++;m--;
            }
        }
        System.out.println("itss a palindrome");
    }
}
