package taewan.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taewan.server.domain.Period;

public interface PeriodRepository extends JpaRepository<Period, Long> {
}