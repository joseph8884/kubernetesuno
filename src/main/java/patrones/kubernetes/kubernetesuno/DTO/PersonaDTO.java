package patrones.kubernetes.kubernetesuno.DTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonaDTO {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
