package Lab5;
public class ThreadA extends Thread {
    int sum = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            sum += i;
        }

    }
}


class Main {
    public static void main(String[] args) {
        ThreadA t = new ThreadA();
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("sum of 1 to 100 : "+t.sum);

    }
}