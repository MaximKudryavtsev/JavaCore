import java.io.*;

public class TopWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
        /*String str;
        String res = "";
        while((str = reader.readLine()) != null){
            res += str;
        }
*/
        int c;
        int l = 0;
        String str = "";
        while ((c = reader.read()) != -1) {
            if ((c == 10)) {
                continue;
            } else if (c == 13) {
                str += " ";
                System.out.print(" ");
            } else {
                str;
                System.out.print((char)c);
                l++;
            }
        }
        System.out.println(l);
    }
}