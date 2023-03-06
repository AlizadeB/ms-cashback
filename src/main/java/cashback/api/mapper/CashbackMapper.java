package cashback.api.mapper;

import cashback.api.dao.entity.Cashback;
import cashback.api.model.dto.CashbackDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CashbackMapper {
    CashbackMapper CASHBACK_MAPPER = Mappers.getMapper(CashbackMapper.class);

    CashbackDto toCashbackDto(Cashback cashback);
}
