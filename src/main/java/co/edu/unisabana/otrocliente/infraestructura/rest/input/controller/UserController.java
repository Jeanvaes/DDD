package co.edu.unisabana.otrocliente.infraestructura.rest.input.controller;

import co.edu.unisabana.otrocliente.aplicacion.estudiante.GuardaEstudiante;
import co.edu.unisabana.otrocliente.dominio.Estudiante;
import co.edu.unisabana.otrocliente.infraestructura.YmsFeign;
import co.edu.unisabana.otrocliente.infraestructura.rest.input.controller.dto.EstudianteDTO;
import co.edu.unisabana.otrocliente.infraestructura.exception.DiscountExceededException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  public static final int DESCUENTO_MAXIMO = 10;
  @Value("${estudiante}")
  private String propiedad;

  private GuardaEstudiante guardaEstudiante;

  private YmsFeign ymsClientl;

  public UserController(YmsFeign ymsClientl) {
    this.ymsClientl = ymsClientl;
  }

  @GetMapping("/clave")
  public String clave() {
    return propiedad;
  }

  @GetMapping("/invoca-yms/{descuento}")
  public String llamarYMS(@PathVariable int descuento) {
    if (descuento > DESCUENTO_MAXIMO) {
      throw new DiscountExceededException(descuento);
    }

    ymsClientl.checkin();
    return "Llame";
  }

  @GetMapping("/guardar")
  public String guardar(EstudianteDTO dto) {
    guardaEstudiante.guardarEstudiante(new Estudiante(dto.nombre, dto.facultad));
    return "Llame";
  }
}
