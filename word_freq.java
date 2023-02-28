import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class  word_freq {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("D:\\word.txt"));
        TreeMap<String, Integer> map = new TreeMap<>();
        String str=br.readLine();
        String[] arr =str.split(" ");

        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println("The Map is : "+map);

        }
    }

