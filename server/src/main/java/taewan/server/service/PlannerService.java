package taewan.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taewan.server.domain.Period;
import taewan.server.domain.Plan;
import taewan.server.domain.Todolist;
import taewan.server.repository.PeriodRepository;
import taewan.server.repository.PlanRepository;
import taewan.server.repository.TodolistRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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


    public Optional<Period> period_findById(Long period_id) {
        return periodRepository.findById(period_id);
    }

    public Optional<Plan> plan_findById(Long plan_id) {
        return planRepository.findById(plan_id);
    }

    public Long period_create(Period period) {
        periodRepository.save(period);
        return period.getId();
    }

    public Long plan_create(Plan plan) {
        planRepository.save(plan);
        return plan.getId();
    }

    public Long todolist_create(Todolist todolist) {
        todolistRepository.save(todolist);
        return todolist.getId();
    }

    public List<Period> period_all() {
        return periodRepository.findAll();
    }

    public List<Plan> plan_all() {
        return planRepository.findAll();
    }

    public List<Todolist> todolist_all() {
        return todolistRepository.findAll();
    }

    public List<Todolist> todolist_findByPlan(Long plan_id) {
        return todolistRepository.findByPlan(plan_findById(plan_id).get());
    }

    public List<Plan> plan_findByPeriod(Long period_id) {
        return planRepository.findByPeriod(period_findById(period_id).get());
    }
}
