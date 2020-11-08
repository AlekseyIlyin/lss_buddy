package org.constructions_1c.bsp_pedia.controller;

import lombok.extern.slf4j.Slf4j;
import org.constructions_1c.bsp_pedia.domain.BspVersion;
import org.constructions_1c.bsp_pedia.domain.Tag;
import org.constructions_1c.bsp_pedia.repo.BspVersionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("rest")
@Slf4j
public class Classifiers {

    @Autowired
    BspVersionRepo bspVersionRepo;

    public List<Map<String, String>> bspVersions = new ArrayList<Map<String,String>>() {{
        add(new HashMap<String, String>() {{ put("id", "1"); put("text", "first"); }});
        add(new HashMap<String, String>() {{ put("id", "2"); put("text", "second"); }});
        add(new HashMap<String, String>() {{ put("id", "3"); put("text", "third"); }});
    }};

    @CrossOrigin
    @GetMapping(value = "bspversion/look")
    public List<BspVersion> lookBspVersion(
            @RequestParam("maxRows") Integer maxRows,
            @RequestParam("term") String partName
    ) {
        log.info("Max rows: " + maxRows + " look text: " + partName);
        return bspVersionRepo.findByVersionLikeIgnoreCase(partName);

//        return bspVersions.stream()
//
//                .filter(t -> t.get("text").contains(lookText))
//                .collect(Collectors.toList());
    }

    @CrossOrigin
    @PostMapping(value = "bspversion/add")
    public void addBspVersion(
            @RequestParam("term") String version
    ) {
        log.info("look text: " + version);
        bspVersionRepo.save(new BspVersion(version));
    }

    @CrossOrigin
    @GetMapping(value = "bspversion/all")
    public List<Map<String, String>> listGetAll() {
        log.info("get all");
        return bspVersions;
    }

}
