package org.constructions_1c.bsp_pedia.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "METHOD_VER")
@Data
public class MethodVersion extends Description{

    @NotBlank
    @Size(min = 3)
    @Column(name = "NAME")
    private String name;

//    @ElementCollection
//    @JoinColumn(name = "METHOD_VER_ID", nullable = false, referencedColumnName = "ID")
//    private Set<Parameter> params;

}
