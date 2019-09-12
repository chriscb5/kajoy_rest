package main.java.test;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    private final CursoRepository repository;

    public CursoController(CursoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cursos")
    List<Curso> all() {
        return repository.findAll();
    }

    @PostMapping("/cursos")
    Curso newCurso(@RequestBody Curso newCurso) {
        return repository.save(newCurso);
    }

    @GetMapping("/cursos/{id}")
    Curso one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new CursoNotFoundException(id));
    }
}
