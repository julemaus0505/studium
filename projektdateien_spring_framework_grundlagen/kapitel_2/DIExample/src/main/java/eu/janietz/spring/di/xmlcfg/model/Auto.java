package eu.janietz.spring.di.xmlcfg.model;

import eu.janietz.spring.di.xmlcfg.model.fuel.Kraftstoff;

import java.util.List;

public class Auto {

    private String name;
    private Motor motor;
    private Kraftstoff kraftstoff;
    private List<Reifen> reifen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Reifen> getReifen() {
        return reifen;
    }

    public void setReifen(List<Reifen> reifen) {
        this.reifen = reifen;
    }

    public Kraftstoff getKraftstoff() {
        return kraftstoff;
    }

    public void setKraftstoff(Kraftstoff kraftstoff) {
        this.kraftstoff = kraftstoff;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", motor=" + motor +
                ", kraftstoff=" + kraftstoff +
                ", reifen=" + reifen +
                '}';
    }
}
