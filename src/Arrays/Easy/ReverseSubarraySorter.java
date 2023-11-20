package Arrays.Easy;

public class ReverseSubarraySorter {

    public static void solution(int[] arr){
        int len = arr.length;
        int start = -1;
        int end = -1;

        for(int i=1;i<len;i++){
            if(arr[i] < arr[i-1]) {
                start = i - 1;
                break;
            }
        }

        for(int i=len-2;i>=0;i--){
            if( arr[i] > arr[i+1]){
                end = i+1;
                break;
            }
        }

        if(start ==-1 && end == -1){
            return;
        }

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 6, 5, 4, 3, 2, 8 };
        solution(arr);
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
