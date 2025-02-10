package patrones.kubernetes.kubernetesuno;

import patrones.kubernetes.kubernetesuno.ORM.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaService extends MongoRepository<Persona, String> {
}