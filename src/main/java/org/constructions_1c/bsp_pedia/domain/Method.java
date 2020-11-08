package org.constructions_1c.bsp_pedia.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "METHODS")
@Data
public class Method extends Description{

    @ElementCollection
    @CollectionTable(name="METHOD_TAGS") // use default join column name
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Tag> tags;

    @JoinColumn(name = "ID_MODULE", referencedColumnName = "ID")
    @ManyToOne
    private Module module;

    @ElementCollection
    @JoinColumn(name = "METHOD_VER_ID", nullable = false, referencedColumnName = "ID")
    private Set<MethodVersion> methodVersions;

}
