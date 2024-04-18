class subArraySum{
    public static void maxSubArraySumBruteForce( int []arr){
        int n=arr.length,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int currSum=arr[i];
            for(int j=i+1;j<n;j++){
                currSum+=arr[j];
                maxSum=Math.max(maxSum, currSum);
            }

        }
        System.out.println(maxSum);
    }
    public static void maxSubArraySumKadane(int []arr){
        int n=arr.length,maxSum=0,currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            maxSum=Math.max(maxSum, currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String []args){

    int arr[] = { 2, -3, -4, 6, 8, -10, 10, 4, 16 };
    maxSubArraySumBruteForce(arr);
    maxSubArraySumKadane(arr);

    }
}