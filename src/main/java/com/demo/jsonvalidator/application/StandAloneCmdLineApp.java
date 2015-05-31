package com.demo.jsonvalidator.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Naveen Bensily on 5/30/15.
 */

@ComponentScan(basePackages = "com.demo")
@EnableAutoConfiguration
public class StandAloneCmdLineApp implements CommandLineRunner{


    public static void main(String args[]) {

        SpringApplication.run(StandAloneCmdLineApp.class, args);

    }

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("Entering run *******");

    }
}
