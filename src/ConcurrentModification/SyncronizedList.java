package ConcurrentModification;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SyncronizedList{

    private static List<String> list=new ArrayList<>();
    static{

        list.add("run");
        list.add("walk");

        list=Collections.synchronizedList(list);
    }

    public static void main(String[] args) {
        
        Thread thread=new Thread(()->{
            list.add("talk");
            list.add("pray");
            try {
                Thread.sleep(Duration.ofMillis(1000).toMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        list.forEach((ep)->{
            System.out.println(ep);
        
        try {
            Thread.sleep(Duration.ofMillis(3000).toMillis());
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    });

        System.out.println(list);
    }
    
}