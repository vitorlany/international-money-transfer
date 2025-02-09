package app.imt.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidFieldException extends GenericException {
    public InvalidFieldException(String message) {
        super(message);
    }
}
