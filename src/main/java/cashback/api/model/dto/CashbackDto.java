package cashback.api.model.dto;

import cashback.api.model.enums.Currency;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CashbackDto {
    @NotNull
    private Long iban;
    private BigDecimal amount;
    private Currency currency;
}
