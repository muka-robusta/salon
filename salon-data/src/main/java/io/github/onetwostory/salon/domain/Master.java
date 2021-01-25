package io.github.onetwostory.salon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "masters")
public class Master extends User {

    @Column(name = "rating")
    private BigDecimal rating;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "master")
    private List<Appointment> appointments;

}
