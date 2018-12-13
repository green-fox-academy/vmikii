package com.nemvagom.simba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SimbaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SimbaApplication.class, args);
  }
}
