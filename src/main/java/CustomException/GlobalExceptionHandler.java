package CustomException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import resources.ResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(CommonException.class)
  public ResponseEntity<ResponseDTO> handleCustomException(CommonException ex) {
    ResponseDTO errorResponseDTO = new ResponseDTO(ex.getHttpStatus().value(), ex.getMessage());
    return ResponseEntity.status(ex.getHttpStatus()).body(errorResponseDTO);
  }

}