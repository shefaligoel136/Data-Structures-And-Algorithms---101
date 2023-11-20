package Arrays.Easy;

public class SubArrayOfKSizeAndGivenSum_slidingWindow {
    public static void solution(int[] arr, int k, int sum){
        int currSum = 0;
        int len = arr.length;

        for(int i=0;i<k;i++){
            currSum += arr[i];
        }

        if(currSum == sum){
            System.out.println("YES" + " " + currSum);
            return;
        }


        for(int i=k;i<len;i++){
            currSum = currSum - arr[i-k] + arr[i];
            if(currSum == sum){
                System.out.println("YES" + " " + currSum);
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int sum = 18;
        solution(arr,k,sum);
    }
}
