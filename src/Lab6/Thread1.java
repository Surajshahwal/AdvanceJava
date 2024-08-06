package Lab6;


public class Thread1 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " : " + i);
        }
    }
}
