package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Ejercicio 1
        Saludo saludo = (Saludo) context.getBean("saludo");

        String text = saludo.imprimirSaludo();
        System.out.println(text);
        //Ejercicio 2
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.notificationService.imprimirSaludo());

    }
}
