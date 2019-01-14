package com.springapp.dependency;

import com.springapp.dependency.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {
  @Autowired
  Printer printer;

  @Autowired
  MyColor color;

  public static void main(String[] args) {
    SpringApplication.run(DependencyApplication.class, args);
  }

  @Override
  public void run(String... args) {
    printer.log(color.printColor());
  }

}

