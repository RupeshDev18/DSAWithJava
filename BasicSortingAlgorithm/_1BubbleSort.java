package BasicSortingAlgorithm;

public class _1BubbleSort {
    public static void bubbleSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int swaps=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            // System.out.println("Pass "+i);
            if (swaps==0) {
                break;
            }
        }
    }
    public static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[]={7,1,5,3,6,4};
        int arr[]={1,2,3,4,5};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
}
