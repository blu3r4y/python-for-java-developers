import java.util.*;

class PriceTax {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(12.3, 5.2, 8.7, 1.2, 8.0);
        List<Double> gross = new ArrayList<Double>();

        for (double price : prices) {
            if (price > 8) {
                gross.add(price * 1.2);
            }
        }

        for (double price : gross) {
            System.out.println(price);
        }
    }
}
