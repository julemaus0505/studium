package eu.janietz.spring.di.anncfg;

import eu.janietz.spring.di.anncfg.example.HelloWorldServiceExtended;
import eu.janietz.spring.di.anncfg.scan.HelloWorldPrinter;
import eu.janietz.spring.di.anncfg.example.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "eu.janietz.spring.di.anncfg.scan")
public class SpringConfiguration {

    @Bean(name = "helloWorldService")
    public HelloWorldService helloWorldService(){return new HelloWorldService();};

    @Bean(name = "helloWorldServiceExtended")
    public HelloWorldServiceExtended helloWorldServiceExtended() {return new HelloWorldServiceExtended();};
}
