package org.constructions_1c.bsp_pedia.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Tag {

    @Id
    @GeneratedValue
    @Column(name = "TAGS")
    @NotBlank
    private String id;

}
