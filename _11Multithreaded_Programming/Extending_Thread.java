package _11Multithreaded_Programming;

class NewThread extends Thread{
    Thread t;
    NewThread(String s){
        super(s);       
        System.out.println("Child Thread: "+t);
    }
    @Override
    public void run() {
        try{
            System.out.println("Child Thread starting...");
            for(int i = 5;i>=0;i--){
                System.out.println("Child thread "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("exeption");
        }
        System.out.println("Exiting child Thread.");
    }
}
public class Extending_Thread {
    public static void main(String[] args) {
        NewThread nt = new NewThread("Demo thread");
        nt.start();
        try{
            for(int i = 5;i>=0;i--){
                System.out.println("main thread "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Exeption");
        }
        System.out.println("Exiting main Thread");
    }
}
