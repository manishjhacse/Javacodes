import java.util.*;

public class fractionalKnapsack {
    private static double getMaxProfit(itemValue[] arr, int capacity) {
        // sorting items by profit/weight ratio
        Arrays.sort(arr, new Comparator<itemValue>() {
            @Override
            public int compare(itemValue item1, itemValue item2) {
                double cpr1 = Double.valueOf(item1.profit / item1.weight);
                double cpr2 = Double.valueOf(item2.profit / item2.weight);
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }


            
        });

        double totalValue = 0;
        for (itemValue i : arr) {
            int currWt = i.weight;
            int currPrft = i.profit;
            if (capacity - currWt >= 0) {
                capacity = capacity - currWt;
                totalValue = totalValue + currPrft;
            } else {
                double fraction = ((double) capacity / (double) currWt);
                totalValue += currPrft * fraction;
                capacity = (int) (capacity - (currWt * fraction));
                break;
            }

        }
        return totalValue;

    }

    static class itemValue {
        int profit, weight;

        public itemValue(int p, int wt) {
            weight = wt;
            profit = p;
        }
    }

    public static void main(String[] args) {
        itemValue[] arr = {
                new itemValue(25, 5),
                new itemValue(75, 10),
                new itemValue(100, 12),
                new itemValue(60, 4),
                new itemValue(45, 7),
                new itemValue(90, 9),
                new itemValue(30, 3)
        };
        int capacity = 37;
        double maxProfit = getMaxProfit(arr, capacity);
        System.out.println("Maximum profit will be: " + maxProfit);
    }
}
