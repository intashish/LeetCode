package haystack_needle;

public class NeedleInHaystack {
    public static void main(String[] args) {

        String haystack = "sabutsad";
        String needle = "sad";
        int index = strStr(haystack, needle);
        System.out.println(index);
    }

    public static int strStr(String haystack, String needle) {

        int i =0;

        while(i < haystack.length()){

            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(j+i) != needle.charAt(j)){
                    i = i+j+1;
                    break;
                }
                return i;
            }
        }
        return -1;
    }
}
