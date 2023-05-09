package co.edu.unisabana.otrocliente.infraestructura.sql;

import co.edu.unisabana.otrocliente.infraestructura.sql.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Integer> {

}
