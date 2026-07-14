import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String inputFile = args[0];
        String outputFile = args[1];
        
        try {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            Map<String, Integer> map = new TreeMap<>();
            
            String line;
            while((line = br.readLine())!= null) {
                String[] words = line.split("\\s+");
                for(String word : words) {
                    if(!word.equals("")) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }
            br.close();
            
            FileWriter fw = new FileWriter(outputFile);
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }
            fw.close();
            
        } catch(IOException e) {
            System.out.println("File not found");
        }
    }
}