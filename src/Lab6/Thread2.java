package Lab6;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i=21; i<=60; i++){
            String tName=Thread.currentThread().getName();
            System.out.println(tName +" : "+ i);
        }
    }
}
