class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++) {
           if(i>0) {
              int[] subArray = java.util.Arrays.copyOfRange(prices,0,i);
              int min = java.util.Arrays.stream(subArray).min().getAsInt();
              int currentProfit = prices[i] - min;
              if(currentProfit>maxProfit) {
                maxProfit = currentProfit;
              }
            } 
            
        }

        return maxProfit;
        
    }
}
