package co.edu.unisabana.otrocliente.dominio;

public class Estudiante {


  private String nombre;
  private String facultad;

  public Estudiante(String nombre, String facultad) {
    this.nombre = nombre;
    this.facultad = facultad;
  }

  public String getNombre() {
    return nombre;
  }

  public String getFacultad() {
    return facultad;
  }
}
