package io.github.onetwostory.salon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Feedback extends BaseEntity {

    private String content;

    @OneToOne
    private Appointment appointment;

}
