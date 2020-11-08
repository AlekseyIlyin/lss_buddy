package org.constructions_1c.bsp_pedia.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "DSP_VER")
@Data
public class BspVersion extends Description{

    public BspVersion(String version) {
        this.version = version;
    }

    @Column(name = "VERSION")
    private String version;

}
