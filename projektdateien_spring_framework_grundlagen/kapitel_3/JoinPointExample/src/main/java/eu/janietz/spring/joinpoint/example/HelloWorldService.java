package eu.janietz.spring.joinpoint.example;

import org.springframework.stereotype.Component;

@Component("helloWorldService")
public class HelloWorldService {

    public String getMessage()
    {
        return "Hello World!";
    }

}
