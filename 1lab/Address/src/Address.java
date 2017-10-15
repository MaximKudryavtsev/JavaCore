import java.io.*;
import java.util.*;

public class Address {
    public static final char SEPARATOR = '.';
    public static void StringToList(String str, List<Integer> list) {
        String line = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == SEPARATOR) {
                list.add(Integer.parseInt(line));
                line = "";
                i++;
            }
            line += str.charAt(i);
        }
        list.add(Integer.parseInt(line));
    }

    public static List<Integer> getNetAddress(List<Integer> ipArr, List<Integer> maskArr) {
        List<Integer> address = new ArrayList<>();
        for (int i = 0; i < ipArr.size(); i++) {
            address.add(ipArr.get(i) & maskArr.get(i));
        }
        return address;
    }

    public static boolean CheckInputStrings(String ip, String mask) {
        boolean statement;
        if (isIP(ip) && isIP(mask))
            statement = true;
        else
            statement = false;
        return statement;
    }

    public static boolean isIP(String str)
    {
        return str.matches("([0-9]{1,3}[\\.]){3}[0-9]{1,3}");
    }

    public static void main(String[] args) throws IOException {
        String ip = args[0];
        String mask = args[1];
        if (CheckInputStrings(ip, mask)) {
            List<Integer> ipArr = new ArrayList<>();
            List<Integer> maskArr = new ArrayList<>();
            StringToList(ip, ipArr);
            StringToList(mask, maskArr);
            List<Integer> address = getNetAddress(ipArr, maskArr);
            for (int t : address) {
                System.out.print(Integer.toString(t) + SEPARATOR);
            }
        } else {
            System.out.println("Input data wrong!");
        }
    }
}
