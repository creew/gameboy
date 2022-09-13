package ru.twentyone.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.EventQueue;

@Configuration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        EventQueue.invokeLater(() -> {

            var ex = ctx.getBean(SwingApp.class);
            ex.setVisible(true);
        });
    }
}
