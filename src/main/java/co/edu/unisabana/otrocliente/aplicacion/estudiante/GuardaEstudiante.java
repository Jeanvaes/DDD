package co.edu.unisabana.otrocliente.aplicacion.estudiante;

import co.edu.unisabana.otrocliente.aplicacion.estudiante.port.EstudiantePort;
import co.edu.unisabana.otrocliente.aplicacion.estudiante.port.SigaPort;
import co.edu.unisabana.otrocliente.dominio.Estudiante;

public class GuardaEstudiante {

  EstudiantePort estudiantePort;
  SigaPort sigaPort;

  public void guardarEstudiante(Estudiante estudianteModelo) {
    estudiantePort.guardarEstudiante(estudianteModelo);
    sigaPort.enviarAlSiga(estudianteModelo);

  }
}
