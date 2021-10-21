package net.snack.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MavenDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenDemoApplication.class, args);
    }

    @RequestMapping
    public String hello() {
        return "hello maven demo";
    }
}
