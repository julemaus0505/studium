package eu.janietz.spring.introduction.fancy;

public class FancyMessagePrinterImpl implements FancyMessagePrinter {

    @Override
    public String printMessage() {
        return "Hello from Introduction!";
    }
}
