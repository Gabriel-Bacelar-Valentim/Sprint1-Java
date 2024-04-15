package br.com.fiap.sprintplantech.resource;

import br.com.fiap.sprintplantech.entity.Solo;
import br.com.fiap.sprintplantech.repository.SoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/solo")
public class SoloResource {

    @Autowired
    private SoloRepository repo;

    @GetMapping
    public List<Solo> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Solo findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Solo save(@RequestBody Solo solo) {
        solo.setId(null);
        return repo.save(solo);
    }
}