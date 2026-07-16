import java.util.ArrayList;
import java.util.List;

public class StringOperations {

    public static List<String> processStrings(String s1, String s2) {
        List<String> outputList = new ArrayList<>();

        StringBuilder op1Result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                op1Result.append(s2);
            } else {
                op1Result.append(s1.charAt(i));
            }
        }
        outputList.add(op1Result.toString());

        int firstOccurence = s1.indexOf(s2);
        int lastOccurence = s1.lastIndexOf(s2);
        boolean appearsMoreThanOnce = firstOccurence != -1 && firstOccurence != lastOccurence;

        if (appearsMoreThanOnce) {
            String reversedS2 = new StringBuilder(s2).reverse().toString();
            String op2Result = s1.substring(0, lastOccurence) + reversedS2 + s1.substring(lastOccurence + s2.length());
            outputList.add(op2Result);
        } else {
            outputList.add(s1 + s2);
        }

        if (appearsMoreThanOnce) {
            String op3Result = s1.substring(0, firstOccurence) + s1.substring(firstOccurence + s2.length());
            outputList.add(op3Result);
        } else {
            outputList.add(s1);
        }

        int s2Length = s2.length();
        int midPoint = (s2Length % 2 == 0) ? (s2Length / 2) : (s2Length / 2) + 1;
        String frontHalf = s2.substring(0, midPoint);
        String backHalf = s2.substring(midPoint);
        outputList.add(frontHalf + s1 + backHalf);

        String charsToReplace = "[" + s2 + "]";
        outputList.add(s1.replaceAll(charsToReplace, "*"));

        return outputList;
    }

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";

        List<String> results = processStrings(s1, s2);
        
        System.out.print("Output:{");
        for (int i = 0; i < results.size(); i++) {
            System.out.print("\"" + results.get(i) + "\"");
            if (i < results.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}