package exceptionEx.compiletimeException;

import java.time.Duration;

/**
 * Good to debug if you want to remember
 * */
public class MutiThreadException {
    public static void main(String[] args) {
//        here we have 2 threads (main, Thread-0 (child thread))
        System.out.println("Main thread started..");


//        Step 1:- child thread sleep for 10 sec
        Thread thread = new Thread(()->{
            System.out.println("Thread going to sleep");

//           Step 4:- so after 2 sec of main thread wake up. here child thread throw exception (InterruptedException)
            try {
                Thread.sleep(Duration.ofSeconds(10));
                System.out.println("Sleep completed...");
            }
            catch (InterruptedException e){
                System.out.println("Thread interrupted!");
                System.out.println(e);
            }
        });

        thread.start();

//        Step 2:- here main thread is sleep for 2 sec
        try{
            Thread.sleep(Duration.ofSeconds(2));
        } catch (InterruptedException e){
            e.printStackTrace();
        }

//        Step 3:- when main thread finish sleep for 2 sec. Then interrupt the child thread
        thread.interrupt();

        System.out.println("Main thread completed");
    }
}
