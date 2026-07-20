class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(getName()+" Priority: "+getPriority()+" Count: "+i);
        }
    }
}

public class ThreadPriorities{
    public static void main(String[] args){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        
        t1.setName("MAX-Thread");
        t2.setName("MIN-Thread");
        t3.setName("NORM-Thread");
        
        t1.setPriority(Thread.MAX_PRIORITY); 
        t2.setPriority(Thread.MIN_PRIORITY); 
        t3.setPriority(Thread.NORM_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
    }
}