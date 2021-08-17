package taewan.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taewan.server.domain.Period;
import taewan.server.domain.Plan;

import java.util.List;

public interface PlanRepository extends JpaRepository<Plan, Long> {

    List<Plan> findByPeriod(Period period);
}
