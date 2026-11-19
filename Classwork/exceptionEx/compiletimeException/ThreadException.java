package exceptionEx.compiletimeException;

import java.time.Duration;

public class ThreadException {
    public static void main(String[] args) {
        System.out.println("Before thread sleep");

        try{
            Thread.sleep(Duration.ofSeconds(5));
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


        System.out.println("After thread sleep");

    }
}
