package co.edu.unisabana.otrocliente.infraestructura.sql;

import co.edu.unisabana.otrocliente.aplicacion.estudiante.port.EstudiantePort;
import co.edu.unisabana.otrocliente.dominio.Estudiante;
import co.edu.unisabana.otrocliente.infraestructura.sql.entity.EstudianteEntity;

public class EstudianteAdapter implements EstudiantePort {

  EstudianteRepository estudianteRepository;

  @Override
  public void guardarEstudiante(Estudiante estudiante) {
    estudianteRepository.save(
        new EstudianteEntity(estudiante.getNombre(), estudiante.getFacultad()));
  }
}
