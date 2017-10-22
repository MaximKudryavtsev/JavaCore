import java.io.*;
import java.util.*;

public class Products {

    public List<String> ProductsList() {
        List<String> list = new ArrayList<String>();
        list.add("Milk");
        list.add("Bread");
        list.add("Meat");
        list.add("Soda");
        list.add("Cigarettes");
        list.add("Beer");
        list.add("Better");
        list.add("Cucumber");
        list.add("Chocolate");
        list.add("Onion");
        list.add("Potato");
        list.add("Tomato");
        list.add("Mayonnaise");
        return list;
    }

    public List<String> PriceList() {
        List<String> list = new ArrayList<String>();
        list.add("50");
        list.add("20");
        list.add("200");
        list.add("50");
        list.add("70");
        list.add("65");
        list.add("60");
        list.add("30");
        list.add("85");
        list.add("40");
        list.add("50");
        list.add("40");
        list.add("50");
        return list;
    }

    public List<String> QuantityList() {
        List<String> list = new ArrayList<String>();
        List<String> products = ProductsList();
        int len = products.size();
        int quantity;
        for (int i = 0; i < len; i++) {
            quantity = 3 + (int) (Math.random() * len);
            list.add(Integer.toString(quantity));
        }
        return list;
    }

    public void PrintList() {
        List<String> products = ProductsList();
        List<String> prices = PriceList();
        List<String> quantity = QuantityList();
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("Product #" + (i + 1) + ": Name: " + products.get(i) + " | Price: " + prices.get(i) + " | Quantity: " + quantity.get(i));
            //System.out.println("------------------------------------------------------------");
        }
    }
}
