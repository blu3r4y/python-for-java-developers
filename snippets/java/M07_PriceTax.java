import inout.Out;

class PriceTax {
    public static void main(String[] args) {
        double[] prices = {12.3, 5.2, 8.7, 1.2, 8.0};
        double[] gross = new double[5];

        for (int i = 0; i < prices.length; i++) {
            gross[i] = prices[i] * 1.2;
        }

        for (double price : gross) {
            Out.println(price);
        }
    }
}
