package org.constructions_1c.bsp_pedia.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "MODULE")
@Data
public class Module extends Description{

    @NotBlank
    @Size(min = 3)
    @Column(name = "NAME")
    private String name;

    @Column(name = "SERVER")
    private boolean server;

    @Column(name = "KLIENT")
    private boolean klient;

    @Column(name = "PRIVILEG")
    private boolean privileg;
}
