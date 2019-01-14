package com.com.reddit;

import com.com.reddit.model.Post;
import com.com.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Access;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

  @Autowired
  PostRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}

