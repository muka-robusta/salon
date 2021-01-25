package io.github.onetwostory.salon.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "service_options")
public class ServiceOption extends BaseEntity {

    private String name;
    private String description;
    private BigDecimal price;

}
