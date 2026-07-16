import java.util.*;

class Card{
    char s;
    int n;
    Card(char s,int n){
        this.s=s; this.n=n;
    }
}

public class GroupCards{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        java.util.TreeMap<Character,ArrayList<Card>> map=new java.util.TreeMap<>();
        
        System.out.println("Enter Number of Cards :");
        int N=sc.nextInt();
        
        for(int i=1;i<=N;i++){
            System.out.println("Enter card "+i+":");
            char s=sc.next().charAt(0);
            int n=sc.nextInt();
            if(!map.containsKey(s))
                map.put(s,new ArrayList<>());
            map.get(s).add(new Card(s,n));
        }
        
        for(char key:map.keySet()){
            ArrayList<Card> list=map.get(key);
            int sum=0;
            System.out.println("Symbol: "+key);
            for(Card c:list){
                System.out.println(c.s+" "+c.n);
                sum+=c.n;
            }
            System.out.println("Count: "+list.size());
            System.out.println("Sum: "+sum);
            System.out.println();
        }
    }
}