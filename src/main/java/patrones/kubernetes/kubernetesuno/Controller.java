package patrones.kubernetes.kubernetesuno;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import patrones.kubernetes.kubernetesuno.DTO.PersonaDTO;
import patrones.kubernetes.kubernetesuno.ORM.Persona;
import patrones.kubernetes.kubernetesuno.PersonaService;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class Controller {

    @Autowired
    private PersonaService personaRepository;

        @PostMapping("/crearPersona")
    public Persona crearPersona(@RequestBody PersonaDTO personaDTO) {
        Persona persona = new Persona();
        persona.setNombre(personaDTO.getNombre());
        return personaRepository.save(persona);
    }

    @GetMapping("/obtenerTodos")
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Persona obtenerPorId(@PathVariable String id) {
        return personaRepository.findById(id).orElse(null);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Aplicación funcionando correctamente!";
    }
    @DeleteMapping("/eliminarPersona/{id}")
    public void eliminarPersona(@PathVariable String id) {
        personaRepository.deleteById(id);
    }
}
