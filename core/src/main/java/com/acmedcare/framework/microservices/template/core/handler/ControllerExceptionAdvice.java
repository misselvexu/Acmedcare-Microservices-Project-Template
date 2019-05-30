package com.acmedcare.framework.microservices.template.core.handler;

import com.acmedcare.framework.exception.entity.EntityBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * {@link ControllerExceptionAdvice}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-05-30.
 */
@ControllerAdvice
public class ControllerExceptionAdvice {

  @ExceptionHandler(value = MissingServletRequestParameterException.class)
  public ResponseEntity exception1(MissingServletRequestParameterException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(
            EntityBody.<Void, String>builder()
                .message("缺少参数[" + e.getParameterName() + "]")
                .build());
  }

  @ExceptionHandler(value = Exception.class)
  public ResponseEntity exception(Exception e) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(EntityBody.exception(e));
  }
}
