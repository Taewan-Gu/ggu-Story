package taewan.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taewan.server.domain.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}
