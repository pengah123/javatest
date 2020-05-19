package month03.d29;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DemoIO {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\basic\\123.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\basic\\123new.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }
        for (String s : map.keySet()) {
            String value = map.get(s);
            line = s + "." + value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();

    }
}
