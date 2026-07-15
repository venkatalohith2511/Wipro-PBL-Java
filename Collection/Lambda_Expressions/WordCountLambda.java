interface WordCount {
    int count(String str);
}

public class WordCountLambda {
    public static void main(String[] args) {
        WordCount wc = (str) -> {
            if(str == null || str.trim().isEmpty()) {
                return 0;
            }
            String[] words = str.trim().split("\\s+");
            return words.length;
        };
        
        String s1 = "Hello World from Lambda";
        String s2 = "Java Programming";
        
        System.out.println("Words in \"" + s1 + "\" : " + wc.count(s1));
        System.out.println("Words in \"" + s2 + "\" : " + wc.count(s2));
    }
}