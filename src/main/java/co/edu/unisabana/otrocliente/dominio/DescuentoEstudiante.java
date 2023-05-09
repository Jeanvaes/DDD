package co.edu.unisabana.otrocliente.dominio;

import co.edu.unisabana.otrocliente.dominio.exception.DiscountNegativeException;

public class DescuentoEstudiante {


  private DescuentoPort descuentoPort;

  public int getDescuento(String nombre) {
    if (nombre.startsWith("D")) {
      return 10;
    } else {
      int descuento = descuentoPort.getDescuento(nombre.charAt(0));
      if (descuento < 0) {
        throw new DiscountNegativeException(descuento, nombre.charAt(0));
      }
      return descuento;
    }
  }

}
