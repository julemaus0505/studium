package eu.janietz.spring.introduction;

import eu.janietz.spring.introduction.fancy.FancyMessagePrinter;
import eu.janietz.spring.introduction.fancy.FancyMessagePrinterImpl;
import org.aopalliance.aop.Advice;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloWorldIntroduction {

    @DeclareParents(
            value = "eu.janietz.spring.introduction.HelloWorldService",
            defaultImpl = FancyMessagePrinterImpl.class
    )
    public FancyMessagePrinter fancyMessagePrinter;

}
