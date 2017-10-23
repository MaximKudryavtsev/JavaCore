import java.util.ArrayList;
import java.util.List;

public class Customer {
    enum TypeCustomer {
        Child, Adult, Retired
    }

    public Integer AmountOfPurchases() {
        final int LOWER_BOUND = 1;
        final int UPPER_BOUND = 10;
        return LOWER_BOUND + (int) (Math.random() * UPPER_BOUND);
    }

    public List<Integer> IndexOfPurchases() {
        final int QUANTITY_OF_PRODUCTS = 13;
        int len = AmountOfPurchases();
        List<Integer> purchases = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            purchases.add(1 + (int) (Math.random() * (QUANTITY_OF_PRODUCTS - 1)));
        }
        return  purchases;
    }
}
