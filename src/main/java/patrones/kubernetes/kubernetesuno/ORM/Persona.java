package patrones.kubernetes.kubernetesuno.ORM;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personas")
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    private String id;
    private String nombre;
}