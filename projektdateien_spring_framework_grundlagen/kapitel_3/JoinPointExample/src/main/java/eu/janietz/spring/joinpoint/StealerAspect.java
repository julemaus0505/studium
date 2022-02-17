package eu.janietz.spring.joinpoint;

import eu.janietz.spring.joinpoint.example.BankAccount;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StealerAspect {

    @Autowired
    ApplicationContext context;

    @Autowired
    BankAccount schweizerNummernKonto;

    @Around("execution(* eu.janietz..*.BankAccount.insertMoney(..))")
    public Object stealMoney(ProceedingJoinPoint joinPoint) throws Throwable
    {
        if (joinPoint.getTarget().equals(schweizerNummernKonto)) return joinPoint.proceed();
        double amount = (Double)joinPoint.getArgs()[0];

        System.out.println("Klaue " + amount + "€");
        schweizerNummernKonto.insertMoney(amount);

        //joinPoint.proceed();
        return true;
    }
}
