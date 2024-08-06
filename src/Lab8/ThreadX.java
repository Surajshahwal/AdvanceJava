package Lab8;

public class ThreadX extends Thread{
    @Override
    public void run() {
      for (int i=0; i<=10; i++){
          System.out.println(i);
         try {
             Thread.sleep(500);
         }catch (Exception e){
             e.printStackTrace();
         }
      }
    }
}
 class Main    {
     public static void main(String[] args) {
         ThreadX t=new ThreadX();
        t.start();


     }
}
