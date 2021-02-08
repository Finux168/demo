package com.finux.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("---------------");

//        FutureTask<String> futureTask = new FutureTask<>(()->{
//            TimeUnit.SECONDS.sleep(5);
//            return "hello fgd!";
//        });
//        Thread thread = new Thread(futureTask);
//        thread.start();
//        System.out.println("get方法之前"+new Date().toString());
//        String s = futureTask.get();
//        System.out.println("get方法之后"+new Date().toString());
//        System.out.println(s);
        //jrebel.qekang.com

        SpringApplication.run(DemoApplication.class, args);
    }

}
