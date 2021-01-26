package io.github.onetwostory.salon.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "service_options")
public class ServiceOption extends BaseEntity {

    private String name;
    private String description;
    private BigDecimal price;

    @ManyToMany(mappedBy = "serviceOptionList")
    private List<Appointment> appointments;

    @ManyToMany(mappedBy = "serviceOptionList")
    private List<Appointment> appointments;
}
