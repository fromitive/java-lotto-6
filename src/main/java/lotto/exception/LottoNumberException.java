package lotto.exception;

import lotto.error.LottoErrorMessage;

public class LottoNumberException extends IllegalArgumentException {
    
    private static final String ERROR_MESSAGE_FORMAT = "[ERROR] %s";
    private LottoErrorMessage errorMessage;

    private LottoNumberException(final LottoErrorMessage errorMessage) {
        super(String.format(ERROR_MESSAGE_FORMAT,errorMessage.getMessage()));
        this.errorMessage = errorMessage;
    }
    
    public static LottoNumberException of(LottoErrorMessage errorMessage){
        return new LottoNumberException(errorMessage);
    }
}