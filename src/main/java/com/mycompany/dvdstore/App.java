package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

        //new FileWriter(file,true);

        //ApplicationContext context2=new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        MovieController movieController=context.getBean(MovieController.class);

        movieController.addUsingConsole();

    }
}