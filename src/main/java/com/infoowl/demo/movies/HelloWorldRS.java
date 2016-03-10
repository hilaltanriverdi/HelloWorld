package com.infoowl.demo.movies;

/**
 * Created by hilal on 3/3/2016.
 */
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRS {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public HelloWorld greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new HelloWorld(counter.incrementAndGet(),
                String.format(template, name));
    }
}
