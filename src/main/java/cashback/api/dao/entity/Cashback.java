package cashback.api.dao.entity;

import cashback.api.model.enums.Currency;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "cashback")
public class Cashback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "iban")
    private Long iban;

    @Column(name = "cashback")
    private BigDecimal cashback;

    @Column(name = "currency")
    private Currency currency;
}
