package org.constructions_1c.bsp_pedia.repo;

import org.constructions_1c.bsp_pedia.domain.BspVersion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BspVersionRepo extends CrudRepository<BspVersion, Long> {
    List<BspVersion> findByVersionLikeIgnoreCase (String version);
}
