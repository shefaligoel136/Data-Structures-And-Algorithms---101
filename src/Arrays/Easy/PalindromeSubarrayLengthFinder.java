package Arrays.Easy;

import javax.lang.model.element.Element;

public class PalindromeSubarrayLengthFinder {
    private static int maxLenSubArr(char[] arr, int n) {
        int max = 0;
        ElementClass[] el = new ElementClass[26];
        for(int i=0;i<n;i++){
            int ch = arr[i] - 'a';
            if(el[ch] == null){
                el[ch] = new ElementClass();
            }
            el[ch].updateOccurrence(i);
        }

        for(int i=0;i<26;i++){
            if(el[i] != null){
                int len = el[i].lastOcc - el[i].firstOcc + 1;
                max = Math.max(max,len);
            }
        }

        return max;
    }


    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'a'} ;
        int n = arr.length;

        System.out.print(maxLenSubArr(arr, n));
    }
}
