package co.edu.unisabana.otrocliente.infraestructura.exception;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorAdvice {

/*
  @ExceptionHandler(DiscountExceededException.class)
  public ResponseEntity erroresDescuento(DiscountExceededException error) {
    ErrorDTO problem = new ErrorDTO("Problemas con el numero enviado",
        error.getMessage(), HttpStatus.SC_BAD_REQUEST);
    return new ResponseEntity<ErrorDTO>(problem);
  }
  */

}
