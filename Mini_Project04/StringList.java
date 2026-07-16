import java.util.*;

public class StringList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        while(true){
            System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
            System.out.print("Enter your choice :\n");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.print("Enter the item to be inserted:\n");
                String s=sc.next();
                list.add(s);
                System.out.println("Inserted successfully");
            }
            else if(ch==2){
                System.out.print("Enter the item to be searched:\n");
                String s=sc.next();
                if(list.contains(s)) System.out.println("Item found");
                else System.out.println("Item not found");
            }
            else if(ch==3){
                System.out.print("Enter the item to be deleted:\n");
                String s=sc.next();
                if(list.remove(s)) System.out.println("Deleted successfully");
                else System.out.println("Item not found");
            }
            else if(ch==4){
                System.out.println(list);
            }
            else if(ch==5){
                break;
            }
        }
    }
}