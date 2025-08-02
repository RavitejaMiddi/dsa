package stack;

public class FinalPrices {
    public static void main(String[] args) {
        for(int val: finalPrices(new int[]{8,4,6,2,3})){
            System.out.println(val);
        }
    }
    public static int[] finalPrices(int[] prices) {
        int[] finalPrice = new int[prices.length];

        for(int i=0;i<prices.length;i++){
            int updated = 0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] <= prices[i] && j > i){
                    finalPrice[i] =  Math.abs(prices[j] - prices[i]);
                    updated++;
                    break;
                }
            }if (updated == 0)
               finalPrice[i] = prices[i];
        }

        return finalPrice;
    }
}
