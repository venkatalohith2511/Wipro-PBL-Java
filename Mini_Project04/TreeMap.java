import java.util.*;

class Card{
    char s;
    int n;
    Card(char s,int n){
        this.s=s; this.n=n;
    }
}

public class TreeMap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        java.util.TreeMap<Character,Card> map=new java.util.TreeMap<>();
        int cnt=0;
        while(map.size()<4){
            System.out.println("Enter a card :");
            char s=sc.next().charAt(0);
            int n=sc.nextInt();
            cnt++;
            if(!map.containsKey(s)){
                map.put(s,new Card(s,n));
            }
        }
        System.out.println("Four symbols gathered in "+cnt+" cards");
        System.out.println("Cards in Set are");
        for(Card c:map.values()){
            System.out.println(c.s+" "+c.n);
        }
    }
}