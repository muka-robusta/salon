package io.github.onetwostory.salon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class Client extends User {

    @OneToMany(mappedBy = "client")
    private List<Appointment> appointments;

}
