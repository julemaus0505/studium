package eu.janietz.spring.di.xmlcfg.model;

public class Motor {

    private Öl öl;

    public Öl getÖl() {
        return öl;
    }

    public void setÖl(Öl öl) {
        this.öl = öl;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "öl=" + öl +
                '}';
    }
}
