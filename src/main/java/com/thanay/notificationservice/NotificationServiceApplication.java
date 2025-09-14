package com.thanay.notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NotificationServiceApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(NotificationServiceApplication.class, args);

        NotificationManager manager = ctx.getBean(NotificationManager.class);
        manager.sendNotification("Hello, this is a test message!");

        ctx.close();
    }
}
