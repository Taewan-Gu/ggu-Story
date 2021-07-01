package taewan.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taewan.server.domain.Period;
import taewan.server.repository.PeriodRepository;
import taewan.server.repository.PlanRepository;
import taewan.server.repository.TodolistRepository;

import javax.transaction.Transactional;

@Transactional
@Service
public class PlannerService {

    private final PeriodRepository periodRepository;
    private final PlanRepository planRepository;
    private final TodolistRepository todolistRepository;

    @Autowired
    public PlannerService(PeriodRepository periodRepository, PlanRepository planRepository, TodolistRepository todolistRepository) {
        this.periodRepository = periodRepository;
        this.planRepository = planRepository;
        this.todolistRepository = todolistRepository;
    }

    public Long period_create(Period period) {
        periodRepository.save(period);
        return period.getId();
    }

}
