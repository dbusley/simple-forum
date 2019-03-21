package me.dougbusley.simpleforum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.UriTemplate;
import org.springframework.hateoas.hal.CurieProvider;
import org.springframework.hateoas.hal.DefaultCurieProvider;

@SpringBootApplication
public class SimpleForumApplication {

  public static void main(String[] args) {
    SpringApplication.run(SimpleForumApplication.class, args);
  }
}
