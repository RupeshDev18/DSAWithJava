package BasicSortingAlgorithm;

public class _2SelectionSort {

    public static void selectionSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }
    public static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        // int arr[]={1,2,3,4,5};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
