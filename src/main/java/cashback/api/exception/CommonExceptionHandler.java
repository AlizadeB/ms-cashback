package cashback.api.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static cashback.api.exception.constant.ErrorCode.UNEXPECTED_INTERNAL_ERROR;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class CommonExceptionHandler {

    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(IbanNotFoundException.class)
    public CommonErrorResponse handleIbanNotFoundException(IbanNotFoundException ex) {
        return new CommonErrorResponse(ex.getErrorCode(), ex.getMessage());
    }

    @ResponseStatus(INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public CommonErrorResponse handleAll(Exception ex) {
        ex.printStackTrace();
        String errMsg = "Unexpected internal server error";
        return new CommonErrorResponse(UNEXPECTED_INTERNAL_ERROR, errMsg);
    }
}
