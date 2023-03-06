package cashback.api.dao.repository;

import cashback.api.dao.entity.Cashback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CashbackRepository extends JpaRepository<Cashback, Long> {
    Optional<Cashback> getCashbackByIban(Long iban);
}
