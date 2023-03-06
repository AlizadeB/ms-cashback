package cashback.api.service;

import cashback.api.dao.entity.Cashback;
import cashback.api.dao.repository.CashbackRepository;
import cashback.api.exception.IbanNotFoundException;
import cashback.api.exception.constant.ErrorCode;
import cashback.api.mapper.CashbackMapper;
import cashback.api.model.dto.CashbackDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CashbackService {
    private final static CashbackMapper mapper = CashbackMapper.CASHBACK_MAPPER;

    private final CashbackRepository cashbackRepository;

    public CashbackDto getCashbackByIban(Long iban) {
        Cashback cashback = cashbackRepository.getCashbackByIban(iban).orElseThrow(
                () -> IbanNotFoundException.of(ErrorCode.IBAN_NOT_FOUND, iban)
        );
        return mapper.toCashbackDto(cashback);
    }
}
