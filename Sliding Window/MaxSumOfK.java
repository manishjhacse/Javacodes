//given an array and k, find the maximum  sum of any subarray with length k
public class MaxSumOfK {
    public static int maxSum(int arr[], int k) {
        if (k > arr.length) {
            System.out.println("Subarray size can't be greater than array size");
            System.exit(0);
        }
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < arr.length) {
            sum += arr[end];
            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[start++];
                end++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 1, 2, 6, 7, 9, 3, 2, 5, 11, 45, -48, 49, 105, };
        int k = 3;
        System.out.println("Maximum sum of length " + k + " subarray is " + maxSum(arr, k));
    }
}
