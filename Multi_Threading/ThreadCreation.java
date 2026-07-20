import java.util.*;

class ColorThread implements Runnable{
    String colours[]={"white","blue","black","green","red","yellow"};
    Random r=new Random();
    
    public void run(){
        while(true){
            int index=r.nextInt(colours.length);
            System.out.println(colours[index]);
            if(colours[index].equals("red")){
                System.out.println("Red found. Stopping.");
                break;
            }
            try{
                Thread.sleep(500); // half sec delay
            }catch(InterruptedException e){}
        }
    }
}

public class ThreadCreation{
    public static void main(String[] args){
        Thread t=new Thread(new ColorThread());
        t.start();
    }
}