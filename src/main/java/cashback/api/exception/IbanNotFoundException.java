package cashback.api.exception;

import cashback.api.exception.constant.ErrorCode;

import java.text.MessageFormat;

public class IbanNotFoundException extends CommonException{
    public IbanNotFoundException(String message) {
        super(ErrorCode.IBAN_NOT_FOUND, message);
    }

    public static IbanNotFoundException of(String message, Object... args) {
        return new IbanNotFoundException(MessageFormat.format(message, args));
    }
}
