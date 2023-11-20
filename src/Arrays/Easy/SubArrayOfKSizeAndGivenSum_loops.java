package Arrays.Easy;

public class SubArrayOfKSizeAndGivenSum_loops {

    public static void solution(int[] arr, int k, int sum){
        int currSum = 0;
        int len = arr.length;
        for(int i=0;i<=len-k;i++){
            currSum = 0;
            for(int j=0;j<k;j++){
                currSum += arr[i+j];
            }
            if(currSum == sum){
                System.out.println("YES" + " " + currSum);
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 3;
        int sum = 6;
        solution(arr,k,sum);
    }
}
