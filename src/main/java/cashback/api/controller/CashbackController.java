package cashback.api.controller;

import cashback.api.model.dto.CashbackDto;
import cashback.api.service.CashbackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("cashbacks/")
public class CashbackController {

    private final CashbackService cashbackService;

    public CashbackController(CashbackService cashbackService) {
        this.cashbackService = cashbackService;
    }

    @GetMapping("{iban}")
    public ResponseEntity<CashbackDto> getCashbackByIban(@PathVariable Long iban) {
        return ResponseEntity.ok(cashbackService.getCashbackByIban(iban));
    }
}
