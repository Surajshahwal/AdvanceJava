package Lab6;

public class Demo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        Thread a = new Thread(t1);
        Thread b = new Thread(t2);

        a.setName("Thread1");
        b.setName("Thread2");   

        a.start();
        b.start();

        Thread.currentThread().setName("main Thread");
        for (int i = 61; i <= 80; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

    }
}
