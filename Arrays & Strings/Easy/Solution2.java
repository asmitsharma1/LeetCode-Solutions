public class Solution2 {
    public int maxProfit(int[] prices) {
       int s=prices[0];
       int profit=0;
       for(int i=1;i<prices.length;i++){
        if(prices[i]<s){
            s=prices[i];
        }
        else if(prices[i]-s>profit){
            profit=prices[i]-s;
        }
       } 
       return profit;
    }
   


    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] prices = {7,1,5,3,6,4};
        int result = sol.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
