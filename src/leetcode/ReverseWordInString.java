package leetcode;

import java.util.ArrayList;

public class ReverseWordInString {
    public static void main(String[] args) {

        String s = "the sky is blue";
//        if(s == null) return "";

        StringBuilder str = new StringBuilder(s.length());
        String trimmed = s.trim();
        String[] array = trimmed.split("\\s+");
        for (int i = array.length-1; i >= 0;i--){
            str.append(array[i]);
            if(i != 0) str.append(' ');
        }

        System.out.println(str);
    }
}
