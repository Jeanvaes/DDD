package co.edu.unisabana.otrocliente.infraestructura.exception;

public class DiscountExceededException extends RuntimeException {

  public DiscountExceededException(int descuento) {
    super("Descuento enviado" + descuento + " supera el maximo permitido");
  }
}
