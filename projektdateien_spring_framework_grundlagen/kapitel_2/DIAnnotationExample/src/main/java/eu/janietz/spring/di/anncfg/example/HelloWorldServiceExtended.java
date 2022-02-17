package eu.janietz.spring.di.anncfg.example;

public class HelloWorldServiceExtended extends HelloWorldService {

    @Override
    public String getMessage() {
        return "Hello World Extended!";
    }
}
