import java.util.*;

public class SupermarketSimulator {
    public static void main(String[] args){
        //Time t = new Time(5);
        //t.start();
        Products p = new Products();
        p.PrintList();
        Customer c = new Customer();
        List<Integer> purch = c.IndexOfPurchases();
        for (int l : purch) {
            System.out.println(p.ChosenProduct(l));
        }
    }
}
