public class SimpleThread{
    public static void main(String[] args){
        Thread t1=new Thread();
        Thread t2=new Thread();
        
        t1.setName("Scooby");
        t2.setName("Shaggy");
        
        t1.start();
        t2.start();
        
        System.out.println("Thread 1 name: "+t1.getName());
        System.out.println("Thread 2 name: "+t2.getName());
    }
}