package eu.janietz.spring.pointcut.introduction;

public class ProxyInterfaceImpl implements ProxyInterface {
    public String getProxyMessage() {
        return "Hello from Proxy!";
    }
}
