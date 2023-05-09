package co.edu.unisabana.otrocliente.dominio.exception;

public class DiscountNegativeException extends RuntimeException {

  public DiscountNegativeException(int discount, char character) {
    super("Descuento negativo de " + discount + " No es permitido para la letra " + character);
  }
}
