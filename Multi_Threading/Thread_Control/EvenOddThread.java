class EvenThread extends Thread{
    public void run(){
        for(int i=2;i<=20;i+=2){
            System.out.println("Even: "+i);
        }
    }
}

class OddThread extends Thread{
    public void run(){
        for(int i=1;i<=20;i+=2){
            System.out.println("Odd: "+i);
        }
    }
}

public class EvenOddThread{
    public static void main(String[] args) throws InterruptedException{
        EvenThread e=new EvenThread();
        OddThread o=new OddThread();
        
        e.start();
        e.join();
        o.start();
        o.join(); 
    }
}