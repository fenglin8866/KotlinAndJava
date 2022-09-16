package org.example;

import org.example.base.concurrent.TestCompletedFuture;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //TestMethodReferences.test1();
        //TestMethodReferences.test0();
        //TestFunctionProgress.test1();
       /* System.out.println("main");
        TestCompletedFuture.test();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        /*Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("1");
        stringSet.forEach(System.out::println);*/
        Map<String, String> map = new HashMap<>();
        map.putIfAbsent("a", "1");
        map.putIfAbsent("b", "2");
        map.putIfAbsent("c", "3");
        map.putIfAbsent("a", "4");
        Set<String> stringSet = new HashSet<>();
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println("k=" + s + " v=" + s2);
                if (s.equals("a") || s.equals("b"))
                    stringSet.add(s);
            }
        });
        stringSet.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                map.remove(s);
            }
        });
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println("k=" + s + " v=" + s2);

            }
        });

    }
}

