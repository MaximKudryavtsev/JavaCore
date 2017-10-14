import java.io.*;
import java.util.*;

public class Address {
    public static void StringToArray(String str, List<Integer> list) {
        char separator = '.';
        String line = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
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

    public static void main(String[] args) throws IOException {
        String ip = args[0];
        String mask = args[1];
        List<Integer> ipArr = new ArrayList<>();
        List<Integer> maskArr = new ArrayList<>();
        StringToArray(ip, ipArr);
        StringToArray(mask, maskArr);

        List<Integer> address = new ArrayList<>();
        address = getNetAddress(ipArr, maskArr);
        for (int t : address) {
            System.out.print(Integer.toString(t) + '.');
        }
    }
}
