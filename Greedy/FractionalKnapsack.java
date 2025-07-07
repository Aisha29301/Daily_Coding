import java.util.*;

class FractionalKnapsack {

    static class Item {
        double value;
        double weight;
        double ratio;

        Item(double value, double weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = value / weight;
        }
    }

    public static double fractionalKnapsack(double[] values, double[] weights, int n, double capacity) {
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // Sort items by ratio descending
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double[] x = new double[n];
        Arrays.fill(x, 0.0);

        double u = capacity;
        int i;

        for (i = 0; i < n; i++) {
            if (items[i].weight > u) {
                break;
            }
            x[i] = 1.0;
            u -= items[i].weight;
        }

        if (i < n) {
            x[i] = u / items[i].weight;
        }

        double totalProfit = 0.0;
        for (int j = 0; j < n; j++) {
            totalProfit += items[j].value * x[j];
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double[] profit = new double[n];
        double[] weights = new double[n];

        System.out.println("Enter Profit of items:");
        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextDouble();
        }

        System.out.println("Enter weights of items:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextDouble();
        }

        System.out.print("Enter capacity of knapsack: ");
        double capacity = sc.nextDouble();

        double maxProfit = fractionalKnapsack(profit, weights, n, capacity);

        System.out.println("Maximum value in knapsack = " + maxProfit);
    }
}
