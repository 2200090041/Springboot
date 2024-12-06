package com.klu.Lab4task2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        Journey journey = context.getBean(Journey.class);
        journey.start();
    }
}
