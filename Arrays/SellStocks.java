/**
 * SellStocks
 */
public class SellStocks {
    public static void BuyAndSellStock(int []arr){
        int n=arr.length,maxProfit=0;
        int buyPrice=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }else{
                maxProfit=Math.max(maxProfit, arr[i]-buyPrice);
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        BuyAndSellStock(arr);
    }
}