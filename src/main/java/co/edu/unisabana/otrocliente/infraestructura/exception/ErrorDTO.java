package co.edu.unisabana.otrocliente.infraestructura.exception;

import org.apache.http.HttpStatus;

public class ErrorDTO {


  public String causa;
  public String mensaje;
  public int tipo;

  public ErrorDTO() {
  }

  public ErrorDTO(String causa, String mensaje, int tipo) {
    this.causa = causa;
    this.mensaje = mensaje;
    this.tipo = tipo;
  }
}
