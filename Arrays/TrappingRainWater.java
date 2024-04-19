public class TrappingRainWater {
    public static void trappedRainWater(int []arr){
        int n=arr.length,trappedWater=0;
        // calculating left max boundary
        int []leftMaxBoundary=new int[n];
        leftMaxBoundary[0]=arr[0];
        
        for(int i=1;i<n;i++){
            leftMaxBoundary[i]=Math.max(arr[i], leftMaxBoundary[i-1]);
        }
        // calculating right max boundary
        int []rightMaxBoundary=new int[n];
        rightMaxBoundary[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMaxBoundary[i]=Math.max(rightMaxBoundary[i+1], arr[i]);
        }
        // calculating trapped rain water
        for(int i=0;i<n;i++){
            trappedWater+=Math.max(Math.min(leftMaxBoundary[i], rightMaxBoundary[i])-arr[i], 0);
        }
        System.out.println(trappedWater);

    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        trappedRainWater(arr);
    }
}
