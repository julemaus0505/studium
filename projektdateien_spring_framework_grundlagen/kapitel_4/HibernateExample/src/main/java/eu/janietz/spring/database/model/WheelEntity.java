package eu.janietz.spring.database.model;

import javax.persistence.*;

@Entity
public class WheelEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;

    public void setCar(CarEntity car) {
        this.car = car;
    }

    @ManyToOne()
    private CarEntity car;

    @Override
    public String toString() {
        return "WheelEntity{" +
                "id=" + id +
                '}';
    }
}
