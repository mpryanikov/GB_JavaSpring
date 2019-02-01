package ru.mpryanikov.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("client-bean.xml");
        Client client = (Client) context.getBean("client");
        client.getRifle();
        client.getShot();
    }
}
