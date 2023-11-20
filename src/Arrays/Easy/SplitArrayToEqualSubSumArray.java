package Arrays.Easy;

public class SplitArrayToEqualSubSumArray {

    public static void solution(int[] arr){
        int len = arr.length;

        int totalSum = 0;

        for (int j : arr) {
            totalSum += j;
        }

        int leftSum = 0;
        int rightSum = 0;

        int index = -1;

        for(int j=0;j<len;j++){
            leftSum += arr[j];
            totalSum -= arr[j];
            if(leftSum == totalSum){
                index = j;
                break;
            }
        }
        System.out.println("index" + " " + index);
        if(index == -1 || index == len-1){
            System.out.println("Not Possible");
            return;
        }

        for(int j=0;j<len;j++){
            System.out.print(arr[j] + "\t");
            if(j == index){
                System.out.println();
            }

        }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        solution(arr);
    }
}
